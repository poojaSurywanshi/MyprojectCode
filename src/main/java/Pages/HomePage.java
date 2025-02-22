package Pages;

import java.util.List;

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
	
	@FindBy(css="nav[class='navbar_navMain__6Fsll MuiBox-root mui-0'] a:nth-child(1)")
	WebElement Beaty_icon;

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
		Search_icon.click();
		Search_bar.sendKeys("Lip balm");
		List<WebElement> option1=(List<WebElement>) Keyword.driver.findElement(By.cssSelector("body > header > div > div > div.header_toolsLeft__B5HNO.MuiBox-root.mui-0 > div.header_searchpanelContainer__w8sCS.header_active__SC7eK.disableFocus > form > div.header_recentSearchsContainer__TquON > section"));
		WebElement opt1=Keyword.driver.findElement(By.cssSelector(	"body > header > div > div > div.header_toolsLeft__B5HNO.MuiBox-root.mui-0 > div.header_searchpanelContainer__w8sCS.header_active__SC7eK.disableFocus > form > div.header_recentSearchsContainer__TquON > section > article > a:nth-child(1) > span"));
		act.moveToElement(opt1).click()
;		
		//act.sendKeys(Keys.ENTER).perform();
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

	
	
}

