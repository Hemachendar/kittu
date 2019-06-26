package com.staticm;
public class Thisofm 
{
	public  Thisofm() 
	{
		System.out.println("no pc");
	}
	public  Thisofm(int x) 
	{
		System.out.println("single pc"+x);
		
	}
	public  Thisofm(int x,int y) 
	{
		System.out.println(x+"two pc"+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thisofm t= new Thisofm();
      
       Thisofm t1=new Thisofm();
       Thisofm t2=new Thisofm();
       
       
	}

}
