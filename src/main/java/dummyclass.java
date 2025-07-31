

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
	driver.findElements(By.cssSelector("a[aria-label='wish list']"));
	List <WebElement> Ws_list=driver.findElements(By.xpath("//div[@class='productList ysColumnGrid layout-padding']"));
	 System.out.println("**Produxts present in Wishist**"+Ws_list);

}
}