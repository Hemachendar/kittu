package com.icicbank.carloans;

public class SecondClass implements FirstInterface {
	int  a, b, result= 0;
	
	public int addition(int a,int b)
	{
		result=a+b;
		System.out.println("local eddition result is: "+result);
		return result;
			

	}

	public int substraction (int a,int b)
	{
	result=a-b;
	System.out.println("local substraction result is:"+result);
	return result;
		
	}
	public int maltipication(int a,int b)
	{
		result=a*b;
		System.out.println("local maltipication result is:"+result);
		return result;
		
	}
	public static void main(String[] args)
	
	{
		
		SecondClass res=new SecondClass();
		int x = res.addition(10,20);
		System.out.println(x);
		int y = res.substraction(5,2);
		System.out.println(y);
		int z = res.maltipication(3,2);
		System.out.println(z);
		SecondClass m=new SecondClass();
		m.addition(2, 2000);
		
		
		
	

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("iam addition in SecondClass");
		
	}

}
