package Marvenproject.MFirstClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pre_class extends BasePage01
{

	public static void main(String[] args) throws Exception 
	{
	BrowserLaunch(getdata("browser"),getdata("url"));
	
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("email_create")).sendKeys("swapna0251@gmail.com");
	driver.findElement(By.id("SubmitCreate")).click();
	Thread.sleep(4000);
	List<WebElement> titel = driver.findElements(By.xpath(".//div[@class='radio']"));
	System.out.println(titel.size());
	titel.get(0).click();   
	driver.findElement(By.id("customer_firstname")).sendKeys("kanna");
	driver.findElement(By.id("customer_lastname")).sendKeys("sonoo");
	//driver.findElement(By.id("email")).sendKeys("swapna@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("8888000hhl");
	Thread.sleep(4000);
	WebElement day_dropdown = driver.findElement(By.xpath(".//*[@id='days']"));
	Select day=new Select(day_dropdown);
	day.selectByValue("23");
	
	WebElement month_dropdown = driver.findElement(By.xpath(".//*[@id='months']"));
	Select month=new Select(month_dropdown); 
	int may = 5;
	month.selectByIndex(may);
	WebElement year_dropdown = driver.findElement(By.xpath(".//*[@id='years']"));
	Select year=new Select(year_dropdown);
	year.selectByValue("2003");
	driver.findElement(By.id("company")).sendKeys("xvrs");
	driver.findElement(By.id("address1")).sendKeys("kphb12231");
	driver.findElement(By.id("city")).sendKeys("delhi");
	WebElement state_dropdown = driver.findElement(By.xpath(".//*[@id='id_state']"));
	Select state=new Select(state_dropdown);
	state.selectByVisibleText("Texas");
	driver.findElement(By.id("postcode")).sendKeys("50124");
	/*WebElement country_dropdown = driver.findElement(By.xpath(".//*[@id='id_country']"));
	Select country=new Select(country_dropdown);
	int country=1;
	country.selectByIndex(country);*/
	
	driver.findElement(By.id("other")).sendKeys("experting more");
	driver.findElement(By.id("phone")).sendKeys("5012325648");
	driver.findElement(By.id("alias")).sendKeys("adress021");
	driver.findElement(By.id("submitAccount")).click();


	}

}
