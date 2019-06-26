package com.ATMbanking.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.ATMbanking.pageobject.Loginpage;



public class TC_login1_001 extends BaseClass
{
	 //private static final Logger logger =Logger.getLogger(TC_login1_001.class.getName());
	
    @Test
	public void logintest() 
	{
		driver.get(baseurl);
		logger.info("Url is open");
		
		Loginpage lp=new Loginpage(driver);
		lp.setuname(uname);
		logger.info("enter the uname");
		
		lp.setpasswrd(pasword);
		logger.info("enter the password");
		
		lp.submit();
		
		
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("Guru99 Bank Home Page")) 
		{
			Assert.assertTrue(true);
			logger.info("log test pass");
		}else 
		{
			Assert.assertTrue(false);
			logger.info("log test failed");
		}
	}
	
	
}
