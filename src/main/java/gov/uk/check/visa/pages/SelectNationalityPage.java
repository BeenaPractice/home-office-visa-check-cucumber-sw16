package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
  //  3.SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create methods  'void selectNationality(String nationality)'
  //  and 'void clickNextStepButton()'
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectNationality(String nationality){
        log.info("Select Nationality");
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);

    }
    public void clickNextStepButton(){
       log.info("click on next step button");
        clickOnElement(nextStepButton);

    }

}
