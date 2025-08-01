package Pages;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tKyd.Keyword;

public class WishlistPage {

	private static final Logger Logger=LogManager.getLogger(WishlistPage.class);
	WebDriver driver;
	public Keyword keyword;

	public WishlistPage() {
		this.driver=keyword.driver;
		PageFactory.initElements(keyword.driver, this);
	}

	@FindBy(xpath="//a[@class='md-raised continueShopping md-button md-ink-ripple']")
	public WebElement Continue_Shoping;

	public void Continue_Shoping_Butn() {
		Continue_Shoping.click();
	}
}
