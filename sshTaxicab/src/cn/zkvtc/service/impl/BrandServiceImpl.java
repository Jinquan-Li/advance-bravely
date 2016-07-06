package cn.zkvtc.service.impl;

import java.util.List;

import cn.zkvtc.dao.BrandDao;
import cn.zkvtc.entity.Brand;
import cn.zkvtc.service.BrandService;

public class BrandServiceImpl implements BrandService{

	private  BrandDao brandDao;
	
	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	@Override
	public List<Brand> getAll() {
		return brandDao.getAll();
	}

	@Override
	public List<Brand> getBrandName(String BrandName) {
		return brandDao.getBrandName(BrandName);
	}

	@Override
	public List<Brand> getBrandPrice(int begien, int last) {
		return brandDao.getBrandPrice(begien, last);
	}
	
	public int doadd(Brand brand){
		return brandDao.doadd(brand);
	}

	@Override
	public List<Brand> getSelect(String BrandName, int begien, int last) {
		return brandDao.getSelect(BrandName, begien, last);
	}

	@Override
	public Brand getById(int brandId) {
		return brandDao.getById(brandId);
	}

	@Override
	public void updateProof(Brand brand) {
		brandDao.updateProof(brand);
	}

}
