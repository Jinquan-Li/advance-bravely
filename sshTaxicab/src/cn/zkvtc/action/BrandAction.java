package cn.zkvtc.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import cn.zkvtc.entity.Brand;
import cn.zkvtc.entity.Deploy;
import cn.zkvtc.service.BrandService;
import cn.zkvtc.service.DeployService;

import com.opensymphony.xwork2.ActionSupport;

public class BrandAction extends ActionSupport implements ServletRequestAware {
	private Brand brand;
	private Deploy deploy;
	private BrandService brandService;
	private DeployService deployService;
	private HttpServletRequest request;
	
	private String BrandName;  //Ʒ����
	private int begien;   //  ��Χ����  ��ʼ	
	private int last;   // ��Χ����  ���
	private int brandId;//���Id �޸�
	private int  ss;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	
	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public int getBegien() {
		return begien;
	}

	public void setBegien(int begien) {
		this.begien = begien;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	public Deploy getDeploy() {
		return deploy;
	}

	public void setDeploy(Deploy deploy) {
		this.deploy = deploy;
	}

	public void setDeployService(DeployService deployService) {
		this.deployService = deployService;
	}
		
	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	//��ѯ���� �� ��Ϣ
	public String dolist() throws Exception {
		 List<Brand> list  = brandService.getAll();
		 if(list!=null){
			 request.setAttribute("list",list);
			 return "list";
		 }
		return "found";
		
	}

	//��ѯ����
	public String doSelect() throws Exception {
	if(BrandName!=null&& begien!=0&&last!=0){
		List<Brand> list = brandService.getSelect(BrandName, begien, last);
	}else if(BrandName!=null&BrandName.length()>0){
			List<Brand> list = brandService.getBrandName(BrandName);
			 request.setAttribute("list",list);
	}else{
			List<Brand> list = brandService.getBrandPrice(begien, last);
			request.setAttribute("list",list);
		}
		return "list";
	}
	//�������
	public String doAddAll() throws Exception {
		deployService.doAdd(deploy);
		int deployId = deployService.getDeployId();
		brand.setDeployId(deployId);
		brandService.doadd(brand);
		return "list2";
	}
	//�޸ĳ���״̬
	public String updateBrand() throws Exception {
		brand= brandService.getById(brandId);
		if(brand.getBrandProof()==1){
			brand.setBrandProof(0);
		}else{
			brand.setBrandProof(1);
		}
		brandService.updateProof(brand);
		return "list2";
		
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request =arg0;
	}
	
	
}
