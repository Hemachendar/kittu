package com.practice;

public class FirstClass 
{
	int c=0;
	public int addition(int a,int b) 
	{
		c=a+b;
		System.out.println("addition of a & b is local is:"+c);
		return c;
		
	}

	public static void main(String[] args)
	{
		System.out.println("Hi !");
		FirstClass f=new FirstClass();
		f.addition(100, 300);
		System.out.println(f);
		FirstClass f1=new FirstClass();
		f1.addition(200, 100);
	}

}
