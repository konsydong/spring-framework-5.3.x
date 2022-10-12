package com.konsy.test.applicationevent.listener;

import com.konsy.test.applicationevent.bean.TestEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author : konsy
 * @date : 2022-10-11 20:51
 **/
public class TestListener implements ApplicationListener<TestEvent> {
	@Override
	public void onApplicationEvent(TestEvent event) {
		event.print();
	}
}
