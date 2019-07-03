package Way2Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser {
	
	public static WebDriver driver;
	public void browsertest(String crosstest, String browsertest) throws Exception {
		
		if (crosstest.equalsIgnoreCase("chrome")) {
			
			   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
				 driver = new ChromeDriver();
			   
			  driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
			  driver.manage().window().maximize();
			  driver.navigate().refresh();
			  driver.manage().deleteAllCookies();
		}
		/*else if(crosstest.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}*/
			  JavascriptExecutor js = (JavascriptExecutor)driver;
				boolean status = js.executeScript("return document.readyState").toString().equals("complete");
				if (status) {
					System.out.println("Now we are in User List table");
				}
				else {
					System.out.println(" User List Table Page Failed");//in cross browser
				}
			
		}
	}


