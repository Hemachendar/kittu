package com.icicbank.carloans;

public class FirstClass 
{
	int a=10,b=20,c=30,result=0;
	
	public void addition()
	{
		result=a+(b-c);
		System.out.println(result);
		
	}
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("Hello world");
		
		FirstClass obj = new FirstClass();
		obj.addition();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		FirstClass obj1 =new FirstClass();
		obj1.addition();

	}

}
