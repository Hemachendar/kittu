package com.icicbank.homeloans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4001 extends BasePage1 
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      BrowserLaunch(getdata("browser"), getdata("url"));
      WebElement dir = driver.findElement(By.id("twotabsearchtextbox"));
     
      dir.sendKeys("hemachendar");
      //String tex = dir.getText();
     String tex = dir.getAttribute("value"); 
     System.out.println("hello world:"+tex);
      
	/*//driver.findElement(By.partialLinkText("Gift")).click();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(int i=0;i<links.size();i++) 
	{
		String ink = links.get(i).getText();
		System.out.println(ink);
	}*/
    /*  String fir = driver.findElement(By.xpath("//a[text()='Customer Service']")).getAttribute("innerHTML");
	System.out.println(fir);*/
	
	}

}
