package com.zhongcw.shop.shared.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ResourceRead
{
	private static final Properties properties = new Properties();

	private static final String RES_PATH = "/config/test.properties";

	public static String getProperty(String paramName)
	{
		Resource resource = new ClassPathResource(RES_PATH);
		try
		{
			properties.load(resource.getInputStream());
		} catch (IOException e)
		{
			// new IOException("自定义配置文件加载失败！");
			e.printStackTrace();
		}
		return properties.getProperty(paramName);
	}
}
