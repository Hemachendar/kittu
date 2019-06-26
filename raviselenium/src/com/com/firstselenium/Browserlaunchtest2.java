package com.com.firstselenium;

import org.testng.annotations.Test;

import com.firstselenium.BasePage2;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Browserlaunchtest2 extends BasePage2
{ 
	
	
	
	  @BeforeMethod
	  @Parameters("browser")
  public void startProcess(String s) throws Exception 
   {
		  BrowserLaunch(s,getdeta("url"));
		 
		  //BasePage2 b = new BasePage2();
		  
    	 //driver = b.BrowserLaunch(s,b.getdeta("url") );
    	 //System.out.println(driver.toString());
		  
    	 dr.findElement(By.xpath("//a[text()='Sign in']")).click();
    	 //driver.manage().window().maximize();
    	 WebElement createemail = dr.findElement(By.id("email_create"));
    	 
    	 if (s.contains("gecko"))
 		{
 			createemail.sendKeys("hema55hegkkg535@gmail.com");
 			
 		}
		  
		  /*System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
			driver=new InternetExplorerDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			System.out.println("Inside before method");
			WebElement lg = driver.findElement(By.xpath("//a[text()='Sign in']"));
			lg.click();*/
    	
		  
  }
    @Test(priority=4,groups= {"regression"})
   // @Parameters("browser")
    public void findelement() throws IOException, InterruptedException 
    {
		
		//driver.manage().window().maximize();
		//System.out.println("iam working");
	
		//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		
		//WebElement createemail = dr.findElement(By.id("email_create"));
		
		/*if (s.contains("chrome")) 
		{
			createemail.sendKeys("hemachhh22k@gmail.com");
			
		}else if (s.contains("ie"))
		{
			createemail.sendKeys("hemachennnn215@gmail.com");
			
		}*/
		/* if (s.contains("gecko"))
		{
			createemail.sendKeys("hema55hegkkg535@gmail.com");
			
		}*/
		/*else if (s.contains("edge"))
		{
		 createemail.sendKeys("jkiwtsht565@gmail.com");	
		}*/
		
		
		
			//driver.findElement(By.id("email_create")).sendKeys("hmlpp5klnj2da55rj255@gmail.com");
			
			
			//driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
			
		
		
		     dr.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		//driver.switchTo().frame(0);
		
	
		
	/*WebElement a4=	driver.findElement(By.id("id_gender1"));
	a4.click();
*/	
		Thread.sleep(2000);
	
	WebElement a5=	dr.findElement(By.id("id_gender2"));

	a5.click();
		/*System.out.println(a.size());
		//a.get(1).click();
		for(int i=0;i<a.size();i++) 
		{
			System.out.println(a.get(i).getAttribute("value")+"  "+a.get(i).getAttribute("checked"));
		}*/
        dr.findElement(By.id("customer_firstname")).sendKeys("swapna");
		
        dr.findElement(By.id("customer_lastname")).sendKeys("dhirishala");
		
        dr.findElement(By.id("passwd")).sendKeys("hemachendar");
		
        List<WebElement> d = dr.findElements(By.id("days"));
		
        System.out.println(d.size());
		
        for(int i=1;i<d.size();i++)
			{
			System.out.println(d.get(i).getText());
			
			}
		
		dr.findElement(By.id("days")).sendKeys("12");
		
		List<WebElement> d1 = dr.findElements(By.id("months"));
		
		System.out.println(d1.size());
		
		for(int j=1;j<d1.size();j++) 
		{
			System.out.println(d1.get(j).getText());
		}
		
		dr.findElement(By.id("months")).sendKeys("may");
		
		List<WebElement> d2 = dr.findElements(By.id("years"));
		
		System.out.println(d2.size());
		
		for(int k=1;k<d2.size();k++) 
		{
			System.out.println(d2.get(k).getText());
		}
	    dr.findElement(By.id("years")).sendKeys("2001");
	   
	    dr.findElement(By.id("firstname")).sendKeys("hemachendar");
	    
	    dr.findElement(By.id("lastname")).sendKeys("dhirishala");
	    
	    dr.findElement(By.id("company")).sendKeys("tekperfekt");
	    
	    dr.findElement(By.id("address1")).sendKeys("Mig 127");
	    
	    dr.findElement(By.id("city")).sendKeys("pune");
	    
	    List<WebElement> m = dr.findElements(By.id("id_state"));
	    
	    System.out.println(m.size());
	    
	    for(int l=0;l<m.size();l++)
	    {
	    	System.out.println(m.get(l).getText());
	    }
	    
	    dr.findElement(By.id("id_state")).sendKeys("India");
	    
	    dr.findElement(By.id("postcode")).sendKeys("50244");
	    
	    dr.findElement(By.id("other")).sendKeys("mig127 kpahpphase1");
	    
	    dr.findElement(By.id("phone")).sendKeys("8008990184");
	    
	    dr.findElement(By.id("phone_mobile")).sendKeys("7048995241");;
	    
	    dr.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	    
	
	    File Srcfile=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	    
	    
	    FileUtils.copyFile(Srcfile, new File("D:\\test5.png"));
	    
	
    }
    
  @AfterMethod
  public void Endprocesss() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  dr.close();
	  dr.quit();
  }

}
