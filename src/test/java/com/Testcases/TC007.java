package com.Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.tKyd.Keyword;

import Base.TestBase;
import Pages.HomePage;
/*
 * 
Test Case ID: TC007
Title: Validate search with no results.
Steps:
Enter a non-existing product name in the search bar.
Click the "Search" button.
Expected Result: A message should display, stating "No products found."

 */
public class TC007 extends TestBase {
	
	public TC007() {
		super();
	}
	@Test
	public void validat_search() throws InterruptedException {
		HomePage homepage=new HomePage();
		homepage.Search_icon();
		homepage.Search_bar();
		Thread.sleep(5000);
		//System.out.println("Relevant product results displayed.");
		String productName="car";
		List<WebElement> searchResults = Keyword.driver.findElements(By.cssSelector(".productList.cardList.flex-grow.layout-row.layout-wrap.ng-scope"));

		
		if (searchResults.isEmpty()) {
			System.out.println("No products found for: " +productName);
		} else {
			boolean productFound = false;
			for (WebElement result : searchResults) {
				String productText = result.getText();
				System.out.println("Found Product: " + productText);

				// Check if the product name matches
				if (productText.toLowerCase().contains(productName.toLowerCase())) {
					productFound = true;
					break;
				}
			}

			if (productFound) {
				System.out.println("Product validation successful: Product found for '" + productName + "'");
			} else {
				System.out.println("Product validation failed: No matching product found.");

			}
		}	
	}
}
