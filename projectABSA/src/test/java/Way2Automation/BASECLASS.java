package Way2Automation;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class BASECLASS extends Crossbrowser {
	
	public WebDriver getDriver() {
        return driver;
    }
	propertyFile proper = new propertyFile();
	

//	Random randomGenerator = new Random();  
//	String randomstr = randomGenerator.toString();
//	int randomInt = randomGenerator.nextInt(10); 
	
	@FindBy(xpath="html/body/table/thead/tr[2]/td/button") WebElement Addinguser;
	@FindBy(name="FirstName") WebElement firstname;
	@FindBy(name="LastName") WebElement lastname;
	@FindBy(name="UserName") WebElement username;
	@FindBy(name="Password") WebElement password;
	@FindBy(xpath="html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input") WebElement radiobtn;
	@FindBy(xpath="html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select") WebElement checkbox;
	@FindBy(name="Email") WebElement mail;
	@FindBy(name="Mobilephone") WebElement phoneNumber;
	@FindBy(xpath="html/body/div[3]/div[3]/button[2]") WebElement save;
}