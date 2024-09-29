package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_app implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(73);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(4));
			map1.put("js_bridge_access_allowed_list", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				list1.add("site.101.com");
				list1.add("e.101.com");
				list1.add("http:\\/\\/.*101.com((\\/)+|$|\\?|\\#)");
				list1.add("https:\\/\\/.*101.com((\\/)+|$|\\?|\\#)");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(1));
			map1.put("app_json_exposed_properties", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				list1.add("appid");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(1));
			map1.put("language_resolutions", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("language", "zh-Hant-MO");
					stack.push(new ArrayList<>(1));
					map1.put("supported_languages", stack.peek());
					{
						list1 = (ArrayList<Object>) stack.peek();
						list1.add("zh-Hant-HK");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("android", stack.peek());
			func_0((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("unified_url", "https://coachnkru.beta-site.ndaeweb.com");
			map1.put("support_cdn", "true");
			map1.put("main_page", "cmp://com.nd.smartcan.appfactory.main_component/main?pageid=1543200991430");
			map1.put("version_code_start", "");
			map1.put("uc_version", "1");
			map1.put("label", "aom-android");
			map1.put("rn_debug_mode", "false");
			map1.put("sdp-migrated", "");
			map1.put("appid", "9f45cb97-6499-45a5-8149-0bfc905b8ac0");
			map1.put("launcher", "cmp://com.nd.sdp.component.nduccomponent/login");
			map1.put("env", "5");
			map1.put("factory_id", "e7a107ec-849d-4e4d-b691-d50c2e0af8a4");
			map1.put("dns_enable", "false");
			map1.put("stage", "debug");
			map1.put("env_client", "preproduction");
			map1.put("build_time", 1727594047166L);
			map1.put("scope", "app");
			map1.put("allow_check_update", "true");
			stack.push(new ArrayList<>(18));
			map1.put("language_list", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "English");
					map1.put("name", "en");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "en");
						map1.put("ios", "en");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "简体中文");
					map1.put("name", "zh-CN");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "zh-CN");
						map1.put("ios", "zh-Hans");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "繁體中文（香港）");
					map1.put("name", "zh-HK");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "zh-HK");
						map1.put("ios", "zh-Hant-HK");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "繁體中文（台灣）");
					map1.put("name", "zh-TW");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "zh-TW");
						map1.put("ios", "zh-Hant-TW");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "Indonesia");
					map1.put("name", "id");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "in");
						map1.put("ios", "id");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "ไทย");
					map1.put("name", "th");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "th");
						map1.put("ios", "th");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "عربي");
					map1.put("name", "ar");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ar");
						map1.put("ios", "ar");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "Malay");
					map1.put("name", "ms");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ms");
						map1.put("ios", "ms");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "русский");
					map1.put("name", "ru");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ru");
						map1.put("ios", "ru");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "Türkçe");
					map1.put("name", "tr");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "tr");
						map1.put("ios", "tr");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "German");
					map1.put("name", "de");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "de");
						map1.put("ios", "de");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "French");
					map1.put("name", "fr");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "fr");
						map1.put("ios", "fr");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "Spanish");
					map1.put("name", "es");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "es");
						map1.put("ios", "es");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "日本語");
					map1.put("name", "ja");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "ja");
						map1.put("ios", "ja");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "Português");
					map1.put("name", "pt_PT");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "pt_PT");
						map1.put("ios", "pt_PT");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "Português");
					map1.put("name", "pt");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "pt");
						map1.put("ios", "pt");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "English-US");
					map1.put("name", "en-US");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "en-US");
						map1.put("ios", "en-US");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("display", "བོད་ཡིག");
					map1.put("name", "bo");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("alias", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("android", "bo");
						map1.put("ios", "bo");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(3));
			map1.put("language_enable", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				list1.add("en");
				list1.add("zh-CN");
				list1.add("th");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(1));
			map1.put("language_group", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new ArrayList<Object>(1));
				list1.add(stack.peek());
				{
					list1 = (ArrayList<Object>) stack.peek();
					list1.add("zh-CN");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("language_default", stack.peek());
			func_1((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("portal_app_config_host_cdn", "https://portal-app-config.beta.101.com");
			map1.put("update_host_cdn", "https://portal-android-grey-cdn.beta.ndaeweb.com/");
			map1.put("history_url_cdn", "https://portal-android-grey-cdn.beta.ndaeweb.com/");
			map1.put("lite_app_host_cdn", "https://portal-android-grey-cdn.beta.ndaeweb.com/v1");
			map1.put("portal_app_config_host", "https://portal-app-config.beta.101.com");
			map1.put("portal_web_domain_host", "https://portal-web-domain-manage.beta.101.com");
			map1.put("portal_web_domain_host_cdn", "https://coachnkru.beta-site.ndaeweb.com/portal-web-domain-manage");
			map1.put("update_host", "https://portal-android-grey.beta.101.com/");
			map1.put("history_url", "https://app-history-server.beta.101.com/");
			map1.put("lite_app_host", "https://lite-app-server.beta.101.com/v1");
			map1.put("sub_app_manage", "https://sub-app-manage.beta.101.com/");
			map1.put("domain_service", "https://portal-app-server.beta.101.com/");
			map1.put("pkgid", "9f45cb97-6499-45a5-8149-0bfc905b8ac0");
			map1.put("LOCATION", "允许后，您就可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
			map1.put("android_scan_privacy_enabled", "false");
			stack.push(new ArrayList<>(2));
			map1.put("so_arm_type", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				list1.add("armeabi-v7a");
				list1.add("arm64-v8a");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("BOOT_detail", "我们访问您的自启动权限是为了系统开启后自动启动。");
			map1.put("PHONE_detail", "我们访问您的电话设备是为了保障向您提供的服务的安全稳定运行，实现风控验证。");
			map1.put("CAMERA_detail", "允许后，您就可以在智慧中小学中进行扫描二维码、拍摄照片或视频（用于修改头像/提交作业/打卡/通知/发布课程表/视频教研直播/教研活动/资源反馈/信息统计/建议反馈/班级直播/手机授课/添加家庭成员/文档编辑/问卷调查等)的相关操作");
			map1.put("PHONE", "为您提供信息推送和安全风控服务");
			map1.put("MICROPHONE", "允许后，您就可以进行语音聊天、研修活动、录制语音、小视频的相关操作。");
			map1.put("STORAGE_detail", "允许后，您就可以进行上传或下载图片、视频、文件的相关操作。");
			map1.put("LOCATION_detail", "允许后，您就可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
			map1.put("is_open_task_affinity", "false");
			map1.put("InformationSecurity", " 我们会采取符合业界标准、合理可行的安全防护措施保护您提供的个人信息安全，防止个人信息找到未经授权访问、公开披露、使用、修改、损坏或丢失。我们有行业先进的以数据为核心，围绕数据生命周期进行的数据安全管理体系，从组织建设、制度设计、人员管理、产品技术等方面多维度提升整个系统的安全性。关于我们对于您个人信息安全技术措施，您可查看相应产品或服务的隐私政策。");
			map1.put("gradle_plugin_version_test", "");
			stack.push(new ArrayList<>(0));
			map1.put("gradleVersion", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("kotlin_version_test", "");
			map1.put("usesCleartextTraffic", "true");
			map1.put("STORAGE", "允许后，您就可以进行上传或下载图片、视频、文件的相关操作。");
			map1.put("gradle_version_test", "");
			map1.put("LOCATION_BACKGROUND_detail", "允许后，您可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
			map1.put("gradle_custom_test", "false");
			map1.put("CAMERA", "允许后，您就可以在智慧中小学中进行扫描二维码、拍摄照片或视频（用于修改头像/建议反馈/手机授课等)的相关操作");
			map1.put("android_scan_raw_enabled", "false");
			map1.put("BOOT", "为您提供系统开启后自动启动服务");
			stack.push(new ArrayList<>(1));
			map1.put("ScreenOrientation", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				list1.add("user");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("changeRuntimeConfig", "false");
			map1.put("gradle_property_android_guard_so_mode", "none");
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("LaunchImage", stack.peek());
			func_2((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("useFitRtl", "false");
			map1.put("jdk_version_test", "");
			map1.put("usesArm64V8a", "true");
			map1.put("PermissionSettingExplain", "如要开启或关闭权限授予，请按照以下步骤操作：\\n1.打开手机设置\\n2.在应用列表内找到应用\\n3.点击进入，查看或修改权限设置");
			stack.push(new ArrayList<>(0));
			map1.put("build_log_level", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("MICROPHONE_detail", "允许后，您就可以进行语音聊天、布置学习活动、发布课程表、视频教研直播、研修活动、录制语音、小视频、班级直播、问卷调查的相关操作。");
			map1.put("LOCATION_BACKGROUND", "允许后，您可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
		}
		return map1;
	}
	 
	private void func_0(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("versionMinSdk", "26");
		}
	}
	 
	private void func_1(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("default", "th");
			map1.put("chs", "zh-CN");
			map1.put("zh", "zh-CN");
		}
	}
	 
	private void func_2(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("default", "https://betacs.101.com/v0.1/static/preproduction_content_native_app/1727063276019.9.png");
			map1.put("xxxhdpi", "");
			map1.put("xxhdpi-2160x1080", "");
		}
	}
}
