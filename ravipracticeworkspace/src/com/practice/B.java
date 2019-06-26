package com.practice;

public class B extends A
{
   int x =10;   //instance variable or global variable or non static variable
	static int  rateofintrst=8; //static variable
	static String sname = "hema";
   
   public void m2() 
   {
	   int x=20;
		System.out.println("Iam m2 method in the B class");
	    System.out.println(x);
	    System.out.println(this.x);
	    System.out.println(sname);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B b=new B();
       b.m2();
       b.m1();
       
       //System.out.println(b.x);
       //System.out.println(B.sname);
	}

}
