package com.nd.smartcan.appfactory.demo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.nd.smartcan.commons.util.logger.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;

/**
 * system工具类
 */
public final class NdSysUtils {
    static final String TAG = "NdSysUtils";

    /**
     * 指定包含程序是否运行在前台
     *
     * @param aContext
     *            context
     * @param aPackageName
     *            pkg name
     * @return true表示运行在前台，反之不是
     */
    public static boolean isAppBackgroundRunning(Context aContext, String aPackageName) {
        if(null == aContext || null == aContext.getApplicationContext()){
            Logger.w(TAG,"null == aContext || null == aContext.getApplicationContext()");
            return false;
        }
        ActivityManager activityManager = (ActivityManager) aContext.getApplicationContext()
                .getSystemService(Context.ACTIVITY_SERVICE);
        KeyguardManager keyguardManager = (KeyguardManager) aContext.getApplicationContext()
                .getSystemService(Context.KEYGUARD_SERVICE);

        if (activityManager == null) {
            return false;
        }
        // get running application processes
        List<ActivityManager.RunningAppProcessInfo> processList = activityManager.getRunningAppProcesses();
        for (ActivityManager.RunningAppProcessInfo process : processList) {
            Log.e(TAG, "running process : " + process.processName);
            if (process.processName.startsWith(aPackageName)) {
                boolean isBackground = process.importance != ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND
                        && process.importance != ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE;
                boolean isLockedState = keyguardManager.inKeyguardRestrictedInputMode();
                Log.e(TAG, "running process background: " + isBackground);
                if (isBackground || isLockedState) { //SUPPRESS CHECKSTYLE
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

//    public static String getTelService() {
//        TelephonyManager telManager = (TelephonyManager) BdApplicationWrapper.getInstance()
//                .getSystemService(Context.TELEPHONY_SERVICE);
//        if (telManager != null) {
//            String telService = telManager.getSimOperator();
//            if ("46000".equals(telService) || "46002".equals(telService) || "46007".equals(telService)) {
//                // 移动
//                return "china mobile";
//            } else if ("46001".equals(telService)) {
//                // 联通
//                return "china unicom";
//            } else if ("46003".equals(telService)) {
//                // dianxin
//                return "china telecom";
//            }
//        }
//        return "net_no";
//    }


    /**
     * 关闭硬件加速
     *
     * @param aView
     *            关闭硬件加速
     */
    @SuppressLint({ "InlinedApi", "NewApi" })
    public static void drawOnDalvik(View aView) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            aView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
    }

    /**
     * 注入jar
     *
     * @param aApp
     *            application object
     * @param aLibPath
     *            lib path
     * @return inject result
     */
    public static InjectResult inject(Application aApp, String aLibPath) {
        boolean hasBaseDexClassLoader = true;
        try {
            Class.forName("dalvik.system.BaseDexClassLoader");
        } catch (ClassNotFoundException e) {
            hasBaseDexClassLoader = false;
        }

        Log.w(TAG, "dalvik.system.BaseDexClassLoader is found  "+hasBaseDexClassLoader);
        return injectAboveEqualApiLevel14(aApp, aLibPath);

    }

    /**
     * api >= 14时，注入jar
     *
     * @param aApp
     *            application object
     * @param aLibPath
     *            lib path
     * @return inject object
     */
    private static InjectResult injectAboveEqualApiLevel14(Application aApp, String aLibPath) {
        ClassLoader classLoader = aApp.getClassLoader();
        DexClassLoader dexClassLoader = new DexClassLoader(aLibPath, aApp.getDir("dex", 0).getAbsolutePath(),
                aLibPath, aApp.getClassLoader());
        InjectResult result = null;
        try {
            Object dexElements = combineArray(getDexElements(getPathList(classLoader)),
                    getDexElements(getPathList(dexClassLoader)));

            Object pathList = getPathList(classLoader);

            setField(pathList, pathList.getClass(), "dexElements", dexElements);
        } catch (IllegalArgumentException e) {
            result = makeInjectResult(false, e);
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            result = makeInjectResult(false, e);
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            result = makeInjectResult(false, e);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            result = makeInjectResult(false, e);
            e.printStackTrace();
        }
        if (result == null) {
            result = makeInjectResult(true, null);
        }
        return result;
    }

    /**
     * set field
     *
     * @param oObj
     *            object
     * @param aCl
     *            class
     * @param aField
     *            field
     * @param value
     *            value
     * @throws NoSuchFieldException
     *             NoSuchFieldException
     * @throws IllegalArgumentException
     *             IllegalArgumentException
     * @throws IllegalAccessException
     *             IllegalAccessException
     */
    private static void setField(Object oObj, Class<?> aCl, String aField, Object value)
            throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field localField = aCl.getDeclaredField(aField);
        localField.setAccessible(true);
        localField.set(oObj, value);
    }

    /**
     * @param oObj
     *            object
     * @param aCl
     *            class
     * @param aField
     *            field
     * @return field
     * @throws NoSuchFieldException
     *             NoSuchFieldException
     * @throws IllegalArgumentException
     *             IllegalArgumentException
     * @throws IllegalAccessException
     *             IllegalAccessException
     */
    private static Object getField(Object oObj, Class<?> aCl, String aField) throws NoSuchFieldException,
            IllegalArgumentException, IllegalAccessException {
        Field localField = aCl.getDeclaredField(aField);
        localField.setAccessible(true);
        return localField.get(oObj);
    }

    /**
     * combine array
     *
     * @param aArrayLhs
     *            array
     * @param aArrayRhs
     *            array
     * @return array
     */
    private static Object combineArray(Object aArrayLhs, Object aArrayRhs) {
        Class<?> localClass = aArrayLhs.getClass().getComponentType();
        int i = Array.getLength(aArrayLhs);
        int j = i + Array.getLength(aArrayRhs);
        Object result = Array.newInstance(localClass, j);
        for (int k = 0; k < j; ++k) {
            if (k < i) {
                Array.set(result, k, Array.get(aArrayLhs, k));
            } else {
                Array.set(result, k, Array.get(aArrayRhs, k - i));
            }
        }
        return result;
    }

    /**
     * append for array
     *
     * @param aArray
     *            array
     * @param aValue
     *            value
     * @return new array
     */
    private static Object appendArray(Object aArray, Object aValue) {
        Class<?> localClass = aArray.getClass().getComponentType();
        int i = Array.getLength(aArray);
        int j = i + 1;
        Object localObject = Array.newInstance(localClass, j);
        for (int k = 0; k < j; ++k) {
            if (k < i) {
                Array.set(localObject, k, Array.get(aArray, k));
            } else {
                Array.set(localObject, k, aValue);
            }
        }
        return localObject;
    }

    /**
     * make a inject result
     *
     * @param aResult
     *            result
     * @param aT
     *            throwable
     * @return inject result
     */
    public static InjectResult makeInjectResult(boolean aResult, Throwable aT) {
        InjectResult ir = new InjectResult();
        ir.mIsSuccessful = aResult;
        ir.mErrMsg = (aT != null ? aT.getLocalizedMessage() : null);
        return ir;
    }

    /**
     * @param aBaseDexClassLoader
     *            BaseDexClassLoader
     * @return path list
     * @throws IllegalArgumentException
     *             IllegalArgumentException
     * @throws NoSuchFieldException
     *             NoSuchFieldException
     * @throws IllegalAccessException
     *             IllegalAccessException
     * @throws ClassNotFoundException
     *             ClassNotFoundException
     */
    private static Object getPathList(Object aBaseDexClassLoader) throws IllegalArgumentException,
            NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        return getField(aBaseDexClassLoader, Class.forName("dalvik.system.BaseDexClassLoader"), "pathList");
    }

    /**
     * @param aParamObject
     *            param
     * @return dexElements
     * @throws IllegalArgumentException
     *             IllegalArgumentException
     * @throws NoSuchFieldException
     *             NoSuchFieldException
     * @throws IllegalAccessException
     *             IllegalAccessException
     */
    private static Object getDexElements(Object aParamObject) throws IllegalArgumentException,
            NoSuchFieldException, IllegalAccessException {
        return getField(aParamObject, aParamObject.getClass(), "dexElements");
    }

    /**
     * inject result
     */
    public static class InjectResult {
        /** is successful */
        public boolean mIsSuccessful;
        /** error msg */
        public String mErrMsg;
    }

    /**
     * 判断程序是否在前台
     * @param aAct activity
     * @return true表示程序在前台，反之不是
     */
    public static boolean isRunningTop(Activity aAct) {
        if(null == aAct || null == aAct.getApplicationContext()){
            Logger.w(TAG,"null == aAct || null == aAct.getApplicationContext()");
            return false;
        }
        ActivityManager am = (ActivityManager) aAct.getApplicationContext().getSystemService(Context.ACTIVITY_SERVICE);
        List<RunningTaskInfo> taskList = am.getRunningTasks(2);
        if (taskList == null || taskList.isEmpty()) {
            return false;
        }
        RunningTaskInfo rti = taskList.get(0);
        String curPackageName = rti.topActivity.getPackageName();
        if (curPackageName != null && curPackageName.equals(aAct.getPackageName())) {
            return true;
        }
        return false;
    }

    /**
     * 开启软键盘
     * @param aContext context
     * @param aView 键盘绑定的view
     */
    public static void showInputMethod(Context aContext, View aView) {
        if (aContext == null || aView == null || aContext.getApplicationContext() == null) {
            return;
        }

        InputMethodManager imm = (InputMethodManager) aContext.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.showSoftInput(aView, 0);
        }
    }

    /**
     * 关闭软键盘
     * @param aContext context
     * @param aView 键盘绑定的view
     */
    public static void hideInputMethod(Context aContext, View aView) {
        if (aContext == null || aView == null || null == aContext.getApplicationContext()) {
            return;
        }

        InputMethodManager imm = (InputMethodManager) aContext.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null && imm.isActive()) {
            imm.hideSoftInputFromWindow(aView.getWindowToken(), 0);
        }
    }

    /**
     * 当前是否是横屏
     *
     * @param aContext
     *            context
     * @return true表示是横屏
     */
    public static boolean isLandscape(Context aContext) {
        //因为小说会强制竖屏，所以这个判断不能添加前半句
        return (aContext.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE);
    }

    public static boolean isRooted() {
        return checkRoot1() || checkRoot2() || checkRoot3();
    }

    private static boolean checkRoot1() {
        final String tag = Build.TAGS;
        return tag != null && tag.contains("test-keys");
    }

    private static boolean checkRoot2() {
        try {
            File file = new File("/system/app/Superuser.apk");
            if (file.exists()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
//            BdLog.printStackTrace(e);
        }
        return false;
    }

    private static boolean checkRoot3() {
        try {
            final String[] cmd = new String[]{"/system/bin/sh", "-c", "type su"};
            Process process = Runtime.getRuntime().exec(cmd);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            ArrayList<String> list = new ArrayList<String>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            if (list.size() == 0) {
                return false;
            }
            boolean result = true;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).contains("not found")) {
                    result = false;
                    break;
                }
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
//            BdLog.printStackTrace(e);
        }
        return false;
    }

    public static String copyAsset(Context context, String assetName, File dir) throws IOException {
        Log.i(TAG, "[copyAsset] assetName=" + assetName + " dir=" + dir.getAbsolutePath());
        File outFile = new File(dir, assetName);
        if (!outFile.exists()) {
            AssetManager assetManager = context.getAssets();
            InputStream in = assetManager.open(assetName);
            OutputStream out = new FileOutputStream(outFile);
            copyFile(in, out);
            in.close();
            out.close();
        }
        return outFile.getAbsolutePath();
    }

    private static void copyFile(InputStream in, OutputStream out) throws IOException {
        Log.i(TAG, "copyFile");
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }

}
