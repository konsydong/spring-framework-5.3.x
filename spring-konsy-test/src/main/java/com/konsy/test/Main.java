package com.konsy.test;

import com.konsy.test.container.config.MyConfig;
import com.konsy.test.container.model.MyUser;
import com.konsy.test.lookup.bean.GetBeanTest;
import com.konsy.test.replacemethod.bean.TestChangeMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : konsy
 * @date : 2022-08-03 23:28
 **/
public class Main {
//	// container main
//	public static void main(String[] args) {
//		// 获取容器
//		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
//		// 获取 bean
//		MyUser user = (MyUser) ac.getBean("myUser");
//		System.out.println(user.toString());
//	}

	// lookup main
//	public static void main(String[] args) {
//		ApplicationContext bf = new ClassPathXmlApplicationContext("lookup/lookupTest.xml");
//		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
//		test.showMe();
//	}

	// replace method
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("replacemethod/replaceMethodTest.xml");
		TestChangeMethod test = (TestChangeMethod) bf.getBean("testChangeMethod");
		test.changeMe();
	}
}
