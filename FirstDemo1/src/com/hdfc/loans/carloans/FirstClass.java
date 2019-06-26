package com.hdfc.loans.carloans;

public class FirstClass {
	
    int a=10,b=20,result=0;
    
    public void addition()
    {
    	result=a+b;
    	System.out.println(result);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	  System.out.println("success");
	   
	   FirstClass obj=new FirstClass();
	   obj.addition();
	   System.out.println(obj.a);
	   
	   FirstClass obj1=new FirstClass();
	   obj1.addition();
	   

	}

}
