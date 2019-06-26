package com.practice;

public class Icici implements InterfaceRbi
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici obj1=new Icici();
		obj1.withdrawal();
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("iam Override wuthdrawal in ICICI ");
	}

}
