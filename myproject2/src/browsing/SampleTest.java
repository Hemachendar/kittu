package browsing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;

import org.testng.annotations.AfterMethod;

public class SampleTest extends BasePage
   {
    @BeforeMethod
    @Parameters("browser")
  public void startprocess(String fir) throws Exception 
  {
    browserLaunch(fir, getData("url"));
  }
    @Test
    public void login() 
    {
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hemachendar");
    	
    }
   @AfterMethod
  public void endprocess() 
  {
	  driver.close();
  }

}
