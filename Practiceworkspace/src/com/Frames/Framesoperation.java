package com.Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Framesoperation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		//<WebElement> framesize = driver.findElements(By.tagName("iframe"));
        // System.out.println(framesize.size());
        /*driver.findElement(By.xpath("//*[@id=\"content\"]/p[5]"));
       WebElement x = driver.findElement(By.xpath("//div[@class='box'][1]"));*/
		
		JavascriptExecutor jr=(JavascriptExecutor)driver;
		jr.executeScript("scroll(0, 350);");
       driver.switchTo().frame("IF2");
       
       JavascriptExecutor jr2=(JavascriptExecutor)driver;
		jr2.executeScript("scroll(0, 750);");
		
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
		//driver.findElement(By.xpath("//div[@id='content-wrapper']"));
		
		//driver.findElement(By.linkText("Selectable")).click();
       
      // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/a")).click();
      /* WebElement y = x.findElement(By.xpath("//iframe[@id='IF1']"));
        
        driver.switchTo().frame(y);
        
        //driver.findElement(By.xpath("//a[@class='dt-mobile-menu-icon'][1]")).click();
        driver.findElement(By.linkText("Automation Practice Form")).click();
        System.out.println("operation sucess");*/
	}
}
