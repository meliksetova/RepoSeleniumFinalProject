package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyListsPage extends BasePage {
    By bookNamesLocator= By.xpath("//td[@class='item-details']");


    public boolean verifyBookOnList(String name){
        boolean bookOnList=false;
        for(WebElement book :findElementsUsingFluentWait(bookNamesLocator)){
            if (book.getText().contains(name)){
                bookOnList=true;
             break;
            }
        }
        return bookOnList;
    }


}
