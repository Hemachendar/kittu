package com.superioff;

public class DemoB extends DemoA
{
	DemoB(int x,String m)
	{
		super(10);
		System.out.println("enter int and string values"+ x);
		System.out.println(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DemoB obj= new DemoB(15, "hema");
	}

}
