package com.expection;

import java.util.Scanner;

public class Excepaction extends Exception
{
	static int sal;
	static String no;
	
	/*public Excepaction(String msg1)
	{
		String msg = msg1;
		
	}*/
public Excepaction(String msg1) 
	{
       //String msg = msg1;
        super(msg1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
     
    while(true)
    {
    	try 
        {
        	System.out.println("enter Alphanumaric...:");
        	no = sc.nextLine();
        	if(no.length()!=10) 
        	{
    		throw new Excepaction("number should be 10 digits:");
        	}
        	else 
        	{
        		System.out.println("no :"+no);
        	}
        	System.out.println("enter salary");
        	sal=sc.nextInt();
        	if(sal<5000) 
        	
        		throw new Excepaction("salary shoud be greterthen 5000");
        	else 
        	
        		System.out.println("sal :"+sal);
        	
        	}
        catch(Excepaction obj)
        {
        	System.out.println(obj.getMessage());
        }
    }	
    
	}

}
