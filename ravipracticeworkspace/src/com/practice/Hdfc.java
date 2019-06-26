package com.practice;

public class Hdfc implements InterfaceRbi
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc obj=new Hdfc();
		obj.withdrawal();
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("iam Override withdrawal in HDFC Class");
	}

}
