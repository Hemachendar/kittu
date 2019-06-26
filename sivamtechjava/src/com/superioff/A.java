package com.superioff;

public class A 
{
A()
{
	
System.out.println("parent");
}
}
 class B extends A
{
	B()
	{
		System.out.println("child");
	}
}
 class m
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  B obj=new B();
  /*note : default constructor is call by the parent class constructor*/
  
	}	
}