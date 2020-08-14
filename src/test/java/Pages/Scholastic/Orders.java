package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Orders extends BasePage {
    By flyerLocator= By.xpath("//ul[@class='hidden-xs']//span[contains(text(),'By Flyer')]");
    By kinderGarden=By.xpath("//a[contains(text(),'Kindergarteners')]");
    By itemsNumberLocator=By.xpath("//td[@class=' itemNum details-control']");
    By quantityLocator=By.xpath("//input[@class='itm-qty-usd input-qty numericenteronly']");
    By reviewButton=By.xpath("//button[@class='secondary']");
    By jumperLocator=By.xpath("//div[@class='info-modal-hd']");
    By bonusQuantityLocator=By.xpath("//input[@class='itm-qty-pts input-qty numericenteronly']");


    public void SelectFlyers(){
        if(!findElementUsingFluentWait(flyerLocator).isEnabled()){
            clickThis(flyerLocator);
        }
    }

    public void selectItems(String item, String quantity){
        clickThis(kinderGarden);
        sleep(2000);
        List<String> ItemNumbers=getTextsFromWebElements(itemsNumberLocator);
        List<WebElement> quantities=findElementsUsingFluentWait(quantityLocator);
        int num=ItemNumbers.indexOf(item);
        quantities.get(num).sendKeys(quantity);
    }

    public void clickOnReviewCart(){
        clickThis(reviewButton);
    }

    public void clickOnPriceQty(int number){
        List<WebElement> quantities=findElementsUsingFluentWait(quantityLocator);
        clickThis(quantities.get(number));
        System.out.println(number);
        sleep(10000);
    }

    public boolean verifyJumper(){
        boolean displayed=findElementUsingFluentWait(jumperLocator).isDisplayed();
        System.out.println(displayed);
        return displayed;
    }

    public void clickOnBonusQty(int number){
        List<WebElement> quantities=findElementsUsingFluentWait(bonusQuantityLocator);
        clickThis(quantities.get(number));
        System.out.println(number);
        sleep(2000);
    }

}
