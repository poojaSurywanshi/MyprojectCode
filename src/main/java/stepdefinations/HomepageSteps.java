package stepdefinations;
import static org.junit.Assert.*;
import Pages.HomePage;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.tKyd.Keyword;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {
	private static final Logger LOG = LogManager.getLogger(WishlistSteps.class);
	WebDriverWait wait;
	Keyword keyword;
	HomePage homepage =new HomePage();
	Actions actions = new Actions(keyword.driver);

	@Given("I open the homepage")
	public void i_open_the_homepage() {
		keyword.luanchUrl();
		keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		LOG.info("Lunched URL Succsfully");
	}
	@Then("I should see the homepage title")
	public void i_should_see_the_homepage_title() {
		String title = keyword.driver.getTitle();
		String Actual_title=keyword.driver.getTitle();
		String Expectd_title="Beauty, Skin Care, and Health and Wellness | YesStyle";
		assertEquals(Actual_title,Expectd_title);	
		LOG.info("Succesfully check the Hompage title");
	}
	@And("I should see product categories and banners")
	public void i_should_see_product_categories_and_banners() {
		homepage.ShopingBag_icon.isDisplayed();
		assertTrue("Shoping icon is not displayed",homepage.ShopingBag_icon.isDisplayed());
		assertTrue("Beauty Section s not displayed",homepage.Beauty_Icon.isDisplayed());
		assertTrue("Women Section not displayed",homepage.Women.isDisplayed());
		assertTrue("Men Section is not displayed",homepage.Men.isDisplayed());
		assertTrue("Lifestyle Icon is not displayed",homepage.Lifestyle.isDisplayed());
		assertTrue("Health Icon  is not displayed",homepage.Health.isDisplayed());
		assertTrue("Sale Icon is not displayed",homepage.Sale.isDisplayed());
		assertTrue("Blog is not displayed",homepage.Blog.isDisplayed());
	}

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() throws InterruptedException {
		LOG.info("YOur are on hompage");
		Thread.sleep(new Random().nextInt(3000) + 2000);
	}
	@When("I click on the Sign In button")
	public void i_click_on_the_button() throws InterruptedException {
		homepage.SignIn_Register_header_Icon();
	
		actions.moveByOffset(100, 200).perform();
		Thread.sleep(new Random().nextInt(3000) + 2000);
		
	}
	@Then("I should be redirected to the login page")
	public void i_should_be_redirected_to_the_login_page() {

		wait.until(ExpectedConditions.urlContains("/sign-in"));
		assertTrue("Not redirected to login page", 
				keyword.driver.getCurrentUrl().contains("/en/secure/sign-in.html"));
	}

	@Then("I should see all product categories listed")
    public void i_should_see_all_product_categories_listed() {
       // Dimension categoryCount =homepage.Discount_Sction.getSize();
		List<WebElement> productNames = keyword.driver.findElements(By.cssSelector("section[class='discountGrid_discountGridWrapper__Zfb4_']"));
//		int count = productNames.size();
//	    Assert.assertTrue(count > 0, "No categories found on the homepage");

		for (WebElement product : productNames) {
		    System.out.println(product.getText());
		}
		
		
		
    }

	
	
	
	
	
	
	
	
	
	

}