package com.day2.Q1;

public class Present {
		private Service s;

		public void setS(Service s) {
			this.s = s;
		}
		public void present(int a, int b) {
			s.Calculate(a, b);
		}
		
		
}
