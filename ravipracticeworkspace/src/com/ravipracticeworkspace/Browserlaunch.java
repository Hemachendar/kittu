package com.ravipracticeworkspace;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserlaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://www.amazon.com");
		
		
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
		InternetExplorerDriver driver2=new InternetExplorerDriver();
		driver2.get("https://www.amazon.com");
		
		
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		EdgeDriver driver3=new EdgeDriver();
		driver3.get("https://www.amazon.com");
	
		
	}

}
