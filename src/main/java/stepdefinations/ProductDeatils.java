package stepdefinations;
import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tKyd.Keyword;

import Pages.BeautyMakeupPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Waitutils;
public class ProductDeatils extends Waitutils {
	
	private static final Logger logger = LogManager.getLogger(HomePage.class);
	Keyword keyword;
	BeautyMakeupPage BMP;
	WebDriverWait wait;
	Waitutils waitUtils;
	
	@Given("I am on the product listing page")
	public void i_am_on_the_product_listing_page() {
	    keyword.driver.get("https://www.yesstyle.com/en/beauty-makeup/list.html/bcc.15479_bpt.46");
	}

	@When("I click on a product")
	public void i_click_on_a_product() {
	    BMP.Product1.click();
	    waitUtils.waitForPageLoad();
	}

	@Then("I should be redirected to the product details page")
	public void i_should_be_redirected_to_the_product_details_page() {
		wait.until(ExpectedConditions.urlContains("//beauty-makeup/list.html/bcc.15479_bpt.46"));
		assertTrue("Not redirected to Expected page", 
		keyword.driver.getCurrentUrl().contains("/beauty-makeup/list.html/bcc.15479_bpt.46"));
	}

	@And("I should see the product title, price, and description")
	public void i_should_see_the_product_title_price_and_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I am on a product details page")
	public void i_am_on_a_product_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click the {string} button")
	public void i_click_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the product should be added to the shopping cart")
	public void the_product_should_be_added_to_the_shopping_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("the cart count should be incremented")
	public void the_cart_count_should_be_incremented() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}
