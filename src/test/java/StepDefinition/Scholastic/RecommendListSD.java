package StepDefinition.Scholastic;


import Pages.Scholastic.AccountPage;
import Pages.Scholastic.MyListsPage;
import Pages.Scholastic.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class RecommendListSD {
    AccountPage accountPage=new AccountPage();
    SearchPage searchpage=new SearchPage();
    MyListsPage myListsPage=new MyListsPage();
    String bookName;

    @And("^I search '(.*)' using search box$")
    public void search(String name){
        bookName=name;
    accountPage.search(bookName);
    }

    @And("^I click on star icon$")
        public void clickOnStar(){
        searchpage.clickStar();
        }


    @Then("^I verify item is added to recommended list$")
    public void verifyRecomendationList() {
        Assert.assertTrue(searchpage.verifyStarIsDisplayed());
        Assert.assertTrue(searchpage.verifyItemInList());
        Assert.assertTrue(myListsPage.verifyBookOnList(bookName));
    }

}
