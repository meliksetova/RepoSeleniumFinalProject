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

    @When("^I select LGA airport$")
    public void selectDist(){
        searchResultPage.selectLGA();
    }

    @And("^I click on pool$")
    public void selectFilter(){
        searchResultPage.selectPool();
    }

    @Then("^I verify system displays all hotels within 20 miles radius of airport$")

    public void verifyMiles(){
        searchResultPage.VerifySearchIsDone();
        Assert.assertTrue(searchResultPage.verifyMiles());
    }

    @Then(("^I verify '(.*)' Hotel is within radius$"))
    public void verifyName(String name){
        Assert.assertTrue(searchResultPage.verifyName(name));
    }


}
