package com.selenium;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		
		Class.forName("com.selenium.ArrayLs");
		System.out.println("end of program");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Eneterd catch block");
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("catch block enterd");
			}
		finally {
			System.out.println("entered finally block");
		}
		
		
		System.out.println("This line will be executed if we use try catch block");
	}

}
