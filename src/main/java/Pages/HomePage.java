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

	@FindBy(css=".header_icon-shopper__BxjYw")
	public WebElement SignIn_Register_header_Icon;

	@FindBy(xpath="//a[text()='Sign In']")
	public WebElement Sign_icon;

	@FindBy(xpath="//a[text()='Register Now']")
	public WebElement Register_icon;

	@FindBy(css="a[aria-label='shopping bag']")
	public WebElement ShopingBag_icon;

	@FindBy(css="nav[class='navbar_navMain__6Fsll MuiBox-root mui-0'] a:nth-child(1)")
	public WebElement Beauty_Icon;

	@FindBy(xpath="//a[normalize-space()='Women']")
	public WebElement Women;

	@FindBy(css="nav[class='navbar_navMain__6Fsll MuiBox-root mui-0'] a:nth-child(1)")
	public WebElement Men;

	@FindBy(css="a[href='https://www.yesstyle.com/en/lifestyle-home.html']")
	public WebElement Lifestyle;

	@FindBy(css="a[href='https://www.yesstyle.com/en/health.html']")
	public WebElement Health;

	@FindBy(css="a[href='https://www.yesstyle.com/en/special-offers.html']")
	public WebElement Sale;

	@FindBy(css="a[href='https://yesstyle.com/blog']")
	public WebElement Blog;
	
	@FindBy(css="section[class='discountGrid_discountGridWrapper__Zfb4_']")
	public WebElement Discount_Sction;

	public void ShopingBag_icon() {
		ShopingBag_icon.isDisplayed();
	}

	public void SignIn_Register_header_Icon() {
		SignIn_Register_header_Icon.click();
		Sign_icon.click();

	}

}







