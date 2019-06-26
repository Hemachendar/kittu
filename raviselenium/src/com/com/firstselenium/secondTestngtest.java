package com.com.firstselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class secondTestngtest {
  @Test(priority=2,enabled=false,groups= {"regression"})
  public void f() {
	  System.out.println("f");
  }
  
  @Test(priority=3,groups= {"regression"})
  public void a() {
	  System.out.println("a");
  }
  
  @Test(priority=0,groups= "smoke"/*{"regression"}*/)
  public void z() {
	  System.out.println("z");
  }
  @BeforeMethod
  public void beforeMethod() {
  System.out.println("iam beforemethod..");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("iam aftermethod...");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("iam beforeclass...");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("iam afterclass...");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("iam beforetest");
  }

  @AfterTest
  public void afterTest() {
  
  System.out.println("iam aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
  System.out.println("iam beforesuite..");
  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("iam aftersuite");
  }

}
