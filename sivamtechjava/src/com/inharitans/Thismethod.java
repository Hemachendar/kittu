package com.inharitans;
public class Thismethod 
{
	int x=10;
	public void show() 
	{
		int x=50;
		x=this.x;
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thismethod t=new Thismethod();
		t.show();
	}

}
