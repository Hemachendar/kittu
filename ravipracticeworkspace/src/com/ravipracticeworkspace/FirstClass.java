package com.ravipracticeworkspace;

public class FirstClass 
{
 int a=10,b=30,result;
 
 public void addition() {
	 result = a+b;
	 System.out.println(result);
 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   FirstClass obj= new FirstClass();
   obj.addition();
   System.out.println(obj.a);
   System.out.println(obj.b);
   
	}

}
