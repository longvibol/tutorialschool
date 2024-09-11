package com.vibol.basic;

public class StaticDemo {
	
	static String com = "Oracel";

	public static void main(String[] args) {
		
	
		StaticDemo sv = new StaticDemo();	
		
		sv.printEmployeeInformation(200, "StuA");
		sv.printEmployeeInformation(201, "Sopheak");
		
		sv.com = "google";
		
		StaticDemo sv1 = new StaticDemo();		
		
		sv1.printEmployeeInformation(100, "dara");
		sv1.printEmployeeInformation(101, "thida");

	}

	
	public void printEmployeeInformation(int id, String name) {
		System.out.println(id);
		System.out.println(name);
//		System.out.println(com);
		System.out.println(StaticDemo.com);
	}
}
