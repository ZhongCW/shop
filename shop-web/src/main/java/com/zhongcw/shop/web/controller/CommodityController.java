package com.zhongcw.shop.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commodity")
public class CommodityController
{
	@Value("${vps.host}")
	String host;

	@RequestMapping("/save.html")
	public Object saveCommodity()
	{
		// System.out.println(new
		// BaseEntity().getLast_update_time().toString());
		return com.zhongcw.shop.shared.util.ResourceRead.getProperty("projectName");
	}
}
