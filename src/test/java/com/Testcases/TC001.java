package com.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.dataproviders.LoginDataProvider;
import com.tKyd.Keyword;

import Base.TestBase;
import Pages.HomePage;
import Pages.SignInPage;
import Pages.UserRegistrationPage;

/*1. User Registration
Test Case ID: TC001	
Title: Validate user Signin with valid details.
Steps:
Navigate to the registration page.
Fill in valid details in all mandatory fields (name, email, password, etc.).
Click the "Register" button.
Expected Result: User should be successfully registered, and a confirmation email should be sent.
 */
 class TC001 extends TestBase{
	public TC001() {
		super();
	}

	 @Test(dataProvider = "loginData", dataProviderClass =LoginDataProvider.class)
	public static  void TC001_Validate(String username, String password) throws InterruptedException {

		HomePage homePage = new HomePage();
		

		homePage.SignIn();
		homePage.signIn_link();	Thread.sleep(2000);
		homePage.ShadowRootExample();
		Thread.sleep(2000);
		homePage.Member();
		Thread.sleep(2000);
		homePage.Input_email(username);
		homePage.Input_Password(password);
		
		homePage.signIn_btn();
		Thread.sleep(1000);

			}
}
