package browsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browsing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shreyu\\Desktop\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.facebok.com");
		
		driver.navigate().to("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		String swathi = driver.getTitle();
		System.out.println(swathi);
		
		String x = driver.getCurrentUrl();
		System.out.println(x);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		Thread.sleep(4000);
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		
		/*System.setProperty("webdriver.ie.driver","C:\\Users\\Shreyu\\Desktop\\drivers\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe" );
		driver =new InternetExplorerDriver();
		//driver.get("https://www.amazon.com");
		
		driver.navigate().to("https://www.facebook.com");
		*/
		
	}

}
