package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class StartPage extends Utility {
   // 1.StartPage - startNowButton locatores and create method 'void clickStartNow()'
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startNowButton;

    public void clickStartNow() {
       log.info("click start now ");
        clickOnElement(startNowButton);


    }


}
