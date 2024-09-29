package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_en_pages_pages implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(9);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("1703823984734", stack.peek());
			func_0((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("1720775519900", stack.peek());
			func_1((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("cmp://com.nd.sdp.uc_component/login", stack.peek());
			func_2((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("cmp://com.nd.smartcan.appfactory.main_component/main_virtual", stack.peek());
			func_3((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("cmp://com.nd.sdp.component.nduccomponent/forget_password", stack.peek());
			func_4((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("cmp://com.nd.sdp.component.nduccomponent/account_security", stack.peek());
			func_5((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("cmp://com.nd.sdp.component.nduccomponent/login", stack.peek());
			func_6((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("cmp://com.nd.xst.course/course", stack.peek());
			func_7((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("cmp://com.nd.sdp.component.nduccomponent/register", stack.peek());
			func_8((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
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
			map1.put("template", "cmp://com.nd.smartcan.appfactory.main_component/main?pageid=1703823984734");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("namespace", "com.nd.smartcan.appfactory");
				map1.put("name", "main_component");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "main");
			stack.push(new LinkedHashMap<String, Object>(8));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("page_display", "默认");
				map1.put("tabbar_background_image_ios", "");
				map1.put("tabbar_item_selected_text_color", "1E62EC");
				map1.put("default_tab_index", "0");
				stack.push(new ArrayList<>(2));
				map1.put("items", stack.peek());
				{
					list1 = (ArrayList<Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(8));
					list1.add(stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image", "main_pageid_1703823984734_8f98fe4a_a5721d6d_study_image.png");
						map1.put("hidden", "");
						stack.push(new LinkedHashMap<String, Object>(0));
						map1.put("param", stack.peek());
						{
							map1 = (Map<String, Object>) stack.peek();
						}
						stack.pop();
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image_selected", "main_pageid_1703823984734_8f98fe4a_a5721d6d_study_image_selected.png");
						map1.put("_stick", "");
						map1.put("text", "Course");
						map1.put("page", "cmp://com.nd.sdp.component.x-cloud-assemble/study");
						map1.put("_not_switch_tab", "");
					}
					stack.pop();
					list1 = (ArrayList<Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(8));
					list1.add(stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image", "main_pageid_1703823984734_8f98fe4a_83a9b701_homepage_image.png");
						map1.put("hidden", "");
						stack.push(new LinkedHashMap<String, Object>(0));
						map1.put("param", stack.peek());
						{
							map1 = (Map<String, Object>) stack.peek();
						}
						stack.pop();
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image_selected", "main_pageid_1703823984734_8f98fe4a_83a9b701_homepage_image_selected.png");
						map1.put("_stick", "");
						map1.put("text", "Me");
						map1.put("page", "cmp://com.nd.sdp.component.x-user/homepage");
						map1.put("_not_switch_tab", "");
					}
					stack.pop();
					list1 = (ArrayList<Object>) stack.peek();
				}
				stack.pop();
				map1 = (Map<String, Object>) stack.peek();
				map1.put("tabbar_background_color", "");
				map1.put("tabbar_item_text_color", "999999");
				map1.put("tabbar_background_image_android", "");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_1(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.smartcan.appfactory.main_component/main?pageid=1720775519900");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("namespace", "com.nd.smartcan.appfactory");
				map1.put("name", "main_component");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "main");
			stack.push(new LinkedHashMap<String, Object>(8));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("page_display", "静态页");
				map1.put("tabbar_background_image_ios", "");
				map1.put("tabbar_item_selected_text_color", "");
				map1.put("default_tab_index", "0");
				stack.push(new ArrayList<>(2));
				map1.put("items", stack.peek());
				{
					list1 = (ArrayList<Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(8));
					list1.add(stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image", "main_pageid_1720775519900_4c9b2f60_a5721d6d_study_image.png");
						map1.put("hidden", "");
						stack.push(new LinkedHashMap<String, Object>(0));
						map1.put("param", stack.peek());
						{
							map1 = (Map<String, Object>) stack.peek();
						}
						stack.pop();
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image_selected", "main_pageid_1720775519900_4c9b2f60_a5721d6d_study_image_selected.png");
						map1.put("_stick", "");
						map1.put("text", "");
						map1.put("page", "cmp://com.nd.sdp.component.x-cloud-assemble/study");
						map1.put("_not_switch_tab", "");
					}
					stack.pop();
					list1 = (ArrayList<Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(8));
					list1.add(stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image", "main_pageid_1720775519900_4c9b2f60_83a9b701_homepage_image.png");
						map1.put("hidden", "");
						stack.push(new LinkedHashMap<String, Object>(0));
						map1.put("param", stack.peek());
						{
							map1 = (Map<String, Object>) stack.peek();
						}
						stack.pop();
						map1 = (Map<String, Object>) stack.peek();
						map1.put("image_selected", "main_pageid_1720775519900_4c9b2f60_83a9b701_homepage_image_selected.png");
						map1.put("_stick", "");
						map1.put("text", "");
						map1.put("page", "cmp://com.nd.sdp.component.x-user/homepage");
						map1.put("_not_switch_tab", "");
					}
					stack.pop();
					list1 = (ArrayList<Object>) stack.peek();
				}
				stack.pop();
				map1 = (Map<String, Object>) stack.peek();
				map1.put("tabbar_background_color", "");
				map1.put("tabbar_item_text_color", "");
				map1.put("tabbar_background_image_android", "");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_2(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.sdp.uc_component/login");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("name", "uc_component");
				map1.put("namespace", "com.nd.sdp");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "login");
			stack.push(new LinkedHashMap<String, Object>(40));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("on_account_register_button_click", "");
				map1.put("customer_service_phone", "4001910910");
				map1.put("take_over_login_url_android", "");
				map1.put("open_forget_password", "true");
				map1.put("open_third_login_text", "false");
				map1.put("take_over_app_secret_android", "");
				map1.put("user_name", "");
				map1.put("third_login_bind_mobile", "");
				map1.put("redirect_to_third_login", "");
				map1.put("login_success_page", "cmp://com.nd.sdp.component.x-cloud-assemble/loginlessForward");
				map1.put("open_user_filter", "false");
				map1.put("bind_mobile_prompt_interval", "");
				map1.put("account_hint", "Please enter your account.");
				map1.put("password", "");
				map1.put("agreement_success_page", "");
				map1.put("take_over_app_key_ios", "");
				map1.put("logo", "login_72efe7aa_logo.jpg");
				map1.put("password_level", "0");
				map1.put("open_guide_login", "false");
				map1.put("login_uri", "");
				map1.put("open_register_account_by_email", "true");
				map1.put("open_change_user", "");
				map1.put("show_password_switch", "false");
				map1.put("auto_login", "");
				map1.put("open_sms_login", "");
				map1.put("on_reset_password_button_click", "");
				map1.put("take_over_app_secret_ios", "");
				map1.put("open_third_login", "false");
				map1.put("show_wechat_jayme_migration", "false");
				map1.put("bind_mobile_prompt", "");
				map1.put("email_suffix_list", "@qq.com,@163.com,@126.com,@sina.com,@139.com,@sohu.com,@263.net,@vip.sina.com,@vip.163.com,@21cn.com,@tom.com,@foxmail.com,@189.cn,@yeah.net,@outlook.com,@yahoo.com,@hotmail.com,@gmail.com,@gmx.com,@aol.com,@zoho.com,@lycos.com,@inbox.com,@hushmail.com");
				map1.put("take_over_app_key_android", "");
				map1.put("register_success_page", "");
				map1.put("open_register_account", "true");
				map1.put("open_need_complete_userinfo", "");
				map1.put("third_login_bind_mobile_can_ignore", "");
				map1.put("open_third_bind", "false");
				map1.put("take_over_login_url_ios", "");
				map1.put("uc_is_landscape", "");
				map1.put("psw_hint", "Please enter your password.");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_3(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.smartcan.appfactory.main_component/main_virtual");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("name", "main_component");
				map1.put("namespace", "com.nd.smartcan.appfactory");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "main_virtual");
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("image", "");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_4(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.sdp.component.nduccomponent/forget_password");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("namespace", "com.nd.sdp.component");
				map1.put("name", "nduccomponent");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "forget_password");
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("hotline", "");
				map1.put("find_password_account_type", "personal");
				map1.put("find_org_account_password_mode", "");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_5(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.sdp.component.nduccomponent/account_security");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("namespace", "com.nd.sdp.component");
				map1.put("name", "nduccomponent");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "account_security");
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("login_records", "false");
				map1.put("third_bind", "false");
				map1.put("login_devices", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_6(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.sdp.component.nduccomponent/login");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("namespace", "com.nd.sdp.component");
				map1.put("name", "nduccomponent");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "login");
			stack.push(new LinkedHashMap<String, Object>(30));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("report_uri", "https://x-edu-h5-test.beta.101.com/appeal?account_id={account_id}");
				map1.put("allowed_skip_days", "7");
				map1.put("only_org_code", "");
				map1.put("show_area", "country||area");
				map1.put("allowed_skip_bind_mobile_and_email", "false");
				map1.put("login_success_page", "cmp://com.nd.sdp.component.x-cloud-assemble/loginlessForward");
				map1.put("bind_person_account_mode", "mobile");
				map1.put("minor_account_mandatory_binding_guardianship", "false");
				map1.put("gopage_to_show_detail", "true");
				map1.put("custom_join_org_cmp", "");
				map1.put("switch_org_account_mode", "1");
				map1.put("agreement_success_page", "cmp://com.nd.sdp.component.x-cloud-assemble/launch_event_page");
				map1.put("allowed_skip_bind_personal_account", "false");
				map1.put("agreement_refuse_page", "cmp://com.nd.sdp.component.x-cloud-assemble/launch_event_page");
				map1.put("login_uri", "cmp://com.nd.sdp.component.x-cloud-assemble/login");
				map1.put("person_account_bind", "");
				map1.put("allowed_join_node", "false");
				map1.put("open_invitation", "false");
				map1.put("login_mode", "mixed_login");
				map1.put("allowed_skip_update_original_password", "false");
				map1.put("third_automatically_generate_person_account", "true");
				map1.put("email_suffix_list", "@qq.com,@163.com,@126.com,@sina.com,@139.com,@sohu.com,@263.net,@vip.sina.com,@vip.163.com,@21cn.com,@tom.com,@foxmail.com,@189.cn,@yeah.net,@outlook.com,@yahoo.com,@hotmail.com,@gmail.com,@gmx.com,@aol.com,@zoho.com,@lycos.com,@inbox.com,@hushmail.com");
				map1.put("auto_switch_org_account_tip", "false");
				map1.put("allowed_skip_check_password", "true");
				map1.put("force_org_account_before_login", "false");
				map1.put("bind_org_account_mode", "org_user_code");
				map1.put("allowed_skip_change_psw_on_time", "true");
				map1.put("org_bind_person_account", "false");
				map1.put("adding_org_account_mode", "with_org_account");
				map1.put("real_name_auth", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_7(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.xst.course/course");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("namespace", "com.nd.xst");
				map1.put("name", "course");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "course");
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("image", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_8(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("template", "cmp://com.nd.sdp.component.nduccomponent/register");
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("component", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("namespace", "com.nd.sdp.component");
				map1.put("name", "nduccomponent");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			map1.put("page_name", "register");
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("properties", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("general_passport_after_register", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
}
