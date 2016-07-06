package cn.zkvtc.service;

import cn.zkvtc.entity.Deploy;

public interface DeployService {

public  Deploy getById (int deployId);  //根据Id查询
	
	public int doAdd( Deploy deploy);  //新增 数据
	
	public int getDeployId();
	

}
