package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_nd_sdk implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(12);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("downloader-jssdk", stack.peek());
			func_0((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("ele-rn-common", stack.peek());
			func_1((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("time-picker-jssdk", stack.peek());
			func_2((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("MUIAudioJsBridgeSdk", stack.peek());
			func_3((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("rn-common", stack.peek());
			func_4((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("cs-jssdk", stack.peek());
			func_5((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("ele-rn-channel", stack.peek());
			func_6((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("MUIMultiPhotoJsSdk", stack.peek());
			func_7((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("ui-jssdk", stack.peek());
			func_8((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("uc-jssdk", stack.peek());
			func_9((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(3));
			map1.put("IMJsBridgeSdk", stack.peek());
			func_10((Map<String, Object>) stack.peek());
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new LinkedHashMap<String, Object>(2));
			map1.put("imAppSettingFontSize", stack.peek());
			func_11((Map<String, Object>) stack.peek());
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
			map1.put("version", "0.1");
			map1.put("js-class", "com.nd.sdp.android.common.downloader.jswrapper.DownloaderJsInjectorProvider");
		}
	}
	 
	private void func_1(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("react-class", "com.nd.sdp.android.ele.rncommon.react.EleRnCommonProvider");
		}
	}
	 
	private void func_2(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("js-class", "com.nd.sdp.android.timepickerjssdk.TimePickerJsSdkProvider");
		}
	}
	 
	private void func_3(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("react-class", "com.nd.android.social.audiorecorder.jssdk.AudioItemReactProvider");
			map1.put("js-class", "com.nd.android.social.audiorecorder.js.AudioJsBridgeProvider");
		}
	}
	 
	private void func_4(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.1");
			map1.put("js-class", "com.nd.sdp.android.rncommon.RnCommonJsSdkProvider");
			map1.put("react-class", "com.nd.sdp.android.rncommon.RnCommonProvider");
		}
	}
	 
	private void func_5(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("js-class", "com.nd.sdp.cs.js.CsCommonJsInjectorProvider");
			map1.put("react-class", "com.nd.sdp.cs.js.CsCommonJsInjectorProvider");
		}
	}
	 
	private void func_6(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "3.0");
			map1.put("react-class", "com.nd.sdp.android.ele.rncommon.react.EleRnCommonProvider");
		}
	}
	 
	private void func_7(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("js-class", "com.nd.sdp.android.common.ui.gallery.jssdk.GalleryJsInjectorProvider");
		}
	}
	 
	private void func_8(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("js-class", "com.nd.android.sdp.common.photopicker.js.PhotoPickerJsInjectorProvider");
		}
	}
	 
	private void func_9(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.1");
			map1.put("js-class", "com.nd.sdp.uc.js.UcJsInjectorProvider");
		}
	}
	 
	private void func_10(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("js-class", "com.nd.sdp.android.jssdk.common.ImJssdkJsInjectorProvider");
			map1.put("react-class", "com.nd.sdp.android.jssdk.common.ImJssdkReactInjectorProvider");
		}
	}
	 
	private void func_11(Map<String, Object> map1)
	{
		Stack<Object> stack = new Stack();
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("version", "1.0");
			map1.put("js-class", "com.nd.appfont.component.im.js_module.GetCurFontInfosProvider");
		}
	}
}
