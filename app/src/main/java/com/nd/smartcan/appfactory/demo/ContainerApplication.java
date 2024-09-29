package com.nd.smartcan.appfactory.demo;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;

import com.google.android.play.core.splitcompat.SplitCompat;
import com.nd.android.smartcan.datacollection.DataCollection;
import com.nd.component.utils.MainComponentUtils;
import com.nd.sdp.module.improc.ImProcUtils;
import com.nd.sdp.uc.agreement.net.utils.NdUcPreferencesConfig;
import com.nd.smartcan.appfactory.ComponentEntryMgr;
import com.nd.smartcan.appfactory.CustomUncaughtExceptionHandler;
import com.nd.smartcan.appfactory.businessInterface.IComponentEntryInterface;
import com.nd.smartcan.appfactory.component.ComponentEntry;
import com.nd.smartcan.appfactory.delegate.AppCertUtils;
import com.nd.smartcan.appfactory.delegate.ClassDelegate;
import com.nd.smartcan.appfactory.delegate.ContainerApplicationDelegate;
import com.nd.smartcan.commons.util.language.StringUtils;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by cq on 2015/5/4.<br/>
 * <p>
 * 描述： 框架初始化部分.
 */
public final class ContainerApplication extends Application implements IComponentEntryInterface {

    private static final String DEX_DIR = "ndPlugins";
    private static final String TAG = "ContainerApplication";

    private boolean isInit;

    @Override
    protected void attachBaseContext(Context base) { /*inject*/
		AppStatUtils.onAppAttachBaseContextStart(this);
        super.attachBaseContext(base);
        Log.w("appPerformance", "App attachBaseContext isBundleEnabled() " + isBundleEnabled());

        AppCertUtils.setBeginTimeMills(System.currentTimeMillis());
        MainComponentUtils.setBeginTimeMills(System.currentTimeMillis());
        if (isBundleEnabled()) {
            SplitCompat.install(this);
        }
//        else {
//            if (isPluginEnabled()) {
//                try {
//                    attachPlugin(base);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        if (isMainProcess()) {
            // 只有主进程才安装全局异常处理钩子，非主进程不做处理
            CustomUncaughtExceptionHandler.setup(this);
        }

        // if (isMainProcess()){
        //     CustomUncaughtExceptionHandler.debugMakeCrashAtAppCreate();
        // }

        AppCertUtils.setProviderBeginTimeMills(System.currentTimeMillis());

        Log.w("appPerformance", " end App attachBaseContext "); /*inject*/
		AppStatUtils.onAppAttachBaseContextEnd(this);
    }

    @Override
    public void onCreate() {
        Log.w("appPerformance", " provider create finished!");
        AppCertUtils.setProviderEndTimeMills(System.currentTimeMillis());//这边只能单纯设置一个时间，由于这时候有可能还在合并包mini进程
        Log.w("appPerformance", " check app  onCreate ");
 /*dynamic inject*/
        super.onCreate(); /*inject*/
		AppStatUtils.onAppCreateEnd(this);
		DynamicAccessUtil.sContext=this;
        DataCollection.setContext(this);
        NdUcPreferencesConfig.setContext(this);
//        if (!isBundleEnabled() && isPluginEnabled()) {
//            try {
//                createPlugin();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        if (!ClassDelegate.isFactoryInitialProc(this)) {
            // 非应用工厂初始化的进程
            Log.i("appPerformance", " application 非应用工厂初始化的进程 退出初始化 ");
            return;
        }
        initFlutterPlugn();
        ApplicationInitUtils.setComponentEntryInterface(this);
        if (!ApplicationInitUtils.isAlreadyShowAgreement() && ApplicationInitUtils.isAgreeLauncher()){
            Log.d(TAG, "还未展示过隐私协议页面，需要在引导页中弹窗，不直接初始化application ");
            return;
        }
        Log.i("appPerformance", "application 执行初始化");
        ApplicationInitUtils.initApplication(this);
        isInit = true;
    }

    /**
     * 初始化flutter的EngineGroup
     */
    private void initFlutterPlugn(){
        Class<?> cls = null;
        try {
            cls = Class.forName("com.nd.sdp.android.flutter.plugin.ApfFlutterManager");

            Method m = cls.getDeclaredMethod("initFlutterEngineGroup", Context.class); //获取方法
            m.invoke(cls, this);

        } catch (Exception e) {
            
            Log.e(TAG, "初始化flutter失败，无flutter功能, "+ e.getMessage());
          
        }
    }
    


    


//    private void attachPlugin(Context base) {
//        try {
//            Class<?> wrapperClass = Class.forName("com.nd.sdp.replugin.host.wrapper.manager.RepluginWrapper");
//            Object[] objs = wrapperClass.getEnumConstants();
//            if (objs.length > 0) {
//                Object instance = objs[0];
//                Method attachBaseContext = wrapperClass.getMethod("attachBaseContext", Application.class);
//                attachBaseContext.invoke(instance, this);
//            }
//        } catch (Exception e) {
//            Log.w("AppFacotoryPlugin", "You can ignore this log since this is only prepared for the pluginable app");
//            e.printStackTrace();
//        }
//    }


//    private void createPlugin() {
//        try {
//            Class<?> wrapperClass = Class.forName("com.nd.sdp.replugin.host.wrapper.manager.RepluginWrapper");
//            Object[] objs = wrapperClass.getEnumConstants();
//            if (objs.length > 0) {
//                Object instance = objs[0];
//                Method attachBaseContext = wrapperClass.getMethod("onCreate");
//                attachBaseContext.invoke(instance);
//            }
//        } catch (Exception e) {
//            Log.w("AppFacotoryPlugin", "You can ignore this log since this is only prepared for the pluginable app");
//            e.printStackTrace();
//        }
//    }


    @Override
    public void onTerminate() {
        Log.w(TAG, "onTerminate() is called");
        if (isInit) {
            ClassDelegate.onTerminate(this);
        }
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        Log.w(TAG, "onLowMemory() is called");
        if (isInit) {
            ClassDelegate.onLowMemory(this);
        }
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Log.w(TAG, "onTrimMemory() is called" + level);
        if (isInit) {
            ClassDelegate.onTrimMemory(level, this);
        }
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (isInit && !ContainerApplicationDelegate.quickStart(this)) {
            ClassDelegate.onConfigurationChanged(newConfig);
            Log.d("loadDex", "ClassDelegate onConfigurationChanged");
        } else {
            Log.d("loadDex", "in quickStart, cannot call ClassDelegate onConfigurationChanged");
        }
    }


    /**
     * 判断是否是主进程
     *
     * @return
     */
    private boolean isMainProcess() {
        String curProcName = ImProcUtils.getCurrentProcessName(this);
        String mainProcName = this.getPackageName();

        if (StringUtils.isEmpty(curProcName)) {
            Log.w(TAG, "isMainProcess: failed to get current process name");
            return false;
        }

        if (curProcName.equals(mainProcName)) {
            return true;
        }

        return false;
    }

    /**
     * 是否开启 Android App Bundles 功能
     */
    private boolean isBundleEnabled() {
        try {
            Log.i(TAG, "BuildConfig.ANDROID_APP_BUNDLES " + BuildConfig.ANDROID_APP_BUNDLES);
            return BuildConfig.ANDROID_APP_BUNDLES;
            //buildConfigField("Boolean","ANDROID_APP_BUNDLES": rootProject.isBundleEnabled)
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 是否开启插件化功能
     */
//    private boolean isPluginEnabled() {
//        try {
//            JSONObject jsonObject = new JSONObject(BuildConfig.GRADLE_PROPERTIES);
//            return jsonObject.optBoolean("gradle_property_android_plugin_enabled", true);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return true;
//    }
    @Override
    public List<ComponentEntry> getComponentEntryList(String env) {
        if (isInit && !TextUtils.isEmpty(env)) {
            List<ComponentEntry> componentEntries = ComponentEntryMgr.instance().getComponentEntryList(env);
            if (componentEntries != null && componentEntries.size() > 0) {
                return ComponentEntryMgr.instance().getComponentEntryList(env);
            }
        }
        return null;
    }


    public void setInit(boolean init) {
        isInit = init;
    }

    public boolean isInit() {
        return isInit;
    }
}
