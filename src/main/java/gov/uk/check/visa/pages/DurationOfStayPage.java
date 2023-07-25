package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
  //  7.DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
 // 'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
 // 'void clickNextStepButton()'
  private static final Logger log = LogManager.getLogger(DurationOfStayPage.class);
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement moreThanSixMonths;

    public void selectLengthOfStayLongerThanSixMonth(){
        log.info("select length of stay ");
            clickOnElement(moreThanSixMonths);
        }




    public void clickNextStepButton(){
      log.info("click next step button");
        clickOnElement(nextStepButton);

    }



}
