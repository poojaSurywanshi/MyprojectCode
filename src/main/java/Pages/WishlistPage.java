package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tKyd.Keyword;

public class WishlistPage {
	

	@FindBy(css="a[class='md-primary md-raised md-button md-ink-ripple']")
	public static WebElement Wishlist_ContinueShoping_Button;
	
	@FindBy(css="div[class='sectionBorder savedItems flex-grow layout-row layout-align-start-start layout-wrap'] div:nth-child(2) button:nth-child(1)")
	WebElement previousPage;
	
	@FindBy(css="div[class='sectionBorder savedItems flex-grow layout-row layout-align-start-start layout-wrap'] div:nth-child(2) button:nth-child(1)")
	WebElement NextPage;
	
	@FindBy(css="span[ng-non-bindable='true'] a")
	WebElement SignInlink;
	
	@FindBy(css="button[ng-click='hideLanguageAlert()'] span[class='ng-scope']")
	WebElement hideLanguageAlert_button ;
	
	public WishlistPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	public static void Wishlist_ContinueShoping() {
		Wishlist_ContinueShoping_Button.click();
	}
	
	public void hideLanguageAlert()
	{
		hideLanguageAlert_button.click();
	}
}

