package com.hdfc.loans.carloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

 public class A 
 {
    public static void m1() throws FileNotFoundException
   {
    	
	 BufferedReader reader=new BufferedReader(new FileReader("abc.txt"));
		
   }
	public static void main(String[] args) throws FileNotFoundException  
	{
		
		m1();

	}

}
