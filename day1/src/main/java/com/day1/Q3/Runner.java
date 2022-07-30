package com.day1.Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
			        Circle c=   ctx.getBean("c",Circle.class);
			        c.draw();
			        
			        Triangle t = ctx.getBean("t",Triangle.class);
			        t.draw();
			        
			        Cyclinder cy = ctx.getBean("cy", Cyclinder.class);
			        cy.draw();
			   
		}
}
