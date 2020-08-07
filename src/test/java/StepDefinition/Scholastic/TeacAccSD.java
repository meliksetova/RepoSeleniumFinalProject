package StepDefinition.Scholastic;

import Drivers.Web;
import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TeacAccSD {
    LandingPage landingPage=new LandingPage();


    @Given("^I am on the Homepage$")
    public void launchScholastic(){
        Web.initDriver("https://clubs3qa1.scholastic.com/home");
    }

    @When("^I tap on 'Create an Account'$")
    public void createAccount(){
        landingPage.createAccount();
    }

    @And("^I click on Teacher radio button if not selected$")
    public void clickTeacherRadioButton(){
       landingPage.clickTeacherRadioButton();
    }

    @And("^I fill out all required fields$")
    public void fillOutForms(){
        landingPage.Form();
    }

    @Then("^I verify successful creation of a user profile$")
    public void verifyAccountCreation(){
        Assert.assertTrue(landingPage.verifyAccountMessage());
    }


}
