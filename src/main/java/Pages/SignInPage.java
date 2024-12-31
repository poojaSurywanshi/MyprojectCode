package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tKyd.Keyword;

public class SignInPage {
	@FindBy(css="#input_5")
	public static WebElement Sign_in_email;

	@FindBy(css="#input_4")
	public static WebElement passwd_tb;

	@FindBy(css="form[name='signInForm'] button[type='submit']")
	public static WebElement sign_in_btn;


	public SignInPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(css="a[class='md-primary md-button md-ink-ripple'] span[class='ng-scope']")
	WebElement rset_pawd_link;

	@FindBy(css="a[class='md-primary md-button ng-scope md-ink-ripple'] span[class='ng-scope']")
	WebElement order_trac_link;

	public void Signin_email() {
		Sign_in_email.sendKeys("vitor97853@cctoolz.com");;
	}

	public void password_btn() {
		passwd_tb.sendKeys("agsag@12");
	}
	public void signin_submit_btn() {
		sign_in_btn.click();
	}
 public void rset_pawd() {
	 rset_pawd_link.click();
}
 public void order_track() {
	order_trac_link.click();
}
 
}