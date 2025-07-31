package com.Testcases;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tKyd.Keyword;

/*
 * Test Case ID: CART-009
Title: a user add a single item to the cart.
Preconditions:
User is logged out.
The product exists in the catalog.
Steps:
Navigate to the product page.
Click the "Add to Cart" button.
Go to the "Cart" section.
Expected Result:
The product should appear in the cart with correct details (name, price, quantity).

 */
import Base.TestBase;
import Pages.AddProductPage;
import Pages.HomePage;

public class Cart5_TC009 extends TestBase{
	
	public Cart5_TC009() {
		super();
	}
	@Test

	public void Addtocart() throws InterruptedException {
		AddProductPage addproduct=new AddProductPage();
		HomePage homepage=new HomePage();
		Thread.sleep(2000);
		addproduct.ClickOnBanner();
		addproduct.ClickProduct1();
		addproduct.Click_addtobag_btn();
		Thread.sleep(2000);
		addproduct.veiwInbag();
		
		Assert.assertTrue(addproduct.cartProduct.isDisplayed(), "The product should be displayed in the cart.");
        System.out.println("Test Passed: Product successfully added to cart.");


	}

}
