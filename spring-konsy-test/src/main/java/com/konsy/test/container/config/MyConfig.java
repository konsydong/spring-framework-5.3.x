package com.konsy.test.container.config;

import com.konsy.test.container.model.MyUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : konsy
 * @date : 2022-08-03 23:28
 **/
@Configuration
public class MyConfig {
	@Bean
	public MyUser myUser(){
		return new MyUser("konsy","123456");
	}
}
