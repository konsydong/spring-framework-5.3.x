package com.konsy.test.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : konsy
 * @date : 2022-10-12 23:16
 **/
public class MyInvocationHandler implements InvocationHandler {
	/**
	 * 目标对象
	 */
	private Object target;


	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 在目标对象的方法执行前打印一下
		System.out.println("-----------------before-----------------");
		Object result = method.invoke(target, args);
		// 在目标对象的方法执行后打印一下
		System.out.println("-----------------after-----------------");
		return result;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
	}

}
