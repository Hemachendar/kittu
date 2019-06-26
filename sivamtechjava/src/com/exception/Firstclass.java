package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Firstclass
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		while(true) 
		{
			try
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter x value");
			x=sc.nextInt();
			System.out.println("enter y value");
			y=sc.nextInt();
			
				z=x/y;
				System.out.println("enter z value :"+z);
			}
			catch(ArithmeticException e)
			{
				System.out.println("denominator should not be zero");
			}
			catch(InputMismatchException e) 
			{
				
				System.out.println("user frindly msg");
			}	
		}
	}

}
