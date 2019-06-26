package com.icicbank.carloans;

public class ChildClass implements FirstInterface

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c= new ChildClass();
		c.method1();

	}

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("override method1 in child class");
	}

}
