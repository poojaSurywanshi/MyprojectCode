package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tKyd.Keyword;

public class UserRegistrationPage {

	@FindBy(css="md-tab-item[class='md-tab ng-scope ng-isolate-scope md-ink-ripple md-active'] span[class='ng-scope']")
	public static WebElement New_user ;

	@FindBy(css="md-tab-item[class='md-tab ng-scope ng-isolate-scope md-ink-ripple'] span[class='ng-scope']")
	public static WebElement Member_user ;
	
	@FindBy(css="'a[aria-label='Facebook']'")
	public static WebElement facbook_Icon;

	@FindBy(css="a[aria-label='Google']")
	public static WebElement google_Icon;
	
	@FindBy(css="#input_2")
	public static WebElement Input_email;
	
	@FindBy(css="#input_3")
	public static WebElement Input_Password;

	@FindBy(css="div[class='recaptcha-checkbox-checkmark']")
	public static WebElement recaptcha_btn;
			
	@FindBy(css="md-checkbox[name='privacyPolicyNTermsOfUse'] div[class='md-ripple-container']")
	public static WebElement checkbox1 ;
	
	@FindBy(css="md-checkbox[name='subscribeNewsletter'] div[class='md-ripple-container']")
	public static WebElement checkbox2 ;
	
	@FindBy(xpath="//span[normalize-space()='Register']")
	public static WebElement register_btn;
	
	public UserRegistrationPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	public void facbook_Icon() {
		facbook_Icon.click();
	}
	
	public void google_Icon() {
		google_Icon.click();
	}
	
	public void New_user() {
		New_user.click();
	}
	public static void Input_email(String username) {
		Input_email.sendKeys(username);
	}
	
	public static void Input_Password(String password) {
		Input_Password.sendKeys(password);
	}
	
	public static void register_btn() {
		register_btn.click();
	}
	
	public static void recaptcha_btn() {
		recaptcha_btn.isEnabled();
	}
	
	public static void PrivacypolicyCheck() {
		checkbox1.isEnabled();
		checkbox2.isEnabled();
	}
}
