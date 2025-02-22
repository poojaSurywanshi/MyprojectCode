package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tKyd.Keyword;

public class AddProductPage {
	@FindBy(xpath="//div[@class='carousel_embla__container__SGMbn']//div[1]//div[1]//a[1]")
	WebElement productBanner;

	@FindBy(css="img[title='3CE - Blur Water Tint - 13 Colors']")
	public static
	WebElement product1;

	@FindBy(css=".MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.button_greenButton__embmy.buyOptions_addToBag__sniuQ.mui-13gq6ei\r\n")
	WebElement addtobag_btn;
	
	@FindBy(css="a[aria-label='shopping bag'] span[class='MuiBadge-root mui-chz7cr'] svg")
	WebElement Shooping_cart;
	
	@FindBy(xpath="//div[@class='bagCoverWrapper']//img")
	public
	WebElement cartProduct;
	
	@FindBy(xpath="//span[normalize-space()='View in Bag']")
	WebElement veiwInbag;
	
	public AddProductPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	public void ClickOnBanner(){
		productBanner.click();
	}

	public void ClickProduct1(){
		product1.click();
	}

	public void Click_addtobag_btn(){
		//addtobag_btn=Keyword.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.button_greenButton__embmy.buyOptions_addToBag__sniuQ.mui-13gq6ei\\r\\n")));
		addtobag_btn.click();
	}

	public void Shooping_cart_click(){
		Shooping_cart.click();
	}

	public void veiwInbag(){
		veiwInbag.click();
	}

	
	public void products() throws InterruptedException {
		WebElement prodt2= Keyword.driver.findElement(By.xpath("(//img[@class='producthighlight_itemImage__FdcLh'])[1]"));
	    ((JavascriptExecutor) Keyword.driver).executeScript("arguments[0].scrollIntoView();", prodt2);
	    WebElement prodt2_btn= Keyword.driver.findElement(By.xpath("(//button[@type='button'])[9]"));
	    Thread.sleep(1000);prodt2_btn.click();
	    Thread.sleep(1000);
	    
	    WebElement procdt3=Keyword.driver.findElement(By.xpath("(//button[@type='button'])[10]"));
	    procdt3.click();
	    Thread.sleep(1000);
	    WebElement procdt4=Keyword.driver.findElement(By.xpath("(//button[@type='button'])[11]"));
	    		procdt4.click(); 
	    		Thread.sleep(1000);
	}







}
