package com.inharitans;

import java.util.Scanner;

class Details
{
String name,location,address;
char gender;
}
class Student extends Details
{
String id;
}
class Faculty extends Student
{
float salary;
Faculty()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter location");
		location=sc.next();
		System.out.println("enter address");
		address=sc.next();
		System.out.println("enter gender");
		gender=sc.next().charAt(0);
		System.out.println("enter id");
		id=sc.next();
		System.out.println("enter salary");
		salary=sc.nextFloat();
		
	  }
	 void facultydetails()
	 {
		 System.out.println("name of the faculty is"+name);
		 System.out.println("location of the faculty"+location);
		 System.out.println("address of the faculty is "+address);
		 System.out.println("gender of the faculty is"+gender);
		 System.out.println("id of the faculty is"+id);
		
		 System.out.println("salary of the faculty is "+salary);
		 
	 }
}
public class Maltilevelinheritens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Faculty f=new Faculty();
        f.facultydetails();
	}

}
