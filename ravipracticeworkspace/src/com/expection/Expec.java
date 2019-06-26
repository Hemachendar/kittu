package com.expection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Expec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nr,dr,result=0;
        Scanner sc=new Scanner(System.in);
        
        
        while(true) 
        {
        	System.out.println("enter numaretar velue");
            nr=sc.nextInt();
            System.out.println("enter denominater value");
            dr=sc.nextInt();
        	
        	try 
            {
            	result=nr/dr;
            	System.out.println(result);
            }
            catch(ArithmeticException e) 
            {
             e.printStackTrace();
            }
        	catch(InputMismatchException e) 
        	{
        		System.out.println("user frandly msg");
        	}
        
        }
	}

}
