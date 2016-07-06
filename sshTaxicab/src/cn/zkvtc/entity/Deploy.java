package cn.zkvtc.entity;

import java.util.HashSet;
import java.util.Set;


public class Deploy {
	private int deployId;
	private String deployName;
	private String deployFuel;
	private int deployNum;
	private int deployDoor;
	private int  brandId;
	
	public int getDeployId() {
		return deployId;
	}
	public void setDeployId(int deployId) {
		this.deployId = deployId;
	}
	public String getDeployName() {
		return deployName;
	}
	public void setDeployName(String deployName) {
		this.deployName = deployName;
	}
	public String getDeployFuel() {
		return deployFuel;
	}
	public void setDeployFuel(String deployFuel) {
		this.deployFuel = deployFuel;
	}
	public int getDeployNum() {
		return deployNum;
	}
	public void setDeployNum(int deployNum) {
		this.deployNum = deployNum;
	}
	public int getDeployDoor() {
		return deployDoor;
	}
	public void setDeployDoor(int deployDoor) {
		this.deployDoor = deployDoor;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	
	

}
