package com.ravipracticeworkspace;

public class ChildClass implements FirstInterface1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass d= new ChildClass();
		d.method1();
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Override the method1 in a childclass ");
	}

}
