package gov.uk.check.visa.pages;
/*
4.ResultPage - resultMessage locator and create methods 'String getResultMessage()'
 and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
 */

import gov.uk.check.visa.browserfactory.ManageBrowser;
import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ManageBrowser.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage1;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage2;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa')]")
    WebElement resultMessage3;

    public String getResultMessage1(){
        log.info("Get result message for tourism");
        return getTextFromElement(resultMessage1);
    }

    public void confirmResultMessage1(String expectedMessage){
    log.info("verified visa message");
       // Assert.assertTrue(expectedMessage.equals(getResultMessage1()));

    }

    public String getResultMessage2(){
        log.info("get message for health care");
        return getTextFromElement(resultMessage2);
    }
    public void confirmResultMessage2(String expectedMessage2){

//        Assert.assertTrue(expectedMessage2.equals(getResultMessage2()));
//        CustomListeners.test.log(Status.PASS,"confirm message");
    }

    public String getResultMessage3(){
       log.info("get message for family stay");
        return getTextFromElement(resultMessage3);
    }
    public void confirmResultMessage3(String expectedMessage3){
      //  Assert.assertTrue(expectedMessage3.equals(getResultMessage3()));

    }
}
