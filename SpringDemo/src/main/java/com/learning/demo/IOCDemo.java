package com.learning.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("context.xml");

	}

}
