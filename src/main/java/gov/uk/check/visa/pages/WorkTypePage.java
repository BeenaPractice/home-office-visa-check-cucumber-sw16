package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    // 2.WorkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
    // and 'void clickNextStepButton()'
private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement selectJobTypeList;

    public void selectJobType(String job) {
        log.info("Select job type");
        clickOnElement(selectJobTypeList);

    }

    public void clickNextStepButton() {
        log.info("click next step button");
        clickOnElement(nextStepButton);

    }

}
