package com.konsy.test.applicationevent.bean;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;
import java.time.Clock;

/**
 * @author : konsy
 * @date : 2022-10-11 20:50
 **/
public class TestEvent extends ApplicationEvent implements Serializable {
	private static final long serialVersionUID = -6329894506996850106L;
	private String msg;
	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public void print() {
		System.out.println(msg);
	}
}
