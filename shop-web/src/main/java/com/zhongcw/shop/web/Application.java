package com.zhongcw.shop.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @ComponentScan("com.zhongcw.shop..*")
@EnableJpaRepositories // ("com.zhongcw.shop.dal.repository")
@EntityScan("com.zhongcw.shop.shared.po")
public class Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}
}
