package Marvenproject.MFirstClass;

import org.openqa.selenium.By;

public class Dice_Java extends BasePage01
{

	public static void main(String[] args) throws Exception
	{
		BrowserLaunch(getdata("browser"), getdata("url"));

		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("fname")).sendKeys("mahesh");
		driver.findElement(By.id("lname")).sendKeys("k");
		driver.findElement(By.id("email")).sendKeys("mahesh00235@gmail.com");
		driver.findElement(By.id("password")).sendKeys("M1$mahesh");
		driver.findElement(By.id("passwordConfirmation")).sendKeys("M1$mahesh");
		driver.findElement(By.name("diceCommunications")).click();
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[3]")).click();
		driver.findElement(By.linkText("submit")).click();
	}

}
