package com.superdot;

public class B extends A
{
	
	void show() 
	{
		int x=10;
		//x=x;
		//super.x=x;// call B Class verbal
		x=super.x;//call a class verbal 
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
	     obj.show();
	}

}
