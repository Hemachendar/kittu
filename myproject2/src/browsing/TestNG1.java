package browsing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class TestNG1 extends BasePage
{
    @BeforeMethod
    @Parameters("browser")
  public void beforeMethod(String dir) throws Exception 
  {
	browserLaunch(dir,getData("url")); 
  }
    @Test
    public void f() 
    {
  	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mi mobile");
  	  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
    }

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
