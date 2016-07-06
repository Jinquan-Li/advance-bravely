package cn.zkvtc.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zkvtc.entity.Brand;
import cn.zkvtc.entity.Deploy;
import cn.zkvtc.entity.Userinfo;
import cn.zkvtc.service.BrandService;
import cn.zkvtc.service.UserinfoService;

public class BrandTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BrandService brandService=(BrandService)applicationContext.getBean("brandService");
		
		//��ѯ����
		
		List<Brand> list = brandService.getAll();
		for (Brand brand : list) {
			System.out.println(brand.getBrandId()+"---"+brand.getBrandName()+"----"+brand.getBrandNum()+"---"+brand.getBrandPrice());
	
		}
		//ģ����ѯ  ��Ʒ��
		List<Brand> list2 = brandService.getBrandName("��");
		for (Brand brand2 : list2) {
			System.out.println(brand2.getBrandId()+"---"+brand2.getBrandName()+"----"+brand2.getBrandNum()+"---"+brand2.getBrandPrice());
	
		}
	//��ѯ ��Ǯ  
		List<Brand> list3 = brandService.getBrandPrice(60,1000000);
		for (Brand brand2 : list3) {
			System.out.println(brand2.getBrandId()+"---"+brand2.getBrandName()+"----"+brand2.getBrandNum()+"---"+brand2.getBrandPrice());
	
		}
	// ����  ��Ϣ
		
		Deploy deploy = new Deploy();
		Brand brand = new Brand();
		brand.setBrandName("����");
		brand.setBrandNum("ԥC463");
		brand.setBrandPrice(150);
		brand.setBrandProof(1);
		brand.setBrandText("������");
		brand.setDeployId(1);
		int count =brandService.doadd(brand);
		System.out.println(count);
	}
	
	
}
