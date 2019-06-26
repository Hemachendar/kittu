package com.com.firstselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class testngclass {
  @Test 
  public void green() 
  {
	  System.out.println("iam green");
  }
  @Test(dependsOnMethods= {"green"})
  public void orange() 
  {
	  System.out.println("iam orange");
	  Assert.assertTrue(false);
  }
  @Test(dependsOnMethods= {"orange"})
  public void wight() 
  {
	  System.out.println("iam wight");
  }
  @Test(dependsOnMethods= {"wight"})
  public void blue() 
  {
	  System.out.println("iam blue");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
