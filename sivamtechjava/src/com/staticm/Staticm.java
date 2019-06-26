package com.staticm;

public class Staticm 
{
	int x= 10;
	static int y=20;
	public void show() 
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void disp() 
	{
		//System.out.println(x);
		System.out.println(y);
	}


	public static void main(String[] args) 
	{
		Staticm s= new Staticm();
		s.show();
		s.disp();
		System.out.println(s.x);
		System.out.println(s.y);
		

	}
}

