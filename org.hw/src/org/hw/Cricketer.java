package org.hw;

public class Cricketer 
{

String name;
  String team;
  int age;
  Cricketer() {
	
	name="";
	team="";
     
}
Cricketer(String n, String t, int a) 
{
	name=n;
	team=t;
	age= a;
}
public Cricketer(Cricketer crkt)
{
	name=crkt.name;
	team=crkt.team;
	age=crkt.age;
	
}
public String tostring() 
{
	return "this is"+name+"of"+team;
	
}	


	public static void main(String[] args) {
		Cricketer c=new Cricketer();
		Cricketer c1=new Cricketer("sachin","india",32);
		Cricketer c2=new Cricketer(c1);
		System.out.println(c1);
		System.out.println(c2);
	    c.name="virat";
	    c.team="india";
	    c.age=35;
	    System.out.println(c);
	    
		
	}
}
