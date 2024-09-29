package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_page_attributes implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(34);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(8));
			map1.put("com.nd.sdp.component.nduccomponent", stack.peek());
			func_0((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(5));
			map1.put("com.nd.xst.x-player", stack.peek());
			func_1((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(16));
			map1.put("com.nd.xst.study-activity", stack.peek());
			func_2((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("com.nd.sdp.common.flow-control", stack.peek());
			func_3((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("com.nd.hy.elearning", stack.peek());
			func_4((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.xst.content-interact", stack.peek());
			func_5((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("com.nd.xst.downloader", stack.peek());
			func_6((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(8));
			map1.put("com.nd.smartcan.appfactory.main_component", stack.peek());
			func_7((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.xst.x-cicada-player", stack.peek());
			func_8((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("com.nd.sdp.component.x-app-stat", stack.peek());
			func_9((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.xst.x-res", stack.peek());
			func_10((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.sdp.component.permission", stack.peek());
			func_11((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.xst.x-uc-ext", stack.peek());
			func_12((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.sdp.component.userinfo-view-single-app", stack.peek());
			func_13((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.sdp.component.e-teacher-community", stack.peek());
			func_14((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(7));
			map1.put("com.nd.xst.app-startup", stack.peek());
			func_15((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("com.nd.sdp.component.nduc-selector", stack.peek());
			func_16((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(5));
			map1.put("com.nd.xst.x-combined-page", stack.peek());
			func_17((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.sdp.component.e-user-info", stack.peek());
			func_18((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(4));
			map1.put("com.nd.sdp.dyn-access-control", stack.peek());
			func_19((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.pbl.pblcomponent", stack.peek());
			func_20((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(5));
			map1.put("com.nd.sdp.component.x-user", stack.peek());
			func_21((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("com.nd.xst.x-user-guide", stack.peek());
			func_22((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(5));
			map1.put("com.nd.social.appsetting", stack.peek());
			func_23((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(20));
			map1.put("com.nd.xst.course", stack.peek());
			func_24((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(6));
			map1.put("com.nd.sdp.component.ele-channel", stack.peek());
			func_25((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.xst.xs-commons", stack.peek());
			func_26((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("com.nd.sdp.component.remark-name-mo", stack.peek());
			func_27((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(17));
			map1.put("com.nd.sdp.component.x-cloud-assemble", stack.peek());
			func_28((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("com.nd.sdp.component.ele-compulsory-learning-business", stack.peek());
			func_29((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(7));
			map1.put("com.nd.sdp.uc_component", stack.peek());
			func_30((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("com.nd.sdp.component.el-smartlink", stack.peek());
			func_31((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("com.nd.edu.component.el-router", stack.peek());
			func_32((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(7));
			map1.put("com.nd.sdp.component.xcloud-class-activity", stack.peek());
			func_33((Map<String, Object>) stack.peek());
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("logout", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("forget_password", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("web_login", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("check_process", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("account_security", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("login", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("third_login_binding_account", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("register", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("play", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("debug", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("playVideo", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("resList", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("elecBookList", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("assets_document", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("go_examination_papers", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("basicWork", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("my_interest", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("recommend_you_list", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("search_main", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("special_topic_detail", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("ningxia_recommend_apps", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("my_study", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("special_topic_pdf", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("course", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("activity_zone", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("special_topic_detail_v2", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("rank_detail_top50", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("recent_study", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("sync_classroom", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("tip1", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("tip", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("forcestudy?type=community", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("test", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("mainFragment", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("forcestudy", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("favoriteManage", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("download_business_list", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("resList", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("setting", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("download", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("webview", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("webview2", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("main", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("develop", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("permission_list", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("benchmark", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("main_virtual", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
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
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("player", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_9(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("log", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("send", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_10(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("resDetail", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_11(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("permission_list", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_12(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("idp", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_13(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("userview", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_14(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("debug", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_15(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("login_transform", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("hap", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("transferhttp", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("chat_list", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("block", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("register", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("do_nothing", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_16(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("choose_org_or_node_single_before_login", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("choose_org_single_before_login", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_17(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("combined_page", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("student_dashboard", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("teacher_workbench", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("interaction", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("main", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_18(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("debug", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_19(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("notImplementPage", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("test", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("login_transform", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("block", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_20(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("me", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_21(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("userinfo_settings", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("homepageSmartEdu", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("about", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("ks_cloud_doc", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("homepage", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_22(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("debug", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("guide", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_23(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("aboutUs", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("subpage", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("changeLanguage", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("historyVersion", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("appsetting", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_24(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("experimentLesson", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("study", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("debug", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("playActivity", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("courseAssets", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("qualityCourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("standardCourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("nationalLesson", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("teachingmaterials", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("download", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("specialCourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("prepareLesson", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("thematicCourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("teacherTrainingEx", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("teacherTraining", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("course", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("tcourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("offlineCourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("ocourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("downloadResourceList", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_25(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("nindex", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("test", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("newchannel", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("nchannel", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("newresources", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("nresources", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_26(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("flutter_pop", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_27(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("editRemarkName", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_28(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("showCreateGroupDialog", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("launch_event_page", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("study", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("successPage2", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("firstSelectPlatform", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("regionChannel", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("login", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("lectureHomepage", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("selectPlatform", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("loginlessForward", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("uploadlog", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("successPage1", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("login_dialog", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("openvlab", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("showJoinGroupDialog", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("guide", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("preLaunch", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_29(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("test", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("taskdetail", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("tasklist", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "false");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_30(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("logout", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("setup_password", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("bind_mobile", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("user_agreement", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("login", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("third_login_success", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("register", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_31(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("opensmartlink", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("test", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_32(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("router", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("test", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("h5Address", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
	 
	private void func_33(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("playVideo", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("playActivity", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("qualityCourse", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("playDocument", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("nationalLesson", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("playDownloadVideo", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(1));
			map1.put("playDownloadDocument", stack.peek());
			{
				map1 = (Map<String, Object>) stack.peek();
				map1.put("_allow_guest", "true");
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
	}
}
