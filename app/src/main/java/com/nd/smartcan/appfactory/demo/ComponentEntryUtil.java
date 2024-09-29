package com.nd.smartcan.appfactory.demo;

import com.nd.smartcan.appfactory.component.ComponentEntry;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2015/12/3.
 */
public class ComponentEntryUtil {

    private static volatile ComponentEntryUtil mManager;
    public static HashMap<String, List<ComponentEntry>> componentEntryMap = new HashMap<String, List<ComponentEntry>>();
    public static ComponentEntryUtil instance() {
        if (mManager == null) {
            synchronized (ComponentEntryUtil.class) {
                if (mManager == null) {
                    mManager = new ComponentEntryUtil();
                }
            }
        }
        return mManager;
    }

    public List<ComponentEntry> getComponentEntryList(String currentEnv) {
        return null;
    }
}
