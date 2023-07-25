package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
/*
5.ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
  and  'void clickNextStepButton()'
 */

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class);
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement workForHealthCare;

    @CacheLookup
    @FindBy()
    WebElement reasonForVisitList;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement jointPartner;

    public void selectReasonForVisitTourism(){
       log.info("Select reason for tourism");
            driver.findElement(By.xpath("//input[@id='response-0']")).click();
        }
        public void selectReasonForVisitWork(){

        driver.findElement(By.xpath("//input[@id='response-1']")).click();
        }
        public void selectReasonForJointPartner(){
        clickOnElement(jointPartner);

        }
        public void planningToWorkForHealthCare(){
        clickOnElement(workForHealthCare);
        }


    public void clickNextStepButton(){
        log.info("click next step button");
        clickOnElement(nextStepButton);

    }


}
