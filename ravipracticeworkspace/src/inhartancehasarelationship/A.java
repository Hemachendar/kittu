package inhartancehasarelationship;

public class A 
{
	public void m1()
	{
		System.out.println("iam m1 method in has a relation");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A x=new A();
		x.m1();
		
		ABC a=new ABC();
		a.king();
	}

}
