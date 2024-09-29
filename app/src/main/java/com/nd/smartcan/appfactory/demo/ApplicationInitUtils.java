package com.nd.smartcan.appfactory.demo;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

import com.nd.apf.update.CommonTools;
import com.nd.apf.update.Constant;
import com.nd.apf.update.trigger.UpdateTrigger;
import com.nd.sdp.uc.agreement.net.utils.NdUcAgreementConfigUtils;
import com.nd.sdp.uc.agreement.net.utils.NdUcPreferencesConfig;
import com.nd.smartcan.appfactory.AppFactory;
import com.nd.smartcan.appfactory.CustomUncaughtExceptionHandler;
import com.nd.smartcan.appfactory.businessInterface.IComponentEntryInterface;
import com.nd.smartcan.appfactory.delegate.AppCertUtils;
import com.nd.smartcan.appfactory.delegate.ClassDelegate;
import com.nd.smartcan.appfactory.delegate.IAppCertificate;
import com.nd.smartcan.appfactory.generate.ConfigFactory;
import com.nd.smartcan.appfactory.keying.ProtocolConstant;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 应用初始化工具
 */
public class ApplicationInitUtils {
   private static final String TAG = "ApplicationInitUtils";
   private final static String AGREE_LAUNCHER = "cmp://com.nd.sdp.uc_component/user_agreement";
      private final static String LOGIN_PAGE = "cmp://com.nd.sdp.component.nduccomponent/login";
   public static final String G_ZHCN_PAGES_PAGES = "com.nd.smartcan.appfactory.generate.G_zhCN_pages_pages";
   public static final String G_EN_PAGES_PAGES = "com.nd.smartcan.appfactory.generate.G_en_pages_pages";

   private static IComponentEntryInterface iComponentEntryInterface;

   /**
    * 设置 IComponentEntryInterface
    * @param entryInterface
    */
   public static void setComponentEntryInterface(IComponentEntryInterface entryInterface){
      iComponentEntryInterface = entryInterface;
   }


   public static void initApplication(final Application application){
      if(application == null){
         Log.w("appPerformance", " application is null ");
         return;
      }
      // 在4.4以下，系统需要合并包。需要等待合并完成后才能调用其他方法。
      AppCertUtils.saveProviderTime();
      Log.w("appPerformance", " begin app  onCreate ");
      /**scj-native-modify-AppFactoryCertificate-begin**/
      IAppCertificate iCertificate = new IAppCertificate() {

         private AppFactoryCertificate m = new AppFactoryCertificate();

         /**scj-native-modify-AppFactoryCertificate-end**/
         @Override
         public String getPublicKey() {
            return m.getPublicKey();
         }

         @Override
         public String getSerialNumber() {
            return m.getSerialNumber();
         }
      };

      /**scj-native-add-AppFactoryCertificate-begin**/


      /**scj-native-add-AppFactoryCertificate-end**/


      // 产品可以配置是否启用我们拼装门户&应用工厂提供的应用更新能力（一经设置则永不再变）
      if (UpdateTrigger.isAllowed()) {
         // 应用升级初始化
         UpdateTrigger.init(application);
         if (CustomUncaughtExceptionHandler.isLastStartupCrashed()) {
            CustomUncaughtExceptionHandler.gotoSafeModeUpgradePage(null);
            return;
         }
         // 触发应用升级
         if(UpdateTrigger.isUINotRunningTop(application.getApplicationContext())) {
            //bugfix:https://pms.101.com/index.php?m=bug&f=edit&bugID=517013
            //部分设备从最近应用列表里移除应用并不能完全杀死应用进程
            //导致应用重启后application的生命周期无法走到
            //升级弹框无法被调用
            //但是闪屏页的生命周期有调用
            //所以这里补一个检测升级
            Log.i(TAG,"触发应用升级");
            // 触发应用升级
            UpdateTrigger.beginAutoUpdate(application.getApplicationContext());
         }
      }

      //初始化CsSelfImageLoader
      //CsSelfImageLoader.getInstance().init(this);
      setStrictMode();

      AppFactory.instance().setOption(ProtocolConstant.IS_OPEN_BUNDLE, BuildConfig.ANDROID_APP_BUNDLES);
      AppFactory.instance().setJsonFactory(new ConfigFactory());
      setGradleProperty();
      //ComponentEntryMgr.instance();
      ClassDelegate.onCreate(application, iCertificate);
      if (iComponentEntryInterface != null){
         Log.w("appPerformance", "setComponentEntryInterface");
         AppFactory.instance().setComponentEntryInterface(application.getClass().getSimpleName(), iComponentEntryInterface);
      } else {
         Log.w("appPerformance", " iComponentEntryInterface is null ");
      }
      iComponentEntryInterface = null;

      Log.w("appPerformance", " end app  onCreate ");
   }


   private static void setStrictMode(){
      //如果没有开启严格模式，这边就不用进行设置.
      if (BuildConfig.StrictMode) {
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE, BuildConfig.StrictMode);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_ACTIVITY_LEAKS, BuildConfig.StrictMode_ActivityLeaks);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_CLEARTEXT_NETWORK, BuildConfig.StrictMode_CleartextNetwork);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_CONTENT_URI_WITHOUT_PERMISSION, BuildConfig.StrictMode_ContentUriWithoutPermission);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_CUSTOM_SLOW_CALLS, BuildConfig.StrictMode_CustomSlowCalls);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_DISK_READ, BuildConfig.StrictMode_DiskRead);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_DISK_WRITE, BuildConfig.StrictMode_DiskWrite);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_FILE_URI_EXPOSURE, BuildConfig.StrictMode_FileUriExposure);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_LEAKED_CLOSABLE_OBJECTS, BuildConfig.StrictMode_LeakedClosableObjects);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_LEAKED_REGISTRATION_OBJECTS, BuildConfig.StrictMode_LeakedRegistrationObjects);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_LEAKED_SQLLITE_OBJECTS, BuildConfig.StrictMode_LeakedSqlLiteObjects);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_NETWORK, BuildConfig.StrictMode_Network);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_RESOURCE_MISMATCHES, BuildConfig.StrictMode_ResourceMismatches);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_PENALTY_DIALOG, BuildConfig.StrictMode_PenaltyDialog);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_PENALTY_DROPBOX, BuildConfig.StrictMode_PenaltyDropBox);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_PENALTY_FLASH_SCREEN, BuildConfig.StrictMode_PenaltyFlashScreen);
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE_NON_SDK_DETECT, BuildConfig.StrictMode_DetectNonSdkApiUsage);
      } else {
         AppFactory.instance().setOption(ProtocolConstant.OPEN_STRICTMODE, false);
      }
   }

   private static void setGradleProperty() {
      try {
         Log.d(TAG, "BuildConfig.GRADLE_PROPERTIES = " + BuildConfig.GRADLE_PROPERTIES);
         JSONObject jsonObject = new JSONObject(BuildConfig.GRADLE_PROPERTIES);
         if (jsonObject.length() > 0) {
            Map<String, Object> map = new HashMap<>();
            Iterator<String> it = jsonObject.keys();
            while (it.hasNext()) {
               String key = it.next();
               map.put(key, jsonObject.get(key));
            }
            AppFactory.instance().setOption("GRADLE_PROPERTIES", map);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
               Log.d(TAG, "key = " + entry.getKey() + ", value = " + entry.getValue());
            }
         }
      } catch (JSONException e) {
         e.printStackTrace();
      }
   }


   /**
    * 引导页是否配置同意隐私协议页面
    * @return
    */
   public static boolean isAgreeLauncher(){
      Map<String, Object> config =  NdUcAgreementConfigUtils.getMapFromGenerateConfig("com.nd.smartcan.appfactory.generate.G_app_config");
      if (config != null && config.get("launcher") != null) {
         String launcher = config.get("launcher").toString();
         if (!TextUtils.isEmpty(launcher) && launcher.equals(AGREE_LAUNCHER)){
            return true;
         }
      }
      Log.w(TAG," 引导页未配置隐私协议页面 ");

      return false;
   }

   public static boolean isAgree(){
      boolean isAgree = NdUcPreferencesConfig.getInstance().agreeAgreement();
      return isAgree;
   }


   /**
    * 引导页是否已显示过隐私协议弹窗
    * 已同意过（升级的情况），或者已弹窗过则不在显示
    * @return
    */
   public static boolean isAlreadyShowAgreement(){
      return isAgree() || NdUcPreferencesConfig.getInstance().isAlreadyShowAgreement();
   }




   /**
    * 是否有配置不同意页面跳转
    * @return true:有， false：无
    */
   public static boolean isConfigDisagreePage(){
      String key = "agreement_refuse_page";
      Map<String, Object> properties = getUcPageProperties(G_ZHCN_PAGES_PAGES);
      String disagreePage = "";
      if (properties != null && properties.get(key) != null && !TextUtils.isEmpty(properties.get(key).toString())) {
         disagreePage = String.valueOf(properties.get(key));
      } else {
         properties = getUcPageProperties(G_EN_PAGES_PAGES);
         if (properties != null && properties.get(key) != null && !TextUtils.isEmpty(properties.get(key).toString())) {
            disagreePage = String.valueOf(properties.get(key));
         }
      }
      Log.i(TAG,"isConfigDisagreePage 不同意跳转页面："+disagreePage);
      return !TextUtils.isEmpty(disagreePage);
   }


   /**
    * 获取page.json文件下uc组件属性信息
    * @param className
    * @return
    */
   private static Map<String, Object> getUcPageProperties(String className) {
      Map<String,Object> map = NdUcAgreementConfigUtils.getMapFromGenerateConfig(className);
      if (map != null) {
         Map<String,Object> ucMap = (Map<String, Object>) map.get(LOGIN_PAGE);
         if (ucMap != null){
            return(Map<String, Object>) ucMap.get("properties");
         }
      }
      return null;
   }

}
