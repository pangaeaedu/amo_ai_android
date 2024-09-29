package com.nd.smartcan.appfactory.generate;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import com.nd.smartcan.appfactory.businessInterface.IJsonMapCreator;
 
/***********************************
Notice: This Class is generated at compile time
************************************/
public class G_app_announce implements IJsonMapCreator
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
		Map<String, Object> map1 = new LinkedHashMap<String, Object>(2);
		ArrayList<Object> list1 = null;
		stack.push(map1);
		{
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(78));
			map1.put("native", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.android.org.server.adapter");
						map1.put("name", "orgserveradapter");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.cq.commonres.UserAdapterComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "flutter-runtime");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "APFFlutterComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component.im");
						map1.put("name", "suspentionwindow");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "SuspensionWindowComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "thirdlogincomline");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.thirdlogin.line.ThirdLoginLineComponent");
					map1.put("ios", "UCLineComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "nduccomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.uc.nduc.NdUcComponent");
					map1.put("ios", "NDUCCComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.hy.android.video");
						map1.put("name", "video");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.video.player.VideoPlayerComponent");
					map1.put("ios", "ElearnVideoComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-player");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.android.player.cmp.XPlayerComponent");
					map1.put("ios", "XSTPlayerComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "study-activity");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.xst.study.actv.StudyActComponent");
					map1.put("ios", "XStudyActivityComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.sensitivewordfilter");
						map1.put("name", "sensitivewordfilter");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.censorsdk.CensorComponent");
					map1.put("ios", "SensitiveWordComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "thirdlogingoogle");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.thirdlogin.ThirdLoginComponentGoogle");
					map1.put("ios", "UCGoogleComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "security-transporter");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.security.transporter.component.SecurityComponent");
					map1.put("ios", "APFSecurityTransporterComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.edu.ap.component");
						map1.put("name", "parent-child-raship");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.edu.ap.raship.component.ChildShipCom");
					map1.put("ios", "edu_ap_parent_child_raship_sdk_iosObjC_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.common");
						map1.put("name", "flow-control");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.common.flowcontrol.FlowControlComponent");
					map1.put("ios", "FCIFlowControlComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "elearn-enroll");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.enroll.EnrollComponent");
					map1.put("ios", "ElearnEnroll2Component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "thirdloginfacebook");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.thirdlogin.ThirdLoginComponentFacebook");
					map1.put("ios", "UCFacebookComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.hy");
						map1.put("name", "elearning");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.module.mutual.MutualComponent");
					map1.put("ios", "ELMUCComplexTab");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "elearning-configs");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.configs.ConfigsComponent");
					map1.put("ios", "ElearningConfigManager");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "content-interact");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.interact.cmp.XstInteractComponent");
					map1.put("ios", "XstContentInteractComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "downloader");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.course.download.DownloadManagerComponent");
					map1.put("ios", "XstDownloaderComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.smartcan.appfactory");
						map1.put("name", "main_component");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.component.MainComponent");
					map1.put("ios", "APFMainComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-cicada-player");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "XSTCicadaplayerComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "x-app-stat");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.mob.stat.MobStatComponent");
					map1.put("ios", "x_app_stat_iosComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "elearning-exam-player");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.eval.main.BizComponent");
					map1.put("ios", "Elearning_EXPComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "uc-avatar-edit");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.uc.avataredit.UcAvatarEditComponent");
					map1.put("ios", "MUIAvatarEditor");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ui-universal-popup");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.module_popup.CommonPopupComponent");
					map1.put("ios", "BirthdayWishesComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "video-player-sdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.ele.android.exp.main.ExamPlayerComponent");
					map1.put("ios", "ELMediaSDKComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.erp");
						map1.put("name", "addresspicker");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("ios", "MUIAddressPicker");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-res");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xst.res.core.XstResComponent");
					map1.put("ios", "XResCenterComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "permission");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.apf.permission.ApfPermissionComponent");
					map1.put("ios", "APFPermissionComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-uc-ext");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.xst.uc.ext.XUcExtComponent");
					map1.put("ios", "XUCExtendComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "mui-audio");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "MUIAudioView");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "userinfo-view-single-app");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.userinfoview.group.UserInfoGroupViewComponent");
					map1.put("ios", "UserViewGroupComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "e-teacher-community");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.community.teacher.BizComponent");
					map1.put("ios", "ETCTeacherCommunityComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "app-startup");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.xst.startup.XSTStartUpComponent");
					map1.put("ios", "XSTAppStartupComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "common_skin_component");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.common.res.CommonResComponent");
					map1.put("ios", "CommonSkinComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.smartcan.appfactory.maincomponent");
						map1.put("name", "ext-lightapp-hotupdate");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.smartcan.light.app.component.LightAppComponent");
					map1.put("ios", "APFLightAppComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.appfactory");
						map1.put("name", "jssdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.smartcan.appfactoryjssdk.JsSdkComponent");
					map1.put("ios", "APFJavascriptSDKComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "thirdlogincom");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.thirdlogin.ThirdLoginComponent");
					map1.put("ios", "OpenIDLoginComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "nduc-selector");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.nduc.selector.SelectorComponent");
					map1.put("ios", "UCSelectorComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-combined-page");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xst.combinedpage.CombinedPageComponent");
					map1.put("ios", "XCombinedPageComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "e-user-info");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.user.info.BizComponent");
					map1.put("ios", "EUIUserInfoComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "demo-rn");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.rncommon.demo.RNCommonComponent");
					map1.put("ios", "RNCommonComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "socialShare");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.socialshare.config.ShareComponent");
					map1.put("ios", "SocialShareComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "tag-sdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "TagsManager");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component.common");
						map1.put("name", "nd-avatarloader");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "MUIAvatar");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.library");
						map1.put("name", "cscom");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.cs.CsComponent");
					map1.put("ios", "CSComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "dyn-access-control");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.dynamic.controller.DynamicControllerComponent");
					map1.put("ios", "DynamicAccessControlComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "edu-studycontent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.content.lib.player.ContentLibPlayerComponent");
					map1.put("ios", "edu_contentlib_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.pbl");
						map1.put("name", "pblcomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.pbl.pblcomponent.base.LifeComponent");
					map1.put("ios", "pbl_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "x-user");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xuser.XUserComponent");
					map1.put("ios", "XUserComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "x-user-guide");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.ug.UserGuideComInit");
					map1.put("ios", "XUGUserGuideComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "appsetting");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.setting.guide.SettingComponent");
					map1.put("ios", "AppSettingComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "course");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.coursev5.CourseV5Component");
					map1.put("ios", "CectCourseV5ComponentImpl");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ele-channel");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.ele.channel.ChannelSpaceComponent");
					map1.put("ios", "el_channel_ios_component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "xs-commons");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xcloud_assemble.sdk.XCloudSdkComponent");
					map1.put("ios", "XCBaseComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "muitiplephoto");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "MUIPhotosBridge");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "rbaccmp");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.social.rbac.RBACComponent");
					map1.put("ios", "RbacComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "remark-name-mo");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.social3.remark.RemarkNameComponent");
					map1.put("ios", "RemarkNameComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "x-cloud-assemble");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.xcloud_assemble.XCloudAssembleComponent");
					map1.put("ios", "XCloudAssembleComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "imagepicker");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.photosbridge.PhotosbridgeComponent");
					map1.put("ios", "MUIPhotoSelector");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.hy.android");
						map1.put("name", "reader");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.reader.biz.ReaderComponent");
					map1.put("ios", "ElearnDocumentComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "mypagesdk");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.pagesdk.MypageSdkComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "mui-videocontroller");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.android.social.mediaRecorder.VideoComponent");
					map1.put("ios", "MUIVideoSupportComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ele-compulsory-learning-business");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "nd.sdp.elearning.studytasks.ElStudyTasksComponent");
					map1.put("ios", "ElearningMyTask_Componment");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp");
						map1.put("name", "uc_component");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.uc.UcComponent");
					map1.put("ios", "UCComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "el-rescard");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.refactor.elearning.carlibrary.ElCardComponent");
					map1.put("ios", "el_rescard_ios_Component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "el-smartlink");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.ele.smartlink.SmartLinkComponent");
					map1.put("ios", "ELSmartLComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.social");
						map1.put("name", "qr-code");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.qrcode.module.QRCodeComponent");
					map1.put("ios", "QRCodeComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.courseware");
						map1.put("name", "courseware-exercise-weaver");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.courseware.exerciseweaver.ExerciseWeaverComponent");
					map1.put("ios", "ExerciseWeaverComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.edu.component");
						map1.put("name", "el-router");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.edu.router.sdk.EleRouterComponent");
					map1.put("ios", "ELERouterComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "imcommonjsbridge");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "IMJSBridgeComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "configure");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.centralsdk.ConfigCentralComponent");
					map1.put("ios", "CCCConfigurationCentralComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(4));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.courseware");
						map1.put("name", "courseware-exercise-master");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.courseware.exercisemaster.ExerciseMasterComponent");
					map1.put("ios", "CoursewareExerciseMasterComponent");
					map1.put("type", "library");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "ele-my-study");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.hy.android.elearning.mystudy.EleMyStudyComponent");
					map1.put("ios", "Elearn_my_studyComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "social3-common");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "Social3Component");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "appfontcomponent");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.appfont.component.FontSizeComponent");
					map1.put("ios", "MUPAppFontComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.xst");
						map1.put("name", "mob-stat-sa");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "");
					map1.put("ios", "mob_stat_saComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(2));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "xcloud-class-activity");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
					map1.put("android", "com.nd.sdp.android.coursev5.coursehour.CourseV5HourComponent");
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
			stack.push(new ArrayList<>(1));
			map1.put("local-h5", stack.peek());
			{
				list1 = (ArrayList<Object>) stack.peek();
				stack.push(new LinkedHashMap<String, Object>(3));
				list1.add(stack.peek());
				{
					map1 = (Map<String, Object>) stack.peek();
					map1.put("host", "");
					map1.put("version", "1.60.63");
					stack.push(new LinkedHashMap<String, Object>(2));
					map1.put("component", stack.peek());
					{
						map1 = (Map<String, Object>) stack.peek();
						map1.put("namespace", "com.nd.sdp.component");
						map1.put("name", "model-app");
					}
					stack.pop();
					map1 = (Map<String, Object>) stack.peek();
				}
				stack.pop();
				list1 = (ArrayList<Object>) stack.peek();
			}
			stack.pop();
			map1 = (Map<String, Object>) stack.peek();
		}
		return map1;
	}
}
