package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		ListSetMap lsm = (ListSetMap) context.getBean("listsetmap");
		lsm.getList();
		lsm.getSet();
		lsm.getMap();

	}

}
