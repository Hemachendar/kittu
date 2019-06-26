package com.lastworkspace;

import java.io.IOException;

public class Handlingwindows {

	public static void main(String[] args) throws  Exception {
		
    BrowserInitialization b=new BrowserInitialization();
    b.initiateBrowser();
    
    OpenAnURL open=new OpenAnURL();
    open.openURL();
    
    BrowserWindow B=new BrowserWindow();
    B.handlingWindows();
    
    Screenshot s=new Screenshot();
    s.takeScreenShot();
    
    QuitBrowser quit=new QuitBrowser();
    quit.closeBrowser();
    
 	
	}

}
