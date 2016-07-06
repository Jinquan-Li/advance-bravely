package cn.zkvtc.service.impl;

import cn.zkvtc.dao.DeployDao;
import cn.zkvtc.entity.Deploy;
import cn.zkvtc.service.DeployService;

public class DeployServicImpl implements DeployService {
	private DeployDao deployDao;

	public void setDeployDao(DeployDao deployDao) {
		this.deployDao = deployDao;
	}

	@Override
	public Deploy getById(int deployId) {
		return deployDao.getById(deployId);
		
	}

	@Override
	public int doAdd(Deploy deploy) {
		return deployDao.doAdd(deploy);
	}

	@Override
	public int getDeployId() {
		return deployDao.getDeployId();
	}
	

}
