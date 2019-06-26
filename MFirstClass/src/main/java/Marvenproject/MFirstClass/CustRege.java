package Marvenproject.MFirstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustRege 
{

	@FindBy(linkText="Sign in")WebElement signin;
	@FindBy(id="email_create")WebElement email;
	@FindBy(id="SubmitCreate")WebElement submit;
	@FindBy(xpath="//*[@id='id_gender1']")WebElement mrradio;
	@FindBy(id="customer_firstname")WebElement fname;
	@FindBy(id="customer_lastname")WebElement lname;
	//@FindBy(id="email")WebElement cemail;
	@FindBy(id="passwd")WebElement pswrd;
	@FindBy(xpath=".//*[@id='days']")WebElement date;
	@FindBy(xpath="//*[@id='months']")WebElement month;
	@FindBy(xpath=".//*[@id='years']")WebElement year;
	@FindBy(id="company")WebElement company;
	@FindBy(id="address1")WebElement address;
	@FindBy(id="city")WebElement city;
	@FindBy(xpath=".//*[@id='id_state']")WebElement state;
	@FindBy(id="postcode")WebElement post;
	//@FindBy(xpath=".//*[@id='id_country']")WebElement country;
	@FindBy(id="other")WebElement other;
	@FindBy(id="phone")WebElement ph;
	@FindBy(id="alias")WebElement alias;
	@FindBy(id="submitAccount")WebElement submit1;
	
	public CustRege(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void custregistration() throws Exception 
	{
		signin.click();
		email.sendKeys("gkn5054@gmail.com");
		submit.click();
		Thread.sleep(3000);
		mrradio.click();
		fname.sendKeys("hema");
		lname.sendKeys("kk");
		pswrd.sendKeys("1Medical$");
		date.sendKeys("05");
		month.sendKeys("may");
		year.sendKeys("1992");
		company.sendKeys("kkunioun");
		address.sendKeys("kphbphase1");
		city.sendKeys("hydrabad");
		state.sendKeys("texas");
		post.sendKeys("50124");
		other.sendKeys("experting more");
		ph.sendKeys("52525252522");
		alias.sendKeys("address1");
		submit1.click();
		
	}
	
	
	
	
		
}
