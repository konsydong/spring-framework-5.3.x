package com.konsy.test;

import com.konsy.test.config.MyConfig;
import com.konsy.test.model.MyUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : konsy
 * @date : 2022-08-03 23:28
 **/
public class Main {
	public static void main(String[] args) {
		// 获取容器
		ApplicationContext ac =new AnnotationConfigApplicationContext(MyConfig.class);
		// 获取 bean
		MyUser user = (MyUser) ac.getBean("qmyUser");
		System.out.println(user.toString());
	}
}
