package com.ravipracticeworkspace;

public class PrimitiveVariable 
{
 int x=100; //instance variable or global variable or non static variable
 static int  rateofintrst=8; //static variable
   static String sname = "vmware";
   
   public void m1() 
   {
	   System.out.println("iam m1 method");
	   int x=200;
	   System.out.println(this.x);
	   System.out.println(x);
   }
 
   public void m2() 
   {
	   
	   System.out.println("iam m2 method");
   }
	public static void main(String[] args)
	{
		PrimitiveVariable a=new PrimitiveVariable();
		a.m1();
		
		

	}

}
