package com.icicbank.homeloans;

public class Hdfc1 implements Rbi
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc1 h=new Hdfc1();
		h.withdrawal();

	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("iam override withdrawal in hdfc1 class");
		
	}

}
