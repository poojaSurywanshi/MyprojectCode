package stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.tKyd.*;

import java.time.Duration;
import java.util.List;

import org.testng.Assert;

import com.tKyd.Keyword;

import Pages.AddProductPage;
import Pages.HomePage;
import Pages.WishlistPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
public class WishlistSteps {

	private static final Logger LOG = LogManager.getLogger(WishlistSteps.class);
	Keyword keyword;
	HomePage homepage =new HomePage() ;
	WishlistPage wishlst=new WishlistPage();
	
	@Given("open url")
	public void open_url() {
		Keyword.luanchUrl();
		keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		LOG.info("Lunched URL Succsfully");
	}
	@And ("click on Wishlist Icon")
	public void click_on_wishlist_icon() {
		LOG.info("Open WshList Page");
		homepage.wishlistButton();
		
	}
	@Then("Wishlist Page should b open Succesfuly")
	public void wishlist_page_should_b_open_succesfuly() {
		LOG.info("Back to Homepage after Open WshList Page");
	   wishlst.Continue_Shoping_Butn();
	}

	
	
	
	
}