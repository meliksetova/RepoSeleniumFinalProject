package StepDefinition.Hotels;

import Drivers.Web;
import Pages.BasePage;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class VerifyRatingSD {
    LandingPage landingPage=new LandingPage();
    SearchResultPage searchResultPage=new SearchResultPage();

    @Given("^I am on default locations search result screen$")
    public void searchPage(){
        Web.initDriver("https://www.hotels.com/");
        landingPage.enterDestination("new york");
        landingPage.selectDestFromAutoSuggestions("New York, New York, United States of America");
        landingPage.clickSearchButton();
    }

    @When("^I click on '(.*)' star$")
    public void clickStars(String star){
        searchResultPage.selectStars(star);
    }

    @Then("^I verify hotels are '(.*)' star rating$")
    public void verifyStars(String star){
        searchResultPage.VerifySearchIsDone();
        Assert.assertTrue(searchResultPage.verifyStars(star));
 }




}
