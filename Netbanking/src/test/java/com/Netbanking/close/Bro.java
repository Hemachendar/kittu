package com.Netbanking.close;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bro {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
   ChromeDriver driver= new ChromeDriver();
   driver.get("https://www.amazon.com");

	}

}
