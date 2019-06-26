package gropofbrowsers;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;

import com.relevantcodes.extentreports.LogStatus;

public class WorkBasePagepath2 extends BasePagepath2 
{
	private static final Logger log =Logger.getLogger(WorkBasePagepath2.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		test=e.startTest("WorkBasePagepath2");
		init();
		
		log.info("inshilsing propartiefile & or & log4j ");
		test.log(LogStatus.INFO, "inshilsing propartiefile & or & log4j ");
		
		//navigate("fb");
		browser("e");
		log.info("open the edgebrowser:-"+p.getProperty("e"));
		test.log(LogStatus.INFO,"open the edgebrowser:-"+p.getProperty("e") );
		
		
		navigate("amzn");
		log.info("navigate to url"+p.getProperty("amzn"));
		test.log(LogStatus.INFO, "navigate to url"+p.getProperty("amzn"));
		
		System.out.println("iam select");
		
		selectoption("amzndropdown_id","Amazon Devices");
		log.info("select the dropdown option"+or.getProperty("amzndropdown_id"));
		test.log(LogStatus.INFO, "select the dropdown option"+or.getProperty("amzndropdown_id"));
		
		Thread.sleep(2000);
			
		text("amzntext_id", "horry potter");
		log.info("enter the text horrypotter "+or.getProperty("amzntext_id"));
		test.log(LogStatus.INFO, "enter the text horrypotter "+or.getProperty("amzntext_id"));
		
		
		submit("amzonserch_xpath");
		log.info("click amazon search button"+or.getProperty("amzonserch_xpath"));
		test.log(LogStatus.INFO, "click amazon search button"+or.getProperty("amzonserch_xpath"));
		
		e.endTest(test);
		e.flush();
	
	}

	

	
	

	
}
