package Pages;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tKyd.Keyword;
public class BeautyMakeupPage {

	private static final Logger logger = LogManager.getLogger(HomePage.class);
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));

	public BeautyMakeupPage() {
		this.driver=Keyword.driver;
		PageFactory.initElements(Keyword.driver, this);
	}
	
	@FindBy(xpath="(//img[@class='MuiBox-root mui-wb2vxn'])[3]")
	public WebElement Product1;
	
	@FindBy(css=".discountGrid_grid-img__MSsW4[src='/_next/image?url=https://ddvql06zg3s2o.cloudfront.net/Assets/res/imgs/creative/25wk37/pb_skin1004.jpg&w=640&q=80']")
	public WebElement Productcatagori1;
}
