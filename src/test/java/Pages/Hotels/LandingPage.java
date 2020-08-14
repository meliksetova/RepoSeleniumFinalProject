package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {
    By searchBoxLocator = By.id("qf-0q-destination");
    By searchButtonLocator = By.xpath("//button[@type='submit']");
    By autoSuggestionsLocator = By.xpath("//div[@class='autosuggest-category-result']");
    By childrenDropDownLocator = By.id("qf-0q-room-0-children");
    By continueLocator = By.xpath("//button[@class='cta widget-overlay-close']");
    By dropdownsLocator=By.xpath("//select[contains(@id,'qf-0q-room-0-child-')]");

    public void closePopUp() {
        if (findElementsUsingFluentWait(continueLocator).size()!=0){
            clickThis(continueLocator);}
    }

    public void enterDestination(String destination) {
        type(searchBoxLocator, destination);
    }

    public void clickSearchButton() {
        clickThis(searchButtonLocator);
    }

    public void selectDestFromAutoSuggestions(String userWantsToSelectThis) {
       sleep(2000);
        selectFromAutoSuggestion(autoSuggestionsLocator, userWantsToSelectThis);
    }

    public void selectFromChildrenDropDown(String children) {
        selectFromDropdownByVisibleText(childrenDropDownLocator, children);
    }

    public boolean verifyDropdowns(int childrenCount){
        List<WebElement> dropdowns=findElementsUsingFluentWait(dropdownsLocator);
        boolean message=(childrenCount==dropdowns.size());
        return message;
    }
}