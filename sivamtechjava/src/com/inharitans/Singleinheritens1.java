package com.inharitans;

import java.util.Scanner;

 class detailss
{
	String name,location,address;
	
	char gender;
}
class students extends detailss
{
	String id;
	float marks,fee;
	students()
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
		System.out.println("enter marks");
		marks=sc.nextFloat();
		System.out.println("enter fee");
		fee=sc.nextFloat();	
	  }
	 void studentdetails()
	 {
		 System.out.println("name of the student is"+name);
		 System.out.println("location of the student"+location);
		 System.out.println("address of the students is "+address);
		 System.out.println("gender of the student is"+gender);
		 System.out.println("id of the student is"+id);
		 System.out.println("marks of the student is"+marks);
		 System.out.println("fee of the student is "+fee);
		 
	 }
}
public class Singleinheritens1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    students s=new students();
    s.studentdetails();
    
	}

}
