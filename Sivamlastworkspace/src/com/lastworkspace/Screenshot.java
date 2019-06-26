package com.lastworkspace;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sun.jna.platform.FileUtils;

public class Screenshot {
	
	public void takeScreenShot() throws IOException {
		
		
		File src= ((TakesScreenshot)BrowserInitialization.driver). getScreenshotAs(OutputType.FILE); 
			// now copy the screenshot to desired location using copyFile method.
			org.openqa.selenium.io.FileHandler.copy(src, new File("C:/selenium/"+System. currentTimeMillis()+".jpeg"));
			
	}

}
