package com.tKyd;
import org.apache.log4j.Logger;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Errors.InvalidBrowserError;
import io.cucumber.core.logging.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.Logger;

public class Keyword {
	
	public static RemoteWebDriver driver=null;
	public static FluentWait<WebDriver>wait=null;
	private static final Logger LOG=Logger.getLogger(Keyword.class);
	
	public static void lunchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			 ChromeOptions chromeOptions = new ChromeOptions();
			 
			 chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
			 chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			 
             chromeOptions.addArguments("--start-maximized"); // Start the browser maximized
             //chromeOptions.addArguments("--incognito");       // Open in incognito mode
             chromeOptions.addArguments("--disable-notifications"); // Disable notifications

             // Initialize the ChromeDriver with ChromeOptions
             driver = new ChromeDriver(chromeOptions);
			//driver=new ChromeDriver();
			// driver.manage().window().maximize();
             LOG.info("Luanched browser succfully");
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 LOG.info("Luanched browser succfully");
		}
		else if(browsername.equalsIgnoreCase("msedge")) {
			driver=new EdgeDriver();
			 driver.manage().window().maximize();
			 LOG.info("Luanched browser succfully");
		}else if(browsername.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
			 driver.manage().window().maximize();
			 LOG.info("Luanched browser succfully");
		}
		else {
			throw new InvalidBrowserError(browsername);
		}

		wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
	}
	
	public static void luanchUrl(String Url) {
		driver.get(Url);
	}
	
	public void enterText(String locator, String textToEnter) {
		driver.findElement(By.xpath(locator)).sendKeys(textToEnter);
	}
	
	public WebElement waitforElementvisible(By by) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by);
	}
	
	
}