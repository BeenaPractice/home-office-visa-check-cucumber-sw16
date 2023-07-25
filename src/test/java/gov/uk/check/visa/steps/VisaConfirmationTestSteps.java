package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationTestSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Click on start button")
    public void clickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I Select a Nationality {string}")
    public void iSelectANationalityAustralia(String country) {
        new SelectNationalityPage().selectNationality(country);
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason Tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForVisitTourism();
    }

    @Then("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK(String australiaMessage) {
        Assert.assertEquals(australiaMessage,new ResultPage().getResultMessage1());
    }

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I Click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I Select reason {string}")
    public void iSelectReasonWorkAcademicVisitOrBusiness(String work) {
        new ReasonForTravelPage().selectReasonForVisitWork();
    }

    @And("I Select intendent to stay for {string}")
    public void iSelectIntendentToStayForLongerThanMonths(String months) {
        new DurationOfStayPage().selectLengthOfStayLongerThanSixMonth();
    }

    @And("I Select have planning to work for {string}")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional(String job) {
        new WorkTypePage().selectJobType(job);
    }

    @Then("verify result of {string}")
    public void verifyResultOfYouNeedAVisaToWorkInHealthAndCare(String workMessage) {
        Assert.assertEquals(workMessage,new ResultPage().getResultMessage2());
    }

    @And("I Select reason Join partner or family for a long stay")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForJointPartner();
    }

    @Then("verify resultcolombia {string}")
    public void verifyResultcolombiaYouMayNeedAVisa(String colombiaMessage) {
        Assert.assertEquals(colombiaMessage,new ResultPage().getResultMessage3());
    }
}
