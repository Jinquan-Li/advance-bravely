package cn.zkvtc.dao;

import cn.zkvtc.entity.Deploy;

public interface DeployDao {
	  
	public  Deploy getById (int deployId);  //����Id��ѯ
	
	public int doAdd( Deploy deploy);  //���� ����
	
	public int getDeployId();

}
