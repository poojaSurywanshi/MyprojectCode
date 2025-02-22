package Base;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tKyd.Keyword;

public class TestBase {

	@BeforeMethod
	public void setup() {
		Keyword keyword=new Keyword();
		keyword.lunchBrowser("chrome");
		keyword.luanchUrl("https://www.yesstyle.com/en/");
		
	}

	@AfterMethod(enabled = true)
	public void tearDown() {
		Keyword.driver.quit();
}
}
