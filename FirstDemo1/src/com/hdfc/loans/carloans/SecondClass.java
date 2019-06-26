package com.hdfc.loans.carloans;

public class SecondClass 
{
	int a,b,result=0;
	public int addition(int a,int b)
	{
		result=a+b;
		System.out.println("local addition result is:"+result);
		return result;
	}
	public int substraction(int a,int b)
	{
		result=a-b;
		System.out.println("local substraction result is:"+result);
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SecondClass res=new SecondClass();
		int x = res.addition(10,20);
		System.out.println(x);
		int y = res.substraction(50,20);
		System.out.println(y);

	}

}
