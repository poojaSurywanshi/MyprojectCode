package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(css="button[aria-label='Save']")
	WebElement save_btn;
	
	@FindBy(xpath="//a[contains(@class,'flag-bg')]//img")
	WebElement product1;
	
	@FindBy(xpath="(//a[contains(text(),'Delete')])[1]")
	WebElement delete_btn;
	
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
	
	public void ClickOnsave_btn() {
		save_btn.click();
	}
	
	public void remove_product() throws InterruptedException {
		Actions act1=new Actions(Keyword.driver);
		act1.moveToElement(product1).perform();
		Thread.sleep(1000);
		act1.moveToElement(delete_btn).click().perform();
	}
	
	//productName="medicube - Collagen Night Wrapping Mask"
	public static boolean isProductInWishlist(String productName) {
        List<WebElement> WsCartProducts = Keyword.driver.findElements(By.cssSelector(".productList.ysColumnGrid.layout-padding"));;
        for (WebElement item : WsCartProducts) {
            if (item.getText().contains(productName)) {
                return true;
            }
        }
        return false;
    }
	 
		static By Ws_list_items=By.xpath("//div[@class='productList ysColumnGrid layout-padding']");
	 
	 public static List<String> getWishlistProducts() {
	        List<WebElement> items = Keyword.driver.findElements(Ws_list_items);
	        List<String> productNames = new ArrayList<>();

	        for (WebElement item : items) {
	            productNames.add(item.getText()); // Assuming the product name is visible in text
	        }
	        return productNames;
}

	 
	 
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
