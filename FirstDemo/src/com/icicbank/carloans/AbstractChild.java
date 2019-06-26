package com.icicbank.carloans;

public class AbstractChild extends FirstAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AbstractChild obj=new AbstractChild();
       obj.m1();
       obj.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 is override method of abstract");
	}

}
