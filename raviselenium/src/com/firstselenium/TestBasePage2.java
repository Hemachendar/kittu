package com.firstselenium;

import org.openqa.selenium.By;

public class TestBasePage2 extends BasePage2
{

	public static void main(String[] args) throws Exception {
		
		BrowserLaunch(getdeta("cbrowser1"), getdeta("urla"));
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("ravi");
		//driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("mens");
	}

}
