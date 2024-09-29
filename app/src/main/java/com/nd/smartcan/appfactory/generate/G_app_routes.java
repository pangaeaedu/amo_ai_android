package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_routes implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(23);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			map1.put("cmp://com.nd.hy.elearning/main", "cmp://com.nd.hy.elearning/forcestudy");
			map1.put("cmp://com.nd.sdp.component.local-data-management/dowmload_manager", "cmp://com.nd.sdp.component.elearning-course/alldownloadlist");
			map1.put("cmp://com.nd.sdp.component.local-data-management/download_business_list", "cmp://com.nd.xst.downloader/download_business_list");
			map1.put("cmp://com.nd.sdp.component.local-data-management/download_resource_list", "cmp://com.nd.xst.downloader/download_resource_list");
			map1.put("cmp://com.nd.sdp.component.local-data-management/setting", "cmp://com.nd.xst.downloader/setting");
			map1.put("cmp://com.nd.sdp.component.elearning-course/alldownloadlist", "cmp://com.nd.xst.downloader/download_business_list");
			map1.put("cmp://com.nd.smartcan.appfactory.main_component/permission_list", "cmp://com.nd.sdp.component.permission/permission_list");
			map1.put("cmp://com.nd.sdp.component.e-teacher-studio/mine_train_list", "cmp://com.nd.sdp.component.e-teacher-community/mine_train_list");
			map1.put("cmp://com.nd.sdp.component.e-teacher-studio/mine_train_hours", "cmp://com.nd.sdp.component.e-teacher-community/mine_train_hours");
			map1.put("cmp://com.nd.sdp.component.e-teacher-studio/mine_profile", "cmp://com.nd.sdp.component.e-user-info/mine_profile");
			map1.put("cmp://com.nd.sdp.component.e-teacher-studio/complete_mine_profile", "cmp://com.nd.sdp.component.e-user-info/complete_mine_profile");
			map1.put("cmp://com.nd.social.me/me_HomePage", "cmp://com.nd.pbl.pblcomponent/others");
			map1.put("cmp://com.nd.sdp.component.cect-course-v5/course", "cmp://com.nd.xst.course/course");
			map1.put("cmp://com.nd.sdp.component.cect-course-v5/download", "cmp://com.nd.xst.course/download");
			map1.put("cmp://com.nd.sdp.component.xcloud-class-activity/playActivity", "cmp://com.nd.xst.course/playActivity");
			map1.put("cmp://com.nd.sdp.component.xcloud-class-activity/nationalLesson", "cmp://com.nd.xst.course/nationalLesson");
			map1.put("cmp://com.nd.sdp.component.xcloud-class-activity/qualityCourse", "cmp://com.nd.xst.course/qualityCourse");
			map1.put("cmp://com.nd.sdp.component.e-prepare-lessons/course_detail", "cmp://com.nd.xst.course/prepareLesson");
			map1.put("cmp://com.nd.sdp.component.e-prepare-lessons/material_detail", "cmp://com.nd.xst.course/courseAssets");
			map1.put("cmp://com.nd.sdp.component.lecture-management2/lectureHomepageV2", "cmp://com.nd.sdp.component.x-cloud-assemble/lectureHomepage");
			map1.put("cmp://com.nd.xst.downloader/resList", "cmp://com.nd.xst.downloader/download_business_list");
			map1.put("cmp://com.nd.sdp.component.x-cloud-assemble/createclass_v2", "cmp://com.nd.sdp.component.x-cloud-assemble/createclass");
			map1.put("cmp://com.nd.social.im/fontsize_setting", "cmp://com.nd.sdp.component.appfontcomponent/fontsize_setting");
		}
		return map1;
	}
}
