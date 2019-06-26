package com.icicbank.homeloans;

public class Icici implements Rbi
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Icici i=new Icici();
		i.withdrawal();

	}

	@Override
	public void withdrawal() {
		
	// TODO Auto-generated method stub
		System.out.println("iam override withdrawal method1 in Iciciclass");
		
	}

}
