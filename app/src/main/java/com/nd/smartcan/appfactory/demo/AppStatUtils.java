/*generate*/
package com.nd.smartcan.appfactory.demo;

import android.app.Activity;
import android.app.Application;

import com.nd.mob.stat.MobStat;

public class AppStatUtils {

    public static void onAppAttachBaseContextStart(Application app) {
        MobStat.INSTANCE.onAppAttachBaseContextStart(app);
    }

    public static void onAppAttachBaseContextEnd(Application app) {
        MobStat.INSTANCE.onAppAttachBaseContextEnd(app);
    }

    public static void onAppCreateEnd(Application app) {
        MobStat.INSTANCE.onAppCreateEnd(app);
    }

    public static void onFirstPageCreate(Activity page) {
        MobStat.INSTANCE.onFirstPageCreate(page);
    }

    public static void onFirstPageResume(Activity page) {
        MobStat.INSTANCE.onFirstPageResume(page);
    }

    public static void onFirstPageRestart(Activity page) {
        MobStat.INSTANCE.onFirstPageRestart(page);
    }

    public static void onFirstPageStart(Activity page) {
        MobStat.INSTANCE.onFirstPageStart(page);
    }

    public static void onFirstPageStop(Activity page) {
        MobStat.INSTANCE.onFirstPageStop(page);
    }
}
