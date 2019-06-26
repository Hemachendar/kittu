package com.errorScreenshort2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import com.sun.jna.platform.FileUtils;

public class Screenshort03 {

	public static void main(String[] args) throws IOException {
		/*System.setProperty("webdriver.edge.driver","D:\\drivers\\MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();*/
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
		 if (!links.get(i).getText().isEmpty()) 
		 {
			String linkname = links.get(i).getText();
			links.get(i).click();
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:\\Users\\Shreyu\\Desktop\\screenshort\\"+linkname+".jpeg"));
		    
			links=driver.findElements(By.tagName("a"));
		 }
			
		}	
			
	}

}
