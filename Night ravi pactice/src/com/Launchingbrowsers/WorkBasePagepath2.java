package com.Launchingbrowsers;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;

public class WorkBasePagepath2 extends BasePagepath2 
{
	private static final Logger log =Logger.getLogger(WorkBasePagepath2.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		
		init();
		
		log.info("inshilsing propartiefile & or & log4j ");
		//navigate("fb");
		browser("e");
		
		log.info("open the edgebrowser:-"+p.getProperty("e"));
		
		
		
		navigate("amzn");
		log.info("navigate to url"+p.getProperty("amzn"));
		
		System.out.println("iam select");
		
		selectoption("amzndropdown_id","Amazon Devices");
		log.info("select the dropdown option"+or.getProperty("amzndropdown_id"));
		
		Thread.sleep(2000);
			
		text("amzntext_id", "horry potter");
		log.info("enter the text horrypotter "+or.getProperty("amzntext_id"));
		
		submit("amzonserch_xpath");
		log.info("click amazon search button"+or.getProperty("amzonserch_xpath"));
	
	}

	

	
	

	
}
