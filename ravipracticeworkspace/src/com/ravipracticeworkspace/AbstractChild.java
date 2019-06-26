package com.ravipracticeworkspace;

public class AbstractChild extends AbstrctClass 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       AbstractChild obj =new AbstractChild();
       obj.m2();
       System.out.println(obj);
       obj.m1();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 Override method of Abstractclass ");
	}

}
