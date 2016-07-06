package cn.zkvtc.action;

import java.util.Map;

import javax.xml.registry.infomodel.User;

import org.apache.struts2.interceptor.SessionAware;

import cn.zkvtc.entity.Userinfo;
import cn.zkvtc.service.UserinfoService;

import com.opensymphony.xwork2.ActionSupport;

public class UserinfoAction extends ActionSupport implements SessionAware {
	private Userinfo user;
	private UserinfoService userinfoService;
	private Map session;
	public Userinfo getUser() {
		return user;
	}
	public void setUser(Userinfo user) {
		this.user = user;
	}
	public UserinfoService getUserinfoService() {
		return userinfoService;
	}
	public void setUserinfoService(UserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}
	
	// ÓÃ»§µÇÂ¼
	public String doLogin() throws Exception {
		user = userinfoService.doLogin(user);
		 if(user!=null){
				session.put("user", user);
				return "list";
			}else{
				//µÇÂ¼Ê§°Ü
				return "login";
			}
		 
	}
	public void setSession(Map<String, Object> arg0) {
		session=arg0;
	}

}
