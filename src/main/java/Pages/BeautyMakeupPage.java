package Pages;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tKyd.Keyword;
public class BeautyMakeupPage {

	private static final Logger logger = LogManager.getLogger(HomePage.class);
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));

	public BeautyMakeupPage() {
		this.driver=Keyword.driver;
		PageFactory.initElements(Keyword.driver, this);
	}
	
	@FindBy(css="img[src='https://d1flfk77wl2xk4.cloudfront.net/Assets/49/215/M_p0114021549.jpg']")
	public WebElement Product1;
	
	
}
