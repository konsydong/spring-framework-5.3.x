package com.konsy.test;

import com.konsy.test.model.MyTestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : konsy
 * @date : 2022-08-23 22:29
 **/
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		// load bean from xml
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println("test:"+"testStr".equals(bean.getTestStr()));
	}
}
