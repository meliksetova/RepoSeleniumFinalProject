package StepDefinition.Hotels;

import Pages.BasePage;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class VerifyMilesSD {
    SearchResultPage searchResultPage=new SearchResultPage();

    @When("^I select (.*) from distance$")
    public void selectDist(String distance){
        searchResultPage.selectDistance(distance);
    }

    @And("^I click on (.*) from Popular filters$")
    public void selectFilter(String filter){
        searchResultPage.selectFilter(filter);
    }

    @Then("^I verify system displays all hotels within '(.*)' miles radius of airport$")
    public void verifyMiles(int miles){
        searchResultPage.VerifySearchIsDone();
        Assert.assertTrue(searchResultPage.verifyMiles(miles));
    }

    @Then(("^I verify '(.*)' Hotel is within radius$"))
    public void verifyName(String name){
        Assert.assertTrue(searchResultPage.verifyName(name));
    }


}
