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

public class HomePage {

	private static final Logger logger = LogManager.getLogger(HomePage.class);
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));

	public HomePage() {
		this.driver=Keyword.driver;
		PageFactory.initElements(Keyword.driver, this);
	}
	
	@FindBy(css="span[class='MuiBadge-root mui-chz7cr'] i[class='icon icon-save-items']")
	public WebElement wishList_icon;

	public void wishlistButton() {
		wishList_icon.click();
	}
	
}
