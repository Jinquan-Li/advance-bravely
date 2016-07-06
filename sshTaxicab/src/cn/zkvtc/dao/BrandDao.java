package cn.zkvtc.dao;

import java.util.List;

import cn.zkvtc.entity.Brand;

public interface BrandDao {
	public List<Brand> getAll();   //��ѯ��������Ϣ
	
	public List<Brand> getBrandName(String BrandName);  ///   ģ���ѯ  
	
	public List<Brand> getBrandPrice(int begien  ,int last);   //  ������ѯ
	
	public int doadd(Brand brand);  //  ����  ��Ϣ
	
	
	public List<Brand>  getSelect(String BrandName ,int begien, int last);//  ����������Ϊ��
	
	public Brand getById(int brandId);  //���Id ��ѯ
	
	public void updateProof (Brand brand); //  �޸� ���⳵״̬
	
	
	
	

}
