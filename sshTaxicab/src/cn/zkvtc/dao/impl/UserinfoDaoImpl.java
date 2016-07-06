package cn.zkvtc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.zkvtc.dao.UserinfoDao;
import cn.zkvtc.entity.Userinfo;

public class UserinfoDaoImpl extends HibernateDaoSupport implements UserinfoDao{

	@Override
	public Userinfo doLogin(Userinfo user) {
		Session session = this.getSession();
		String hql = "select u from Userinfo u where u.userName=? and u.userPass=?";
		Query query = session.createQuery(hql);
		query.setString(0, user.getUserName());
		query.setString(1, user.getUserPass());
		List<Userinfo> list =query.list();
		Userinfo loginUser = list.get(0);
		return loginUser;
	}



	
}
