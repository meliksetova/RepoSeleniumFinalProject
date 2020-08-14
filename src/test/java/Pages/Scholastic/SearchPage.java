package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {
    By starLocator=By.xpath("(//i[@class='icon-a fa-tcool-star tooltipstered'])[1]");
    By starDisplayedLocator=By.xpath("//i[@class='icon-a fa-tcool-star tooltipstered active']");
    By listLocator=By.xpath("//span[contains(text(),'My Lists')]");
    By recommendationList=By.xpath("//li[@class='recommend']");

    public void clickStar(){
        clickThis(starLocator);
    }

    public boolean verifyStarIsDisplayed(){
        boolean displayedStar=findElementUsingFluentWait(starDisplayedLocator).isDisplayed();
        return displayedStar;
    }

    public boolean verifyItemInList(){
        clickThis(listLocator);
        boolean contains=getTextFromElement(recommendationList).contains("1 item");
        clickThis(recommendationList);
        return contains;
    }

    }


