package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_zhCN_components_permission_config_data implements IJsonMapCreator
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
			map1.put("InformationSecurity", " 我们会采取符合业界标准、合理可行的安全防护措施保护您提供的个人信息安全，防止个人信息找到未经授权访问、公开披露、使用、修改、损坏或丢失。我们有行业先进的以数据为核心，围绕数据生命周期进行的数据安全管理体系，从组织建设、制度设计、人员管理、产品技术等方面多维度提升整个系统的安全性。关于我们对于您个人信息安全技术措施，您可查看相应产品或服务的隐私政策。");
			map1.put("PermissionSettingExplain", "如要开启或关闭权限授予，请按照以下步骤操作：\\n1.打开手机设置\\n2.在应用列表内找到应用\\n3.点击进入，查看或修改权限设置");
			map1.put("STORAGE_intro", "允许后，您就可以进行上传或下载图片、视频、文件的相关操作。");
			map1.put("LOCATION_intro", "允许后，您就可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
			map1.put("CAMERA_intro", "允许后，您就可以在智慧中小学中进行扫描二维码、拍摄照片或视频（用于修改头像/建议反馈/手机授课等)的相关操作");
			map1.put("MICROPHONE_intro", "允许后，您就可以进行语音聊天、研修活动、录制语音、小视频的相关操作。");
			map1.put("PHONE_intro", "为您提供信息推送和安全风控服务");
			map1.put("LOCATION_BACKGROUND_intro", "允许后，您可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
			map1.put("BOOT_intro", "为您提供系统开启后自动启动服务");
			map1.put("STORAGE_detail", "允许后，您就可以进行上传或下载图片、视频、文件的相关操作。");
			map1.put("LOCATION_detail", "允许后，您就可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
			map1.put("CAMERA_detail", "允许后，您就可以在智慧中小学中进行扫描二维码、拍摄照片或视频（用于修改头像/提交作业/打卡/通知/发布课程表/视频教研直播/教研活动/资源反馈/信息统计/建议反馈/班级直播/手机授课/添加家庭成员/文档编辑/问卷调查等)的相关操作");
			map1.put("MICROPHONE_detail", "允许后，您就可以进行语音聊天、布置学习活动、发布课程表、视频教研直播、研修活动、录制语音、小视频、班级直播、问卷调查的相关操作。");
			map1.put("PHONE_detail", "我们访问您的电话设备是为了保障向您提供的服务的安全稳定运行，实现风控验证。");
			map1.put("LOCATION_BACKGROUND_detail", "允许后，您可以进行学校定位、好友实时位置共享的关于定位的相关操作。");
			map1.put("BOOT_detail", "我们访问您的自启动权限是为了系统开启后自动启动。");
		}
		return map1;
	}
}
