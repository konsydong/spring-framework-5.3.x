package com.konsy.test.proxy.jdk.service.impl;

import com.konsy.test.proxy.jdk.service.UserService;

/**
 * @author : konsy
 * @date : 2022-10-12 23:15
 **/
public class UserServiceImpl implements UserService {
	@Override
	public void add() {
		System.out.println("-----------------add-----------------");
	}
}
