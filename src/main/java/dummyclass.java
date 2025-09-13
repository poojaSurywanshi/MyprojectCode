

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tKyd.Keyword;

public class dummyclass {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
		chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

		chromeOptions.addArguments("--start-maximized"); // Start the browser maximized
		//chromeOptions.addArguments("--incognito");       // Open in incognito mode
		chromeOptions.addArguments("--disable-notifications"); // Disable notifications

		WebDriver driver=new ChromeDriver(chromeOptions);

		driver.get("https://www.yesstyle.com/en");
		Thread.sleep(2000);
		//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//	js.executeScript("window.scrollBy(0,300");
		//	WebElement element=driver.findElement(By.xpath("(//div[@class='producthighlight_itemCover__R5OKS'])[1]"));
		//    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		//element.click()
		//;
		//	
		//String Actual_title=driver.getTitle();
		//System.out.println(Actual_title);
		//
		//String Expectd_title="Beauty,Skin Care, and Health and Wellness | YesStyle";
		//
		//assertEquals(Actual_title,Expectd_title,"Homepag title is InCorrect as it is mentioned");	
		//driver.get("https://www.yesstyle.com/en/beauty-makeup/list.html/bcc.15479_bpt.46");
		
		WebDriverWait wait=new WebDriverWait(driver, null);
		
		WebElement Product=driver.findElement(By.cssSelector(".discountGrid_grid-img__MSsW4[src='/_next/image?url=https://ddvql06zg3s2o.cloudfront.net/Assets/res/imgs/creative/25wk37/pb_skin1004.jpg&w=640&q=80']"));
		Product.click();    
		
		WebElement Product1=driver.findElement(By.xpath("(//img[@class='MuiBox-root mui-wb2vxn'])[3]"));
		Product1.click();

	driver.quit();

	}


}