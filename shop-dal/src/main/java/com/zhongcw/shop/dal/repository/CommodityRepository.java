package com.zhongcw.shop.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhongcw.shop.shared.po.Commodity;

public interface CommodityRepository extends CrudRepository<Commodity, String>
{
	Commodity findByCommodityCode(String commodityCode);

	Integer deleteByCommodityCode(String commodityCode);

	/*
	@Modifying
	@Query("")
	Integer updateByCommodityCode(@Param("commodity") Commodity commodity);
	*/
}
