package com.Testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tKyd.Keyword;

/*
 * 2. Sign in
Test Case ID: TC003
Title: Validate login functionality with valid credentials.
Steps:
Open the login page.
Enter a registered email and password.
Click the "Login" button.
Expected Result: User should log in and be redirected to the homepage.

Test Case ID: TC004
Title: Validate error message for incorrect credentials.
Steps:
Open the login page.
Enter an invalid email or password.
Click the "Login" button.
Expected Result: An error message should display, stating "Invalid email or password."

Title: Validate form submission with missing mandatory fields.
Steps:
Open the form page.
Leave one or more mandatory fields empty.
Click the "Submit" button.
Expected Result: An error message should display, highlighting the missing fields.

 */
import Base.TestBase;
import Pages.HomePage;
import Pages.SignInPage;

public class TC003_SignIn extends TestBase{

	public  TC003_SignIn() {
		super();
	}
	@Test
	public void Register_validData() throws InterruptedException {
		SignInPage signin=new SignInPage();
		HomePage homePage = new HomePage();


		homePage.SignIn();
		homePage.signIn_link();
		Thread.sleep(1000);
		//	/*
		Keyword.wait1 = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
		try {
			// Wait for the pop-up element to appear
			Keyword.wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p[class='h2 spacer-bottom']")));

			// Close the pop-up
			Keyword.driver.navigate().back();
		} catch (Exception e) {
			System.out.println("Execution Stop.");
		}
		//		*/    
		Thread.sleep(2000);
		homePage.SignIn();
		homePage.signIn_link();
		Thread.sleep(2000);
		signin.Signin_email();
		signin.password_btn();
		signin.signin_submit_btn();


	}




}