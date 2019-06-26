package com.ravipracticeworkspace;

public class InstentandStaticverable 
{
	int x=100; //instance variable or global variable or non static variable
	 static int  rateofintrst=8; //static variable
	   static String sname = "vmware";
	   public void m1() 
	   {
		   System.out.println("iam instance variable in m1 method");
	   }
	   public void m2()
	   {
		   System.out.println("iam instance variable in m2 method");
	   }
	   public static void m3()
	   {
		   System.out.println("iam static method in m3");
		   InstentandStaticverable a=new InstentandStaticverable();
		   System.out.println(a.x);
		   a.m1();
		   a.m2();
		   
		   System.out.println(sname);
		   System.out.println(rateofintrst);
		   
	   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstentandStaticverable a=new InstentandStaticverable();
		
		System.out.println(a.x);
		//System.out.println(a.rateofintrst); 
		//System.out.println(a.sname);
		System.out.println(rateofintrst);
		System.out.println(sname);
		
		a.m1();
		a.m2();
		//a.m3();
		m3();
	}

}
