package com.hdfc.loans.carloans;

public class Construct
{
    int eno;
    String ename;
	public Construct(int eno, String ename) 
	{
	  this.eno=eno;
	  this.ename=ename;
	}
	
	public static void main(String[] args) 
	{
		
     Construct c1=new Construct(10,"swathi");
     System.out.println(c1.eno);
     System.out.println(c1.ename);
     
     Construct c2=new Construct(20,"employ");
     System.out.println(c2.eno);
     System.out.println(c2.ename);
    
   	}
	

}
