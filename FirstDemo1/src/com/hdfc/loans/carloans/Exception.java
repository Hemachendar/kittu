package com.hdfc.loans.carloans;

import java.util.Scanner;

public class Exception 
{

	public static void main(String[] args)
	{
		
      int nr,dr,result=0;
      Scanner scr=new Scanner(System.in);
      
     while(true)
     {
    	 System.out.println("Enter numerator value: ");
         nr=scr.nextInt();
         System.out.println("Enter denominator value: ");
         dr=scr.nextInt();
    	 try
     	  {
     		  result=nr/dr;
     	      System.out.println(result);
     	      break;
     	  }
         catch(ArithmeticException e)
          {
               e.printStackTrace();
               System.out.println(e);
               System.out.println("Denominator value should be greatethan zero...");
   	      }
    	 catch(NullPointerException e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     
	}
	
}
