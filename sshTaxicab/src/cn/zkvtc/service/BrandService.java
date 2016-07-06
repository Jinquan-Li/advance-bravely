package cn.zkvtc.service;

import java.util.List;

import cn.zkvtc.entity.Brand;

public interface BrandService {
public List<Brand> getAll();   //查询所有汽车信息
	
	public List<Brand> getBrandName(String BrandName);  ///   模糊查询  
	
	public List<Brand> getBrandPrice(int begien  ,int last);   //  条件查询

	public int doadd(Brand brand);  //  新增  信息
	
	public List<Brand>  getSelect(String BrandName ,int begien, int last); //  所有条件不为空
	
	public Brand getById(int brandId);  //根据Id 查询
	
	public void updateProof (Brand brand); //  修改 出租车状态
}
