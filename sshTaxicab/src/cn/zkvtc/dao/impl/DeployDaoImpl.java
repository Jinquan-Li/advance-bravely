package cn.zkvtc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.zkvtc.dao.DeployDao;
import cn.zkvtc.entity.Deploy;

public class DeployDaoImpl  extends HibernateDaoSupport implements DeployDao{

	@Override
	//  根据  ID查询   
	public Deploy getById(int deployId) {
		Deploy deploy= (Deploy)this.getHibernateTemplate().get(Deploy.class, deployId);
		return deploy;
	}

	@Override  //  新增数据
	public int doAdd(Deploy deploy) {
		int count=0;
		 try {
			this.getHibernateTemplate().save(deploy);
			 count=1;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return count ;
	}

	@Override
	public int getDeployId() {
		String sql = "select IDENT_CURRENT('deploy') as d";
		String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String URL="jdbc:sqlserver://localhost:1433;DatabaseName=taxicab";
		String USERNAME="sa";
		String PASSWORD="qhit";
		int deployId = 0;
		try {
			Class.forName(DRIVER);//1.加载驱动
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			PreparedStatement psmt=  conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				deployId = rs.getInt("d");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deployId;
	}
	  


}
