package com.konsy.test.proxy;

import com.konsy.test.proxy.handler.MyInvocationHandler;
import com.konsy.test.proxy.service.UserService;
import com.konsy.test.proxy.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * @author : konsy
 * @date : 2022-10-12 23:20
 **/
public class ProxyTest {
	@Test
	public void testProxy() throws Throwable {
		// 实例化目标对象
		UserService userService = new UserServiceImpl();
		// 实例化InvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		// 根据目标对象生成代理对象
		UserService proxy = (UserService) invocationHandler.getProxy();
		// 调用代理对象的方法
		proxy.add();

	}
}
