package com.superioff;

public class Demo 
{
Demo(int x)
{
	System.out.println("parent");
	}
}
class Demo2
{
	Demo2(String y)
	{
		System.out.println("child");
	}
}
class Demo3
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo d=new Demo(10);
        Demo2 d1=new Demo2("name");
        /*Constructor con't inheritance one class to anther class*/
	}
}

