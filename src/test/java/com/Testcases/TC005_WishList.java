package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tKyd.Keyword;

import Base.TestBase;
import Pages.AddProductPage;
import Pages.HomePage;
import Pages.SignInPage;
import Pages.WishlistPage;

class TC005_WishList extends TestBase{

	
	public  TC005_WishList() {
		super();
	}
	@Test(priority=1)
	public void tc_CheckWishlist_isEmpty() throws InterruptedException {
		
		HomePage homepage=new HomePage();
		WishlistPage wishlist=new WishlistPage();
		AddProductPage addproduct=new AddProductPage();
		
		homepage.Wishlist_Icon();
		Thread.sleep(2000);
		
		if(wishlist.Wishlist_ContinueShoping_Button.isDisplayed()) {
			System.out.println("Wishlist is Displayed\n"+"Wishlist is Empty\n");
			Thread.sleep(1500);
			WishlistPage.Wishlist_ContinueShoping();
		} else {
			System.out.println("Wishlist feature is NOT displayed"+"Wishlist is Not Empty\n");
			
		}
	}
	
	@Test(priority=2)
	public void tc_AddTo_Wishlist() throws InterruptedException {
		HomePage homepage=new HomePage();
		WishlistPage wishlist=new WishlistPage();
		AddProductPage addproduct=new AddProductPage();
		
		addproduct.ClickOnBanner();
		addproduct.ClickProduct1(); 
		wishlist.ClickOnsave_btn() ;
		homepage.Wishlist_Icon();
		Thread.sleep(1500);
		if(addproduct.product1.isDisplayed()) {
			System.out.println("Product is Displayed in Wishlist\n");
		} else {
			System.out.println("Product is Displayed in Wishlist"+"Wishlist is Not Empty\n");
			
		}
	}
}






















