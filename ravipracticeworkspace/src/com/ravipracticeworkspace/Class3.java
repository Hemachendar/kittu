package com.ravipracticeworkspace;

public class Class3 
{
     int a,b,result;
     public int addition(int a,int b) 
     {
    	result = a+b;
    	System.out.println("local addition result is:" + result);
		return result;
     }
     public int subsrtaction(int a,int b) 
     {
    	result = a-b;
    	System.out.println("local subtractin result is:"+ result);
		return result;
     }
     
     public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Class3 obj=new Class3();
	int x = obj.addition(10,21);
	System.out.println(x);
	int y = obj.subsrtaction(20,30);
	System.out.println(y
			);
	
	
	
	
	}

}
