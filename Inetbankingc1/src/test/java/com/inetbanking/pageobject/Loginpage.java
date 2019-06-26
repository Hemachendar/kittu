package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
 WebDriver idriver;
 
 public Loginpage(WebDriver rdriver) 
 {
	 idriver= rdriver;
	 PageFactory.initElements(rdriver, this);
}
 
 @FindBy(name="uid")
 @CacheLookup
 WebElement txtuname;
 
 @FindBy(name="password")
 @CacheLookup
 WebElement paswrd;
 
 @FindBy(name="btnLogin")
 @CacheLookup
 WebElement login;
 
 
 public void setuname(String usname) 
 {
	 txtuname.sendKeys(usname);
 }
 public void setpaswrd(String passwrd) 
 {
	 paswrd.sendKeys(passwrd);
 }
 public void submit() 
 {
	 login.click(); 
 }
}
