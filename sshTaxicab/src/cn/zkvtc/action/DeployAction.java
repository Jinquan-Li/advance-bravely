package cn.zkvtc.action;

import cn.zkvtc.entity.Deploy;
import cn.zkvtc.service.DeployService;

import com.opensymphony.xwork2.ActionSupport;

public class DeployAction  extends ActionSupport{
	private Deploy deploy;
	private DeployService deployService;
	private int deployId;
	
	public Deploy getDeploy() {
		return deploy;
	}
	public void setDeploy(Deploy deploy) {
		this.deploy = deploy;
	}
	public int getDeployId() {
		return deployId;
	}
	public void setDeployId(int deployId) {
		this.deployId = deployId;
	}
	public void setDeployService(DeployService deployService) {
		this.deployService = deployService;
	}
	
	public String getselect() throws Exception {
		 deploy = deployService.getById(deployId);
		 if(deploy!=null){
			 return SUCCESS;
		 }
		 return "found";
		
	}
}
