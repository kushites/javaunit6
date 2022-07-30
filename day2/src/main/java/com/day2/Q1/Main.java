package com.day2.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
			Present sc = ctx.getBean("present", Present.class);
			
			sc.present(25, 22);
		}
		
}
