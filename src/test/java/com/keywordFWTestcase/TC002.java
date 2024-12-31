package com.keywordFWTestcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tKyd.Keyword;

import Base.TestBase;
import Pages.HomePage;
import Pages.UserRegistrationPage;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


/*
//Test Case ID: TC002
//Title: Validate registration with invalid email and password format.
//Steps:
//Navigate to the registration page.
//Enter an invalid email format (e.g., "abc.com") in the email field.
//Click the "Register" button.
Expected Result: An error message should display, stating "Please enter a valid email address."
*/

public class TC002 extends TestBase {

	public TC002() {
		super();
	}

	@Test(dataProvider = "loginCredentials")
	public void TC002_InValidate(String username, String password) throws InterruptedException {

		HomePage homePage = new HomePage();
		UserRegistrationPage UserR_p=new UserRegistrationPage();	

		homePage.SignIn();
		homePage.register();
		
		Thread.sleep(1000);
		UserR_p.Input_email(); //empty
		Thread.sleep(1000);
		 WebElement errorMessage = Keyword.wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[ng-message='email']")));
	            // Verify the error message
	            String actualErrorMessage = errorMessage.getText();
	            String expectedErrorMessage = "Please enter a valid email address."; // Update this according to your application

	            if (actualErrorMessage.equals(expectedErrorMessage)) {
	                System.out.println("Test Passed: Correct error message is displayed.");
	            } else {
	                System.out.println("Test Failed: Incorrect error message. Expected: " 
	                                   + expectedErrorMessage + ", but found: " + actualErrorMessage);
	            }
		
		Thread.sleep(1000);
		UserR_p.Input_Password(); //empty 
		Thread.sleep(1000);
		WebElement errorMessage_password = Keyword.wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[ng-message-exp=\"['minlength', 'maxlength']\"]")));
            // Verify the error message
            String actualErrorMessage_p = errorMessage_password.getText();
            String expectedErrorMessage_p = "Passwords must be 8 to 20 characters in length."; // Update this according to your application

            if (actualErrorMessage.equals(expectedErrorMessage)) {
                System.out.println("Test Passed: Correct error message is displayed.");
            } else {
                System.out.println("Test Failed: Incorrect error message. Expected: " 
                                   + expectedErrorMessage + ", but found: " + actualErrorMessage);
            }
		
	} 

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
