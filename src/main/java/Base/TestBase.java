package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.tKyd.*;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tKyd.Keyword;

public class TestBase {
	Keyword keyword=new Keyword();
	@BeforeMethod
	public void setup() {
	
		keyword.launchBrowser("chrome");
		
		
	}

	@AfterMethod(enabled = true)
	public void tearDown() {
		Keyword.driver.quit();
}
}
