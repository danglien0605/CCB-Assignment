package pageObjects;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

import managers.FileReaderManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Wait;


public class BasePage {
    static WebDriver driver;
    private static Logger logger = LogManager.getLogger(BasePage.class);
	protected static int timeout = 30;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElement(String elementName, String elementLocator) {
        WebElement element =driver.findElement(By.xpath(elementLocator));
        Wait.waitForClickablility(element, timeout);
        element.click();
        logger.info("Clicked on {}", elementName);
    }
    	public void navigateToPage(String pageName) {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(pageName));
		//driver.get(url);
        Wait.untilPageLoadComplete(driver);
	}


}