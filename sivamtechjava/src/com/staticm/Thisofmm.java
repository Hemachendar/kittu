package com.staticm;

public class Thisofmm {
	public Thisofmm() 
	{
		this(20,30);
		System.out.println("no pc");
	}
	public Thisofmm(int x) 
	{
		System.out.println("single pc"+x);
		
	}
	public Thisofmm(int x,int y) 
	{
		this(55);
		System.out.println(x+"two pc"+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thisofmm t= new Thisofmm();
      
       
	}

}

