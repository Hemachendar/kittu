package gropofbrowsers;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class Extentmanager  {

	public static ExtentReports extent;
	
	public static ExtentReports getinstant() 
	{
			Date d=new Date();
			System.out.println(d);
			String datefile = d.toString().replace(':', '_').replace(' ', '_')+".html";
			extent=new ExtentReports(System.getProperty("user.dir")+"//HTMLreport//"+datefile);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//extentreportsconfigar.xml"));
			extent.addSystemInfo("selenium language", "3.6.0").addSystemInfo("environment", "production");
			return extent;
	}

}
