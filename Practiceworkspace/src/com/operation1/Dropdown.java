package com.operation1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println(a);
		
		
		
		/*Select select2=new Select(driver.findElement(By.id("searchDropdownBox")));
		select2.selectByIndex(5);*/

		/*Select select=new Select((WebElement) driver.findElements(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		//select.selectByValue("search-alias=arts-crafts-intl-ship");
		select.selectByVisibleText("Baby");
		
		List<WebElement> select1 = driver.findElements(By.tagName("option"));
		System.out.println(select1.size());
		for (int i = 0; i < select1.size(); i++) 
		{
		System.out.println(select1.get(i).getText());
		Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
		 select.selectByValue("search-alias=arts-crafts-intl-ship");
	System.out.println(select);
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		}*/
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("horry");
		
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		
		

	}

}
