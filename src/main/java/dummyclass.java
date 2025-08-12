

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
	
	//driver.get("https://www.yesstyle.com/en");
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

    driver.get("https://www.yesstyle.com/en/beauty-makeup/list.html/bcc.15479_bpt.46");
    WebElement Product1=driver.findElement(By.cssSelector("img[src='https://d1flfk77wl2xk4.cloudfront.net/Assets/49/215/M_p0114021549.jpg']"));
Product1.click();    

	
	
	
	
	}

	
}