package cn.zkvtc.entity;

public class Brand {
	private int brandId;
	private String brandNum;
	private String brandName;
	private int brandPrice;
	private int brandProof;
	private String brandText;
	private int deployId;
	private Deploy deploy;
	
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandNum() {
		return brandNum;
	}
	public void setBrandNum(String brandNum) {
		this.brandNum = brandNum;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getBrandPrice() {
		return brandPrice;
	}
	public void setBrandPrice(int brandPrice) {
		this.brandPrice = brandPrice;
	}
	public int getBrandProof() {
		return brandProof;
	}
	public void setBrandProof(int brandProof) {
		this.brandProof = brandProof;
	}
	public String getBrandText() {
		return brandText;
	}
	public void setBrandText(String brandText) {
		this.brandText = brandText;
	}
	
	public int getDeployId() {
		return deployId;
	}
	public void setDeployId(int deployId) {
		this.deployId = deployId;
	}
	public Deploy getDeploy() {
		return deploy;
	}
	public void setDeploy(Deploy deploy) {
		this.deploy = deploy;
	}
	
	


}
