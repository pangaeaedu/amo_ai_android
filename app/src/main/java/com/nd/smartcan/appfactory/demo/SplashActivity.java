package com.nd.smartcan.appfactory.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;

import com.nd.apf.update.Constant;
import com.nd.sdp.uc.agreement.NdUcAgreementActivity;
import com.nd.sdp.uc.agreement.net.utils.NdUcPreferencesConfig;
import com.nd.smartcan.appfactory.AppFactory;
import com.nd.smartcan.appfactory.CustomUncaughtExceptionHandler;
import com.nd.smartcan.appfactory.delegate.ClassDelegate;
import com.nd.smartcan.appfactory.delegate.CustomSchemeURIUtil;
import com.nd.smartcan.appfactory.delegate.SplashActivityDelegate;

import androidx.annotation.Nullable;
import androidx.core.splashscreen.SplashScreen;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/**
 * 这个主要是欢迎界面，
 * 目的是为了减少白屏
 * 和初始界面的图片可设置。
 * -------------------
 * 为了解决隐私协议同意之前执行不安全的方法，将uc的隐私协议弹窗提到最前面
 * 同意之后在进行相应的初始化
 */
public class SplashActivity extends FragmentActivity {
	@Override
	protected void onRestart() { /*inject*/
		AppStatUtils.onFirstPageRestart(this);
		super.onRestart();
	}
	@Override
	protected void onStart() { /*inject*/
		AppStatUtils.onFirstPageStart(this);
		super.onStart();
	}
	@Override
	protected void onStop() { /*inject*/
		AppStatUtils.onFirstPageStop(this);
		super.onStop();
	}



    private final static int ND_UC_AGREE_CODE = 2001;

    private static final String TAG = "SplashActivity";
    private Context mContext;
    private BroadcastReceiver mReceiver;

    // 引导页原有的初始化是否已完成
    private boolean isSplashInit;
    // 是否有配置不同意隐私协议跳转页面
    boolean isConfigDisagreePage;


    @Override
    protected void onCreate(Bundle savedInstanceState) { /*inject*/
		AppStatUtils.onFirstPageCreate(this);
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        splashScreen.setKeepOnScreenCondition(() -> true);

        // 这里需要置空协议名称点击等
        NdUcPreferencesConfig.getInstance().resetAgreementDataState();

        boolean isLauncher = ApplicationInitUtils.isAgreeLauncher();
        Log.d(TAG, "引导页是否有配置用户协议：" + isLauncher);
        if (isLauncher) {
            isConfigDisagreePage = ApplicationInitUtils.isConfigDisagreePage();
            Log.d(TAG, "是否有配置不同意跳转页面：" + isConfigDisagreePage);
        }

        if (isLauncher && !ApplicationInitUtils.isAlreadyShowAgreement()) {
            NdUcAgreementActivity.Companion.startActivity(SplashActivity.this,isConfigDisagreePage,ND_UC_AGREE_CODE);
            return;
        }
        Log.d(TAG, " 是否已同意隐私协议： " + ApplicationInitUtils.isAgree());
        initSplash();
    }

    private void initApplication() {
        // 原来application需要初始化的部分初始化过就无需初始化
        if (!(getApplication() instanceof ContainerApplication) || ((ContainerApplication) getApplication()).isInit()) {
            Log.w("appPerformance", " application 已初始化，无效重复执行 ");
            return;
        }
        if (!ClassDelegate.isFactoryInitialProc(getApplication())) {
            // 非应用工厂初始化的进程
            Log.i("appPerformance", " splashActivity 非应用工厂初始化的进程 退出初始化 ");
            return;
        }
        Log.i("appPerformance", " splashActivity 中初始化application ");
        ApplicationInitUtils.initApplication(getApplication());

        if (getApplication() instanceof ContainerApplication) {
            ((ContainerApplication) getApplication()).setInit(true);
        }
    }


    private void initSplash() {

        Log.w("appPerformance", " begin SplashActivity  onCreate ");
        if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
            // 这里直接finish的原本用意是为了防止闪屏页面重复显示
            // 现在通过浏览器打开应用存在部分机型和浏览器适配问题，其传递过来的intent flag自动带上了值且不为0
            // 导致闪屏页直接finish，而无法走后续解析scheme并跳转至指定页面的流程
            // 为了解决该问题，尝试在这里就解析scheme

            String customNextPath = CustomSchemeURIUtil.getSchemeUri(this);
            Log.d(TAG, "customNextPath = " + customNextPath);
            if (!TextUtils.isEmpty(customNextPath)) {
                AppFactory.instance().getApfExtendBusiness().getApfSchemeUri().setSchemePage(customNextPath);
            } else {
                finish();
                return;
            }
        }
        mContext = this;
        Log.w("appPerformance", " end SplashActivity  onCreate ");

        if (CustomUncaughtExceptionHandler.isLastStartupCrashed()) {
            this.finish();
            return;
        }

        SplashActivityDelegate.onCreate(this, R.string.android_template_boot_page_not_correct, R.string.android_template_confirm);

        mReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (context == null || intent == null || TextUtils.isEmpty(intent.getAction())) {
                    return;
                }

                if (TextUtils.equals(intent.getAction(), Constant.ACTION_UPDATE_ACTIVITY_DESTROYED)) {
                    // 升级弹窗界面销毁，也把闪屏页销毁
                    SharedPreferences sp = getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
                    sp.edit().remove(Constant.KEY_IS_GO_INTERRUPT_PAGE).apply();
                    finish();
                }
            }
        };
        IntentFilter filter = new IntentFilter();
        filter.addAction(Constant.ACTION_UPDATE_ACTIVITY_DESTROYED);
        LocalBroadcastManager.getInstance(this).registerReceiver(mReceiver, filter);

        isSplashInit = true;
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 隐私协议同意或者取消回调
        if (requestCode == ND_UC_AGREE_CODE && data != null) {
            boolean isAgree = data.getExtras().getBoolean("isAgree");
            if (isAgree) {
                // 同意之后需要发送同意事件，这里做保存记录，等uc初始化时，同意发送
                NdUcPreferencesConfig.getInstance().sendAgreeEvent(true);
                Log.i(TAG, "======同意隐私协议，进入初始化=====");
            } else if (!isConfigDisagreePage) {
                Log.i(TAG, "======不同意隐私协议，且无配置不同意跳转页面，退出应用=====");
                if (!isFinishing()) {
                    finish();
                }
                System.exit(0);
                return;
            }
            initApplication();
            initSplash();
            // 设置已显示过引导页隐私协议
            NdUcPreferencesConfig.getInstance().setAlreadyShowAgreement(true);

        }
    }


    @Override
    protected void onPause() {
        super.onPause();


        // 如果下一个要展示的界面是升级弹窗则不销毁自己
        SharedPreferences sp = getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
        boolean isGoInterruptPage = sp.getBoolean(Constant.KEY_IS_GO_INTERRUPT_PAGE, false);
        Log.d(TAG, "isGoInterruptPage = " + isGoInterruptPage);
        if (isGoInterruptPage) {
            return;
        }

        if (!isSplashInit) {
            return;
        }
        SplashActivityDelegate.onPause(this);
//        //只有在goPage对方成功打开新界面时候才把自己finish，避免由于配置goPageUrl 错误没有打开新界面，而这边又把自己关闭，被误解为闪退
//        Log.w("SplashActivity", "onPause finish self ");
//        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!isSplashInit) {
            return;
        }

        SplashActivityDelegate.onResume(this); /*inject*/
		AppStatUtils.onFirstPageResume(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (isSplashInit) {
            SplashActivityDelegate.onKeyDown(keyCode, event);
        }


        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onDestroy() {
        if (!isSplashInit) {
            super.onDestroy();
            return;
        }

        if (mReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(mReceiver);
            mReceiver = null;
        }

        super.onDestroy();
    }


}
