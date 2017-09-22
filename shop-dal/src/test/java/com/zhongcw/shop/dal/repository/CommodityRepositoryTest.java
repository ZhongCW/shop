package com.zhongcw.shop.dal.repository;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhongcw.shop.shared.po.Commodity;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommodityRepositoryTest
{
	// Commodity findByCommodityCode(String commodityCode);
	//
	// Integer deleteByCommodityCode(String commodityCode);

	@Autowired
	CommodityRepository commodityRepository;

	@BeforeClass
	public void save()
	{
		commodityRepository.save(new Commodity("cmit-1"));
	}

	@Test
	public void testFindByCommodityCode()
	{
		Commodity commodity = commodityRepository.findByCommodityCode("cmit-1");
		commodity.getCommodityCode();

		assertThat(commodity.getCommodityCode(), equalTo("cmit-1"));

	}

	public void deleteByCommodityCode()
	{

	}

}
