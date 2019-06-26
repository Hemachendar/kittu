package com.staticm;

public class Staticm2 
{
 int x=20;
 static int y=40;
 public void show() {
	 System.out.println(x);
	 System.out.println(y);
 }
 public static void disp() 
 {
	//System.out.println(x); x is non static 
	System.out.println(y);
 }
	public static void main(String[] args) {
		
		Staticm2.disp();
		System.out.println(Staticm2.y);

	}

}
