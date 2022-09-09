package pageObjects;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;


public class HomePage extends BasePage {
    WebDriver driver;
    //Logger LOG = LoggerFactory.getLogger(HomePage.class);

    private static Logger logger = LogManager.getLogger(HomePage.class);

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='elementor-section-wrap']/section[@id='stickyheaders']//a[text()='Pricing']")
	private WebElement btn_pricing;


//	public void perform_Search(String search) {
//		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl() + "/?s=" + search + "&post_type=product");
//	}
//
//	public void navigateTo_HomePage() {
//		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
//	}




}