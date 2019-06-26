package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass 
{
  
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  ChromeDriver a = new ChromeDriver();
	  a.get("http://www.amazon.com");
	  a.manage().window().maximize();
	  String s = a.getTitle();
	  System.out.println(s);
	  String b = a.getCurrentUrl();
	  System.out.println(b);
	  
	  a.findElement(By.xpath("//*[@id=\"LO5NYy5WBwQigdKMRQrXaQ\"]/div[3]/a")).click();
	  
	  

	}

}
