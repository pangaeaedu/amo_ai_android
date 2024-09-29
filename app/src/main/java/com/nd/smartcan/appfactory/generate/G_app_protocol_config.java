package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonListCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_protocol_config implements IJsonListCreator
{
	@Override
	public /*modify-src*/ ArrayList<Object> createList() 
	{
		if (cacheList != null) {
			return cacheList;
		}
		cacheList = _createList();
		return cacheList;
	}
	
	private static ArrayList<Object> cacheList;

	public ArrayList<Object> _createList()
	{
		Stack<Object> stack = new Stack();
		Map<String, Object> map1 = null;
		ArrayList<Object> list1 = new ArrayList<Object>(6);
		stack.push(list1);
		{
			list1 = (ArrayList<Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			list1.add(stack.peek());
			func_0((Map<String, Object>) stack.peek());
			stack.pop();
			list1 = (ArrayList<Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			list1.add(stack.peek());
			func_1((Map<String, Object>) stack.peek());
			stack.pop();
			list1 = (ArrayList<Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			list1.add(stack.peek());
			func_2((Map<String, Object>) stack.peek());
			stack.pop();
			list1 = (ArrayList<Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			list1.add(stack.peek());
			func_3((Map<String, Object>) stack.peek());
			stack.pop();
			list1 = (ArrayList<Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			list1.add(stack.peek());
			func_4((Map<String, Object>) stack.peek());
			stack.pop();
			list1 = (ArrayList<Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			list1.add(stack.peek());
			func_5((Map<String, Object>) stack.peek());
			stack.pop();
			list1 = (ArrayList<Object>) stack.peek();
		}
		return list1;
	}
	 
	private void func_0(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("key", "cmp");
			map1.put("class", "com.nd.smartcan.appfactory.component.ComponentManager");
			map1.put("constructor", "AppFactoryConfig");
		}
	}
	 
	private void func_1(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("key", "http");
			map1.put("class", "com.nd.smartcan.appfactory.script.webkit.H5ManagerImp");
			map1.put("constructor", "ApplicationContext");
		}
	}
	 
	private void func_2(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("key", "plugin");
			map1.put("class", "com.nd.smartcan.appfactory.plugin.PluginManager");
			map1.put("constructor", "");
		}
	}
	 
	private void func_3(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("key", "react");
			map1.put("class", "com.nd.smartcan.appfactory.script.react.ReactAppManager");
			map1.put("constructor", "AppFactoryConfig");
		}
	}
	 
	private void func_4(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("key", "sub_app");
			map1.put("class", "com.nd.smartcan.subapp.outInterface.ProxyInterfaceImp");
			map1.put("constructor", "AppFactoryConfig");
		}
	}
	 
	private void func_5(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("key", "flutter");
			map1.put("class", "com.nd.sdp.android.apf.flutter.FlutterProtocolManagerImp");
			map1.put("constructor", "AppFactoryConfig");
		}
	}
}
