package com.hdfc.loans.carloans;

public class DefaultConstructor 
{
    public DefaultConstructor()
    {
    	System.out.println("hi iam deafault constructor..");
    }
    
	public DefaultConstructor(int i) 
	{
		this();
		System.out.println(i);
	}

	public DefaultConstructor(int i, String string) 
	{
		this(i);
		System.out.println(i);
		System.out.println(string);
	}

	public static void main(String[] args)
	{
		//DefaultConstructor obj=new DefaultConstructor();
		//DefaultConstructor obj1=new DefaultConstructor(100);
		DefaultConstructor obj2=new DefaultConstructor(1000,"swathi");
	}

}
