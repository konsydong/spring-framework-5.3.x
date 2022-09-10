package com.konsy.test.lookup.bean;

/**
 * @author : konsy
 * @date : 2022-09-06 23:39
 **/
public abstract class GetBeanTest {
	public void showMe() {
		this.getBean().showMe();
	}
	public abstract User getBean();
}
