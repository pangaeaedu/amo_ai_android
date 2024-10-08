package com.nd.smartcan.appfactory.generate;
 
import com.nd.smartcan.appfactory.businessInterface.IJsonFactory;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
import com.nd.smartcan.appfactory.businessInterface.IJsonListCreator;
 
/***************************
* This file is automatically generated by compile-time script.
* Do not modify this file -- YOUR CHANGES WILL BE ERASED!
***************************/
 
public class ConfigFactory implements IJsonFactory
{
	static Map<String, String> mMap;
	static
	{
		mMap = new HashMap<>();
		mMap.put("/en/components/android_config_data.json", "com.nd.smartcan.appfactory.generate.G_en_components_android_config_data");
		mMap.put("/th/components/build.json", "com.nd.smartcan.appfactory.generate.G_th_components_build");
		mMap.put("/zh-CN/components/permission_config_data.json", "com.nd.smartcan.appfactory.generate.G_zhCN_components_permission_config_data");
		mMap.put("/app/page_controller.json", "com.nd.smartcan.appfactory.generate.G_app_page_controller");
		mMap.put("/app/service.json", "com.nd.smartcan.appfactory.generate.G_app_service");
		mMap.put("/th/pages/pages.json", "com.nd.smartcan.appfactory.generate.G_th_pages_pages");
		mMap.put("/th/components/permission_config_data.json", "com.nd.smartcan.appfactory.generate.G_th_components_permission_config_data");
		mMap.put("/zh-CN/pages/widgets.json", "com.nd.smartcan.appfactory.generate.G_zhCN_pages_widgets");
		mMap.put("/app/page_attributes.json", "com.nd.smartcan.appfactory.generate.G_app_page_attributes");
		mMap.put("/zh-CN/components/android_config_data.json", "com.nd.smartcan.appfactory.generate.G_zhCN_components_android_config_data");
		mMap.put("/app/extension.json", "com.nd.smartcan.appfactory.generate.G_app_extension");
		mMap.put("/en/pages/widgets.json", "com.nd.smartcan.appfactory.generate.G_en_pages_widgets");
		mMap.put("/app/config.json", "com.nd.smartcan.appfactory.generate.G_app_config");
		mMap.put("/app/routes.json", "com.nd.smartcan.appfactory.generate.G_app_routes");
		mMap.put("/th/pages/widgets.json", "com.nd.smartcan.appfactory.generate.G_th_pages_widgets");
		mMap.put("/th/components/android_config_data.json", "com.nd.smartcan.appfactory.generate.G_th_components_android_config_data");
		mMap.put("/en/components/permission_config_data.json", "com.nd.smartcan.appfactory.generate.G_en_components_permission_config_data");
		mMap.put("/zh-CN/components/build.json", "com.nd.smartcan.appfactory.generate.G_zhCN_components_build");
		mMap.put("/app/nd_sdk.json", "com.nd.smartcan.appfactory.generate.G_app_nd_sdk");
		mMap.put("/en/components/build.json", "com.nd.smartcan.appfactory.generate.G_en_components_build");
		mMap.put("/app/app.json", "com.nd.smartcan.appfactory.generate.G_app_app");
		mMap.put("/app/js_third_app.json", "com.nd.smartcan.appfactory.generate.G_app_js_third_app");
		mMap.put("/app/components.json", "com.nd.smartcan.appfactory.generate.G_app_components");
		mMap.put("/app/announce.json", "com.nd.smartcan.appfactory.generate.G_app_announce");
		mMap.put("/zh-CN/pages/pages.json", "com.nd.smartcan.appfactory.generate.G_zhCN_pages_pages");
		mMap.put("/app/protocol_config.json", "com.nd.smartcan.appfactory.generate.G_app_protocol_config");
		mMap.put("/en/pages/pages.json", "com.nd.smartcan.appfactory.generate.G_en_pages_pages");
		mMap.put("/app/datasources.json", "com.nd.smartcan.appfactory.generate.G_app_datasources");
	}
	 
	private Object getObjectByPath(String relativePath)
	{
		if (relativePath == null || relativePath.isEmpty())
		{
			return null;
		}
		 
		relativePath = relativePath.replace('\\', '/');
		if (!relativePath.startsWith("/"))
		{
			relativePath = "/" + relativePath;
		}
		 
		String className = mMap.get(relativePath);
		Object object = null;
		if (className != null)
		{
			try
			{
				Class<?> cls = Class.forName(className);
				object = cls.newInstance();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (InstantiationException e)
			{
				e.printStackTrace();
			}
			catch (IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
		return object;
	}
	 
	@Override
	public Map<String, Object> getMapByPath(String relativePath)
	{
		Object object = getObjectByPath(relativePath);
		if (object != null && object instanceof IJsonMapCreator)
		{
			return ((IJsonMapCreator)object).createMap();
		}
		return null;
	}
	 
	@Override
	public List<Object> getListByPath(String relativePath)
	{
		Object object = getObjectByPath(relativePath);
		if (object != null && object instanceof IJsonListCreator)
		{
			return ((IJsonListCreator)object).createList();
		}
		return null;
	}
	 
}
