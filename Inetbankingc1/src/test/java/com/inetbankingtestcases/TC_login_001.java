package com.inetbankingtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.Loginpage;

public class TC_login_001 extends BaseClass
{

 @Test
  public void loginTest() 
  {
	  driver.get(Baseurl);
	  
	  Loginpage lp=new Loginpage(driver);
	  lp.setuname(uname);
	  lp.setpaswrd(paswrd);
	  lp.submit();
	  
	  if (driver.getTitle().equals("Guru99 Home Page")) 
	{
		Assert.assertTrue(true);
	}else 
	{
	  Assert.assertTrue(false);	
	}
  }
	
	
}
