package Way2Automation;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class absaPOM extends BASECLASS  {
	
	public absaPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void POM() throws Exception	{
		
		Random randomGenerator = new Random();  
		String randomstr = randomGenerator.toString();
		int randomInt = randomGenerator.nextInt(10); 
		
		Addinguser.click();
		firstname.sendKeys(proper.data("Firstname")+randomInt);
		lastname.sendKeys(proper.data("Lastname")+randomInt);
		username.sendKeys(proper.data("Username")+ randomInt );
		password.sendKeys(proper.data("Password"));
		radiobtn.click();
		 int index = randomGenerator.nextInt(4);  // It will give a range between 0 to 3
		System.out.println("Index is "+ index);
		WebElement listBox = checkbox;
		Select list = new Select(listBox);
		list.selectByIndex(index);
		mail.sendKeys("usrname" + randomInt +"@gmail.com");
		phoneNumber.sendKeys(proper.data("Code")+randomGenerator.nextInt(1000000000));
		save.click();
		System.out.println("User Succesfully Added");
	}
	
	
	

}
