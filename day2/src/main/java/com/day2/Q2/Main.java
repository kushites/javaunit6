package com.day2.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main(String[] args) {
			ApplicationContext ct = new ClassPathXmlApplicationContext("applicationcontext.xml");
			LifeCycle lf =ct.getBean("lf", LifeCycle.class);
			
			lf.dummy();
			
			ClassPathXmlApplicationContext cx = (ClassPathXmlApplicationContext)ct;
				cx.close();
				
				System.out.println("Init-method - This method comes in action when we configure the bean class by init method and after we call the applicationcontext obj all init method will be simultaneously.");
				System.out.println("Destroy-method - This method will be called when close the appliication context object by close method");
				
		}
}
