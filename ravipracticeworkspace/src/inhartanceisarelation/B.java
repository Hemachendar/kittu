package inhartanceisarelation;

public class B extends A
{
public void m2() 
{
System.out.println("iam m3 method in is a relationship");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m2();
		b.m1();
	}

}
