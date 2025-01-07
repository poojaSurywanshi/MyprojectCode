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

	@FindBy(css=".md-tab.ng-scope.ng-isolate-scope.md-ink-ripple.md-active")
	WebElement Member;

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
	
	@FindBy(css="##input_5")
	public static WebElement Input_email;
	
	@FindBy(css="#input_4")
	public static WebElement Input_Password;
	
	@FindBy(css="form[name='signInForm'] button[type='submit']")
			public static WebElement sign_btn;
	
	public void register() {
		register_New.click();}

	public void Search_icon() {
		Search_icon.click();
	}
	public void signIn_btn() {
		signIn_btn.click();
	}
	public void Member() {
		Member.click();
	}

	public void Search_bar() {
		Search_bar.sendKeys("Lip balm");
		act.sendKeys(Keys.ENTER).perform();
	}
	public static void Input_email(String username) {
		Input_email.sendKeys(username);
	}
	
	public static void Input_Password(String password) {
		Input_Password.sendKeys(password);
	}
	public void sign_btn(){
		sign_btn.click();
	}

	public void ShadowRootExample() {
		
		Actions act=new Actions(Keyword.driver);
		WebElement ele= Keyword.driver.findElement(By.xpath("(//div[@class='main-content'])[1]"));
		act.moveToElement(ele).perform();
		act.click();
	}
}

