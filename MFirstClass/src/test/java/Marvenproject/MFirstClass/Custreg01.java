package Marvenproject.MFirstClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class Custreg01 extends BasePage01
{
  CustRege cust;
  
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String btype) throws Exception 
  {
	  BrowserLaunch(btype, getdata("url"));
  }
  @Test
  public void costmerRegistration() throws Exception 
  {
	cust=new CustRege(driver);
	cust.custregistration();
  }

  @AfterMethod
  public void endProcess()
  {
	  
  }

}
