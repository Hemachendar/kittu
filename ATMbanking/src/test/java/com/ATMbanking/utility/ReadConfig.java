package com.ATMbanking.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
 Properties pro;
 public ReadConfig()
 {
	 File src=new File("./Configuration/Config.properties");
	 try {
		FileInputStream fs=new FileInputStream(src);
		 pro =new Properties();
		 pro.load(fs);
	} catch (Exception e) {
		
		System.out.println("exception is"+e.getMessage());
	}	 
	 }
   public String getApplication() 
   {
	   String url=pro.getProperty("baseurl");
	return url;  
   }
   public String getUsername() 
   {
	   String name=pro.getProperty("uname");
	return name;   
   }
   public String getpassword() 
   {
	   String pass=pro.getProperty("pasword");
	return pass;
   }
   public String getedgebro() 
   {
	   String ed=pro.getProperty("edge");
	return ed;
   }
   public String getchromebro() 
   {
	   String chro=pro.getProperty("chrome");
	return chro;
   }
   public String getiebro() {
	   
	   String ie=pro.getProperty("ie");
	return ie;
   }
   public String getfirefoxbro() {
	   
	   String firefox=pro.getProperty("firefox");
	return firefox;
	
   }
}
