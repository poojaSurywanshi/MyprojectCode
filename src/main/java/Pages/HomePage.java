package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tKyd.Keyword;

public class HomePage {

	Actions act=new Actions(Keyword.driver);
	
	@FindBy(css="i[class='header_icon-shopper__BxjYw']")
	public static WebElement Sign_in;

	@FindBy(css="a[href='/en/secure/sign-in.html']")
	public static WebElement signIn_link;

	@FindBy(xpath="//a[normalize-space()='Register Now']")
	public static WebElement register_New;

	@FindBy(css="a[href*='shopping-bag']")
	WebElement ShoopingIcon;

	@FindBy(css="a[class='md-primary md-raised md-button md-ink-ripple']")
	WebElement ShoopingIcon_ContinueShoping_Button;

	@FindBy(css="a[aria-label='wish list']")
	WebElement Wishlist;

	@FindBy(css="i[class='icon icon-search']")
	WebElement Search_icon;
	
	@FindBy(css="input[placeholder='Search']")
	WebElement Search_bar;

	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(css="main[class='MuiBox-root mui-style-0']")
	WebElement actual;

	@FindBy(css="main[class='MuiBox-root mui-style-0']")
	WebElement expected;

	public void M_ShoopingIcon() {
		ShoopingIcon.click();
	}

	@FindBy(css="form[name='signInForm'] button[type='submit']")
	WebElement signIn_btn;
	
	public void Wishlist_Icon() {
		Wishlist.click();
	}
	public void ShoopingIcon_ContinueShoping() {
		ShoopingIcon_ContinueShoping_Button.click();
	}

	public void validateHomePage() {
		Assert.assertEquals(actual, expected);
	}
	public void SignIn() {
		
		act.moveToElement(Sign_in).click().perform();
	}
	public void signIn_link() {
		signIn_link.click();
	}
	public void register() {
		register_New.click();}
	
	public void Search_icon() {
		Search_icon.click();
	}
	public void signIn_btn() {
		signIn_btn.click();
	}
	
	public void Search_bar() {
		 Search_bar.sendKeys("Lip balm");
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void ShadowRootExample() {
		WebElement iframe = Keyword.driver.findElement(By.id("cf-chl-widget-pivki"));
		Keyword.driver.switchTo().frame(iframe);
		Actions act=new Actions(Keyword.driver);
		 WebElement ele= Keyword.driver.findElement(By.cssSelector("#HJup0 > div > label > input[type=checkbox]"));
		 act.moveToElement(ele).perform();
		 act.click();
	}
}

