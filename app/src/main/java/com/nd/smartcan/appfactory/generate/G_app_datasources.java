package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonListCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_datasources implements IJsonListCreator
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
		ArrayList<Object> list1 = new ArrayList<Object>(0);
		stack.push(list1);
		{
			list1 = (ArrayList<Object>) stack.peek();
		}
		return list1;
	}
}
