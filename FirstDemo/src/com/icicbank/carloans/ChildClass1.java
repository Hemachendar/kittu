package com.icicbank.carloans;

public class ChildClass1 implements FirstInterface1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 x=new ChildClass1();
		x.method1();

	}

	@Override
	public void method1() 
	{
		// TODO Auto-generated method stub
		System.out.println("override method1 in childclass1");
		
	}

}
