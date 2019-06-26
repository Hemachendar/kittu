package com.staticm;

public class Thism1
{
	int x;
	public void show() 
	{
		int x=20;
		//this.x=x; 
		x=this.x;
		//x=x;
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thism1 t=new Thism1();
		t.show();
	}

}
