package cn.zkvtc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zkvtc.entity.Userinfo;
import cn.zkvtc.service.UserinfoService;


public class userinfoTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserinfoService userService=(UserinfoService)applicationContext.getBean("userinfoService");
		Userinfo user = new Userinfo();
		user.setUserName("zhangsan");
		user.setUserPass("1234");
		Userinfo user2 =userService.doLogin(user);
		System.out.println(user2.getUserName()+"---"+user2.getUserPass());
	}
}
