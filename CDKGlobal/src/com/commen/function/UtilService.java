package com.commen.function;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class UtilService {
    private static final TimeUnit SECONDS = null;
	public WebDriver driver;
    private WebElement webElement;
    public int timeoutInSeconds = 50;
    public String baseUrl = "https://www-dev.connectcdk.com/a/eforms/#/";
    private int width = 1680;
    private int height = 1048;
    final String USERNAME = "cdk-eforms";
    final String ACCESS_KEY = "27489159-2a9c-4c3c-833f-f405674c2958";
    final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";


    @BeforeClass
    public void login() {
        System.setProperty("webdriver.chrome.driver", "D:\\MicrosoftWebDriver.exe");
        driver=new ChromeDriver();
       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/

    /*    Dimension dim = new Dimension(width, height);
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");

        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
            driver.manage().window().setSize(dim);
        } catch (Exception e) {
            throw new Error(e.getMessage(), e);
        }
*/
        driver.get(baseUrl);
        driver.findElement(By.id("proxyUsername")).sendKeys("DITTestUser@eforms.com");
        driver.findElement(By.id("proxyPassword")).sendKeys("CDK@1234");
        driver.findElement(By.id("loginSubmit")).click();
        driver.manage().timeouts().implicitlyWait(timeoutInSeconds / 5, SECONDS);
        webElement = driver.findElement(By.id("skipContactCollection"));
        if (webElement != null) {
            webElement.click();
        }
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(50, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);

        Object envType = wait.until(new Function<WebDriver, Object>() {
            public Boolean apply(WebDriver driver) {
                return driver.getCurrentUrl().contains("https://www-dit.connectcdk.com/a/eforms/") || driver.getCurrentUrl().contains("www-dev.connectcdk.com/a/eforms");
            }
        });


        if (driver.getCurrentUrl().contains("https://www-dit.connectcdk.com/a/eforms/")) {
            driver.navigate().to(baseUrl);
            WebDriverWait eformsHomePagewait = new WebDriverWait(driver, timeoutInSeconds);
            eformsHomePagewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ds-host-workspace-wrapper\"]/div[3]/ng-view/div/div[1]/h1")));
        }
    }

    public void waitForLoadingIndicator() {
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"ds-host-workspace-wrapper\"]/ds-wait-indicator/ds-wait-indicator-internal/div/div/div")));
    }

    public void getEformsHomePage() {
        driver.get(baseUrl);
    }


    @AfterClass
    public void logOff() {
//        ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
        driver.quit();
    }
}
