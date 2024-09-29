package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_en_components_permission_config_data implements IJsonMapCreator
{
	@Override
	public /*modify-src*/ Map<String, Object> createMap() 
	{
		if (cacheMap != null) {
			return cacheMap;
		}
		cacheMap = _createMap();
		return cacheMap;
	}
	
	private static Map<String, Object> cacheMap;

	public Map<String, Object> _createMap()
	{
		Stack<Object> stack = new Stack();
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(16);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("InformationSecurity", "We will take industry-standard and reasonable security measures to protect the personal information you provide, preventing unauthorized access, public disclosure, use, modification, damage, or loss of personal information. We have an industry-leading data-centric security management system that focuses on the data lifecycle, enhancing the overall system security from multiple dimensions such as organizational construction, system design, personnel management, and product technology. For our technical measures regarding the security of your personal information, you can refer to the privacy policy of the relevant product or service.");
			map1.put("PermissionSettingExplain", "To enable or disable permissions, please follow these steps:\\n1. Open phone settings\\n2. Find the app in the application list\\n3. Tap to enter, view, or modify permission settings");
			map1.put("STORAGE_intro", "Once allowed, you can upload or download images, videos, files, courses, and logs.");
			map1.put("LOCATION_intro", "Once allowed, you can perform location-related operations such as school positioning and real-time location sharing with friends.");
			map1.put("CAMERA_intro", "Once allowed, you can scan QR codes, take photos or videos in the app (for profile picture modification, teaching activities, information statistics, etc.)");
			map1.put("MICROPHONE_intro", "Once allowed, you can perform operations such as voice chat, training activities, voice recording, and short videos.");
			map1.put("PHONE_intro", "We access your phone device to ensure the secure and stable operation of the services provided to you and to perform risk control verification.");
			map1.put("LOCATION_BACKGROUND_intro", "Once allowed, you can perform location-related operations such as school positioning and real-time location sharing with friends.");
			map1.put("BOOT_intro", "We access your auto-start permissions to enable automatic startup after the system is turned on.");
			map1.put("STORAGE_detail", "Once allowed, you can upload or download images, videos, files, courses, and logs.");
			map1.put("LOCATION_detail", "Once allowed, you can perform location-related operations such as school positioning and real-time location sharing with friends.");
			map1.put("CAMERA_detail", "Once allowed, you can scan QR codes, take photos or videos in the app (for profile picture modification, teaching activities, information statistics, etc.)");
			map1.put("MICROPHONE_detail", "Once allowed, you can perform operations such as voice chat, training activities, voice recording, and short videos.");
			map1.put("PHONE_detail", "We access your phone device to ensure the secure and stable operation of the services provided to you and to perform risk control verification.");
			map1.put("LOCATION_BACKGROUND_detail", "Once allowed, you can perform location-related operations such as school positioning and real-time location sharing with friends.");
			map1.put("BOOT_detail", "We access your auto-start permissions to enable automatic startup after the system is turned on.");
		}
		return map1;
	}
}
