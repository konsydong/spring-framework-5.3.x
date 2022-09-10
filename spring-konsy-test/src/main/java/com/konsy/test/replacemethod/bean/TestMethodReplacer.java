package com.konsy.test.replacemethod.bean;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author : konsy
 * @date : 2022-09-07 00:20
 **/
public class TestMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我替换了原有方法");
		return null;
	}
}
