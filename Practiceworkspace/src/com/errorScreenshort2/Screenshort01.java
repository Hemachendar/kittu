package com.errorScreenshort2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import com.sun.jna.platform.FileUtils;

public class Screenshort01 {

	public static void main(String[] args) throws IOException 
	{
	
		System.setProperty("webdriver.edge.driver","D:\\drivers\\MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\Shreyu\\Desktop\\screenshort\\img1.png"));

	}

}
