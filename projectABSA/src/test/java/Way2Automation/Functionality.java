package Way2Automation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Functionality extends Crossbrowser{
	
	absaPOM Pomodel;
	@Test
	
	public void fun() throws Exception{
		
		Pomodel = new absaPOM(driver);
		Pomodel.POM();
		Thread.sleep(4000);
		
		driver.quit();
	}
		@BeforeTest
		@Parameters("ABSAASSESMENT") 
		public void OpenBrowser(String brow) throws Exception {
			browsertest(brow,"http://www.way2automation.com/angularjs-protractor/webtables/");

		}
		
		
	
	}

