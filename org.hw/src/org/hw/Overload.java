package org.hw;

public class Overload{
	
	public void  sum(int x,int y) 
	{
		
	   
	System.out.println("sum is "+ (x+y));
		
	}
	void sum(int j,float z) 
	{
		System.out.println("sum is"+(j-z));
		
	}
	
	public static void main(String[] args) {
		
		Overload d= new Overload();
		d.sum(20, 10.5f);
		d.sum(10, 5);
		
		
	}

}
