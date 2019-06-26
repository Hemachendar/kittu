package com.errorScreenshort2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShortDateandTime {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		Date dt=new Date();
//		System.out.println(dt);
//		String dateandtime = dt.toString().replace(':', '_').replace(' ', '_')+".jpeg";

		SimpleDateFormat dateandtime=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Shreyu\\Desktop\\screenshort\\"+dateandtime.format(dt)+".jpeg"));
//		FileHandler.copy(src, new File("C:\\Users\\Shreyu\\Desktop\\screenshort\\"+dateandtime));
	}

}
