package com.keywordFWTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tKyd.Keyword;

import Base.TestBase;
import Pages.HomePage;
import Pages.SignInPage;
import Pages.WishlistPage;

public

class TC005_WishList extends TestBase{

	public  TC005_WishList() {
		super();
	}
	@Test
	public void tc_01() throws InterruptedException {
		HomePage homepage=new HomePage();
		WishlistPage wishlist=new WishlistPage();
		homepage.validateHomePage();
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
}


