 package com.com.firstselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Testngtestfirst {
  @Test (priority=2,enabled=false,groups= {"regression"})
  public void f() 
  {
	  System.out.println("iam f test....");
  }
  @Test (priority=1,groups= {"regression"})
  public void z() 
  {
	  System.out.println("iam z test....");
  }
  @Test (priority=0,groups= {"regression"})
  public void x() 
  {
	  System.out.println("iam x test....");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	System.out.println("iam beforemethod...");

  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("iam aftermethod..");
  }

}
