package Marvenproject.MFirstClass;

import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassUI 
{
	@FindBy(linkText="Sign in")public WebElement signin;
	@FindBy(id="email") public WebElement mail;
	@FindBy(id="passwd")public WebElement Paswrd;
	@FindBy(id="SubmitLogin")public WebElement submit;
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")WebElement loginerror;
	
   public ClassUI(WebDriver driver) 
   {
		PageFactory.initElements(driver, this);
	}
public void loginverification() 
   {
	   signin.click();
	   mail.sendKeys("hemachendar26@gmail.com");
	   Paswrd.sendKeys("1Medical$");
	   submit.click();
   }
   public String errorveryfyvalidation() 
   {
	  return loginerror.getText(); 
   }
}
