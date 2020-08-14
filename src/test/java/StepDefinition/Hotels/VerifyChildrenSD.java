package StepDefinition.Hotels;

import Drivers.Web;
import Pages.BasePage;
import Pages.Hotels.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class VerifyChildrenSD {
    LandingPage landingPage=new LandingPage();


    @Given("^I am on hotels landing page$")
    public void launchHotels() {
        Web.initDriver("https://www.hotels.com/");
        landingPage.closePopUp();
    }

    @When("^I select '(.*)' in children dropdown$")
    public void selectFromChildDropdown(String childrenCount) {
        landingPage.selectFromChildrenDropDown(childrenCount);
    }

    @Then("^I see '(.*)' child age dropdowns$")
    public void verifyDropdowns(int childrenCount){
        Assert.assertTrue(landingPage.verifyDropdowns(childrenCount));
    }



}
