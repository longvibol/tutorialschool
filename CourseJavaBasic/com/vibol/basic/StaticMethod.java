package com.vibol.basic;

public class StaticMethod {
	
	//non-static variable in class level
	int num = 10;
	
	// static variable in class level 
	static int staticNum = 20;

	public static void main(String[] args) {	
		
		
		// To call non-static method we need to create object 
		StaticMethod s = new StaticMethod();		
		s.sum();
		
		/*

		To declare a method static, use static keyword in method declare 
		
		public static int staticIntValue;
		
		
		public static int getStaticValue() {
			return staticIntValue;
		}
		
		*/		
		
	}
	
	// non-static method 
	public void sum() {
		System.out.println(num+num);
		System.out.println(staticNum+staticNum);
	}

}
