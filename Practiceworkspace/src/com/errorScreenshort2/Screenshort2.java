package com.errorScreenshort2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver","D:\\drivers\\MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> count = driver.findElements(By.linkText("prabas"));
		System.out.println(count.size());
		if (count.size() == 1) 
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C:\\Users\\Shreyu\\Desktop\\screenshort\\img2.png"));
			
		}
	}

}
