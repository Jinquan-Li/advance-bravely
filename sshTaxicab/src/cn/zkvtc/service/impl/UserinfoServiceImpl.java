package cn.zkvtc.service.impl;

import cn.zkvtc.dao.UserinfoDao;
import cn.zkvtc.entity.Userinfo;
import cn.zkvtc.service.UserinfoService;

public class UserinfoServiceImpl implements UserinfoService{
	private UserinfoDao userinfoDao;
	
	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	@Override
	public Userinfo doLogin(Userinfo user) {
		return userinfoDao.doLogin(user);
	}

}
