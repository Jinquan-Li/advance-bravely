package cn.zkvtc.service;

import cn.zkvtc.entity.Deploy;

public interface DeployService {

public  Deploy getById (int deployId);  //����Id��ѯ
	
	public int doAdd( Deploy deploy);  //���� ����
	
	public int getDeployId();
	

}
