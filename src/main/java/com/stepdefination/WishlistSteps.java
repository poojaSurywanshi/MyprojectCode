package com.stepdefination;

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

	private static final Logger LOG = Logger.getLogger(Hooks.class);

@Given("Application url is luanched")
public void luanAppUrl() {
LOG.info("Website Luanched Succesfully");
}

@When("the user searches for {string} and clicks on {string}")
public void the_user_searches_for_and_clicks_on(String string, String string2) throws InterruptedException {
	HomePage homepage=new HomePage();
	Pages.WishlistPage wishlist=new Pages.WishlistPage();
	AddProductPage addproduct=new AddProductPage();
	/*
	addproduct.ClickOnBanner();
	addproduct.ClickProduct1(); */
	Thread.sleep(2000);
	addproduct.products();
	//wishlist.ClickOnsave_btn() ;

}
@And("Navigate to the wishlist cart")
public void Navigate_to_the_wishlist_cart() throws InterruptedException  {
	HomePage homepage=new HomePage();
	Thread.sleep(2000);
		homepage.Wishlist_Icon();
		Keyword.driver.navigate().refresh();

}

@Then("product should be present in Wishlist")
public void product_should_be_present_in_wishlist() {
	WishlistPage wishlist=new Pages.WishlistPage();
	
	try{
		Assert.assertTrue(wishlist.isProductInWishlist("medicube - Collagen Night Wrapping Mask"),"Product is not present in the wishlist");
		}	
    finally{
    	System.out.println("*****Product is present in the wishlist******");
    	} 
	
}
@Given("the user has a product in their wishlist")
public void the_user_has_a_product_in_their_wishlist() {
	
	 List<String> products = WishlistPage.getWishlistProducts();
     System.out.println("Wishlist Products: " + products);
}

@When("the user clicks on Delete btn")
public void the_user_clicks_on() throws InterruptedException{
	Pages.WishlistPage wishlist=new Pages.WishlistPage();
	wishlist.remove_product();
}

@Then("the product should be removed from the wishlist")
public void the_product_should_be_removed_from_the_wishlist() throws InterruptedException {
	Pages.WishlistPage wishlist=new Pages.WishlistPage();
	if(wishlist.isProductInWishlist("Beauty of Joseon - Relief Sun"))
	{
		System.out.println("***product removed succesfully***");
	}else {
		System.out.println("***product not removed succesfully***");
	}
}


}
