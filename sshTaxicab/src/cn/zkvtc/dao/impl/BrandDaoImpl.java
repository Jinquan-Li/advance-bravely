package cn.zkvtc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.zkvtc.dao.BrandDao;
import cn.zkvtc.entity.Brand;

public class BrandDaoImpl extends HibernateDaoSupport implements BrandDao {

	@Override//  查询所有
	public List<Brand> getAll() {
		
		return this.getHibernateTemplate().find("from Brand");
	}

	@Override   //  汽车品牌查询    模糊查询
	public List<Brand> getBrandName(String BrandName) {
		Session session = this.getSession();
	    String hql="select b from  Brand b where  b.brandName like '%"+BrandName+"%'";
	    Query query = session.createQuery(hql);
	     List<Brand> list= query.list();
		return list;
	}

	@Override // 汽车价钱   范围查找
	public List<Brand> getBrandPrice(int begien, int last) {
		Session session = this.getSession();
		String hql="select b from Brand b ";
		if(begien!=0){
			hql+="where b.brandPrice>="+begien;
			if(last!=0){
				hql+=" and b.brandPrice <="+last;
			}
		}else{
			if(last!=0){
				hql+=" where b.brandPrice <="+last;
			}
		}
		Query query = session.createQuery(hql);
	     List<Brand> list= query.list();
		return list;
	}
	//汽车品牌查询   都不为空的情况下 (模糊查询不为空  ，范围查找不为空)
	
	public List<Brand> getSelect (String BrandName ,int begien, int last){
		Session session = this.getSession();
		 List<Brand> list = new ArrayList<Brand>();
		if(BrandName!=null&& begien!=0&&last!=0){
			String hql="select b from Brand b where  b.brandName like '%"+BrandName+"%' and b.brandPrice>="+begien+" and b.brandPrice <="+last+"  ";
			Query query = session.createQuery(hql);
		     list= query.list();
		}
		return list;
		
		
		
	}

	@Override  //新增
	public int doadd(Brand brand) {
		int count=0;
		try {
			brand.setBrandId(1);
			this.getHibernateTemplate().save(brand);
			count=1;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override//获取Id
	public Brand getById(int brandId) {
		Brand brand=(Brand)this.getHibernateTemplate().get(Brand.class, brandId);
		return brand;
	}

	@Override//修改状态
	public void updateProof(Brand brand) {
		this.getHibernateTemplate().update(brand);
		
	}

}
