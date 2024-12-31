package com.keywordFWTestcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tKyd.Keyword;

import Base.TestBase;
import Pages.HomePage;
import Pages.ProductPage;

/*
 * 4. Product Details Page
Test Case ID: TC008
Title: Validate product details page for a selected product.
Steps:
Click on a product from the search results or category list.
Expected Result: The product details page should display with complete information (title, price, description, images, reviews, etc.).

 */
public class TC008 extends TestBase {
	ProductPage pp=new ProductPage();
 public TC008() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void product_details_page() throws InterruptedException {
		HomePage homepage=new HomePage();
		homepage.Search_icon();
		homepage.Search_bar();
		Thread.sleep(3000);

		Keyword.wait1 = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
		
		 try {
	            // Step 2: Locate and click on a product from the search results or category list
	            WebDriverWait wait = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
	            WebElement product = wait.until(ExpectedConditions.elementToBeClickable(
	                By.cssSelector("img[title='Sofea - Moisturizing Plant Lip Balm - 2 Flavors']")));
	            String selectedProductName = product.getText(); // Save product name for validation
	            product.click();

	            // Step 3: Validate product details page
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".productDetailPage_productUpperWrap__0vIEc")));

	            // Validate Title
	            WebElement titleElement =Keyword. driver.findElement(By.xpath("//title[contains(text(),'Sofea - Moisturizing Plant Lip Balm - 2 Flavors | ')]"));
	            String productTitle = titleElement.getText();
	            if (productTitle.equalsIgnoreCase(selectedProductName)) {
	                System.out.println("Product title is displayed correctly: " + productTitle);
	            } else {
	                System.out.println("Product title mismatch. Expected: " + selectedProductName + ", Found: " + productTitle);
	            }

	            // Validate Price
	            WebElement priceElement = Keyword.driver.findElement(By.cssSelector(".productDetailPage_sellingPrice__s6PZu"));
	            if (priceElement.isDisplayed()) {
	                System.out.println("Product price is displayed: " + priceElement.getText());
	            } else {
	                System.out.println("Product price is not displayed.");
	            }

	            // Validate Description
	            WebElement descriptionElement = Keyword.driver.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(4) > div:nth-child(1) > section:nth-child(6) > h3:nth-child(1)"));
	            if (descriptionElement.isDisplayed()) {
	                System.out.println("Product description is displayed.");
	            } else {
	                System.out.println("Product description is not displayed.");
	            }

	            // Validate Images
	            List<WebElement> images = Keyword.driver.findElements(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.MuiButton-root.MuiButton-text.MuiButton-textPrimary.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorPrimary.productDetailPage_md-button__5P_hJ.mui-style-130uzg4"));
	            if (!images.isEmpty()) {
	                System.out.println("Product images are displayed. Total images: " + images.size());
	            } else {
	                System.out.println("Product images are not displayed.");
	            }

	            // Validate Reviews (if available)
	            WebElement reviewsSection = Keyword.driver.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(4) > div:nth-child(1) > section:nth-child(6) > h3:nth-child(1)"));
	            if (reviewsSection.isDisplayed()) {
	                System.out.println("Product reviews are displayed.");
	            } else {
	                System.out.println("Product reviews section is not displayed.");
	            }

	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
}

