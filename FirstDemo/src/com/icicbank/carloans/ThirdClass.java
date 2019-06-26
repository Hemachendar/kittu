package com.icicbank.carloans;

public class ThirdClass {
	
	int a,b,result;
	
     public int addistion(int a,int b) 
     {
    	result= a+b;
    	System.out.println("local addition result is:"+result);
		return result;
    	 
     }
     public int substraction(int a,int b) {
    	 result=a-b;
    	 System.out.println("local subsraction result is:"+result);
		return result;
    	 
    	 
     }
     public int maltipication(float a,float b) {
    	 
    	 result=(int) (a-b);
    	 System.out.println("local maltipication result is:"+result);
		return result;
     }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 System.out.println("Hi hema");
	 
	 ThirdClass obj=new ThirdClass();
	 int x = obj.addistion(1, 8);
	 System.out.println(x);
	 int y = obj.substraction(2, 3);
	 System.out.println(y);
	 int z = obj.maltipication(10, 20);
	 System.out.println(z);
	 

	}

}
