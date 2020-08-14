package StepDefinition.Scholastic;

import Pages.Scholastic.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AccountSD {
    LandingPage landingPage=new LandingPage();
    AccountPage accountPage=new AccountPage();
    Profile profile=new Profile();
    Orders orders=new Orders();
    Cart cart=new Cart();
    Checkout checkout=new Checkout();
    String first;
    String last;

    @When("^I Login$")
    public void login(){
        landingPage.login();
        accountPage.closeNotification();

    }

    @And("^I go to My Accounts page$")
    public void goToMyAccount(){
        accountPage.goToMyAccount();
    }

    @And("^I add credit card (.*)$")
    public void newCreditCard(String cardNumber){
        profile.newCard(cardNumber);
    }

    @And("^I update the Name to (.*) (.*)$")
    public void updateName(String firstName,String lastName){
        first = firstName;
        last=lastName;
        profile.updateLastName(first, last);
    }

    @Then("^I verify name is updated successfully in My Accounts$")
    public void updateAccountName(){
        Assert.assertTrue(profile.verifyNameUpdatesInAccount(first, last));
    }

    @Then("^I verify name is updated successfully in Page Header$")
    public void updateProfileAccount(){
        Assert.assertTrue(profile.verifyNameUpdatesInPageHeader(last));
    }

    @Then("^I verify credit card ending with (.*) is added successfully in My Accounts$")
    public void verifyCreditCardInAccount(String cardEnding){
        Assert.assertTrue(profile.verifyCreditCardInAccount(cardEnding));
    }

    @And("^I verify added card with (.*) is displayed when shopping using credit card$")
    public void verifyCreditCardDisplayedInShoppingCard(String cardEnding){
        accountPage.selectTeacherOrder();
        orders.selectItems("10N1","10");
        orders.clickOnReviewCart();
        cart.goToCheckout();
        Assert.assertTrue(checkout.verifyCardInAccount(cardEnding));
    }


}
