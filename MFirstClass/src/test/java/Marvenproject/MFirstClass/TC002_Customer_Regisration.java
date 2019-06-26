package Marvenproject.MFirstClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TC002_Customer_Regisration extends BasePage01
{
  ClassUI Class;
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String btype) throws Exception 
  {
	  BrowserLaunch(btype, getdata("url"));
  }
  
  @Test
  public void custmerregistration() 
  {
	Class=new ClassUI(driver);
	Class.loginverification();
	Assert.assertEquals("Authentication failed.",Class.errorveryfyvalidation());
  }

  @AfterMethod
  public void endProcess() 
  {
	  
  }

}
