package Marvenproject.MFirstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cust_reg 
{
 @FindBy(linkText="sign in")WebElement signIn;
 @FindBy(id="email_create")WebElement email;
 @FindBy(id="SubmitCreate")WebElement SubmitCreate;
 @FindBy(xpath="//*[@id='id_gender1']")WebElement mrRadio;
 @FindBy(id="customer_firstname")WebElement fname;
 @FindBy(id="customer_lastname")WebElement lname;
 @FindBy(id="email")WebElement hemachendar;
 @FindBy(id="passwd")WebElement passwd;
 @FindBy(xpath=".//*[@id='days']")WebElement day;
 @FindBy(id="months")WebElement month;
 @FindBy(xpath=".//*[@id='years']")WebElement year;
 @FindBy(id="company")WebElement company;
 @FindBy(id="address1")WebElement address1;
 @FindBy(id="address2")WebElement address2;
 @FindBy(id="city")WebElement city;
 @FindBy(xpath=".//*[@id='id_state']")WebElement state;
 @FindBy(id="postcode")WebElement zipcode;
 @FindBy(xpath=".//*[@id='id_country']")WebElement country;
 @FindBy(id="phone")WebElement phone;
 @FindBy(xpath=".//*[@id='submitAccount']")WebElement regaccunt;
 
 

public Cust_reg(WebDriver driver) 
{
	
	PageFactory.initElements(driver, this);
	
}



public void coutm_registration()
 {
	signIn.click();
	email.sendKeys("hemachendar09@gmail.com");
	SubmitCreate.click();
	mrRadio.click();
	fname.sendKeys("d");
	lname.sendKeys("hema");
	passwd.sendKeys("1medical$");
	day.sendKeys("05");
	month.sendKeys("may");
	year.sendKeys("1992");
	company.sendKeys("Xs");
	address1.sendKeys("1-258,texas");
	address2.sendKeys("texas");
	city.sendKeys("texas");
	state.sendKeys("texas");
	zipcode.sendKeys("73301");
	country.sendKeys("united states");
	phone.sendKeys("5236145255");
	regaccunt.click();
 }
}

