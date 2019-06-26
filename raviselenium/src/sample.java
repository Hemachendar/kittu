import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//microsoftwebdriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.xpath("//input[@type='submit'][@value='Google Search']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build();
		System.out.println("Movve to element");
		Thread.sleep(2000);
		actions.doubleClick();
		System.out.println("clicked");
		Thread.sleep(2000);
		driver.quit();
	}

}
