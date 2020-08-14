package StepDefinition.Scholastic;

import Pages.Scholastic.AccountPage;
import Pages.Scholastic.Orders;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class YTOJumperSD {
    AccountPage accountPage=new AccountPage();
    Orders orders=new Orders();
    int number=0;

    @And("^I go to YTO page$")
    public void goToTeacherOrder(){
        accountPage.selectTeacherOrder();
    }

    @And("^I go to By Flyer tab$")
    public void selectByFlyer(){
        orders.SelectFlyers();
    }


    @And("^I click on Price-Qty$")
    public void clickOnPrice(){
        orders.clickOnPriceQty(number);
        number++;
    }

    @Then("^I verify jumper with text is displayed$")
    public void verifyJumperDisplayed(){
        Assert.assertTrue(orders.verifyJumper());
    }

    @Then("^I verify jumper is NOT displayed$")
    public void verifyJumperIsNotDisplayed(){
        Assert.assertFalse(orders.verifyJumper());
    }

    @And("^I click on BonusPoint-Qty box$")
    public void clickBonusPoint(){
        orders.clickOnBonusQty(number);
    }


}
