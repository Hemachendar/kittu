package com.expection;

import java.util.Scanner;

public class Expection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nr,dr,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numaretar value");
		nr=sc.nextInt();
		System.out.println("enter denominater value");
		dr=sc.nextInt();
 
	    /*System.out.println("enter numaretar value");
		nr=sc.nextInt();
		System.out.println("enter denominater value");
		dr=sc.nextInt();*/
		while(true)
			{
			try 
			{
				result= nr/dr;
				System.out.println(result);
				//break;
			}
			catch(ArithmeticException e)
			{ 
				e.printStackTrace();
			}
			}
	}
	
}
