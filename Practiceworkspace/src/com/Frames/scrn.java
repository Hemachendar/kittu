package com.Frames;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrn 
{

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++)
		{
		if (links.get(i).getText().isEmpty())
		{
		   String linksname1 = links.get(i).getText();	
		   links.get(i).click();
		   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileHandler.copy(src,new File("C:\\Users\\Shreyu\\Desktop\\screenshort"+linksname1+".jpg") );
		   links = driver.findElements(By.tagName("a"));
		}	
		}
	}
}
