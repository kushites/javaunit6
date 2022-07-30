package com.day2.Q1;

public class Service {
			
		private Dao d;

		public void setD(Dao d) {
			this.d = d;
		}
		 
		public void Calculate(int a, int b) {
		System.out.println(d.substraction(a, b));	
			System.out.println(d.sum(a, b));
			System.out.println(d.multiplication(a, b));
			
		}
		
}
