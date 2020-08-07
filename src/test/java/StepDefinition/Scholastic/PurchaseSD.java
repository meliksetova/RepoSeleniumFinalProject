package StepDefinition.Scholastic;

import Pages.Scholastic.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class PurchaseSD {
    LandingPage landingPage=new LandingPage();
    AccountPage accountPage=new AccountPage();
    Orders orders=new Orders();
    Cart cart=new Cart();
    Checkout checkout=new Checkout();


    @When("^I login$")
    public void login(){
        landingPage.login();
    }

    @And("^I select 'Your Teacher Order' from Enter Orders$")
    public void SelectTeacherOrder(){

        accountPage.selectTeacherOrder();
    }

    @And("^I go to 'BY FlYER' category$")
    public void selectByFlyer(){
        orders.SelectFlyers();
    }

    @And("^I add '(.*)' item of '(.*)'$")
    public void selectItems(String quantity, String item){
        orders.selectItems(item,quantity);
    }

    @And("^I click on 'REVIEW CART' button$")
    public void selectReviewCart(){
        orders.clickOnReviewCart();
    }

    @And("^I proceed to checkout$")
    public void proceedToCheckout(){
        cart.goToCheckout();
        checkout.submitCheckout();
    }

    @Then("^I verify order has been placed successfully$")
    public void verifyOrder(){
        Assert.assertTrue(checkout.VerifyOrder());
    }

}
