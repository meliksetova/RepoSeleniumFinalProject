package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage {
    By starsLocator=By.xpath("//label[contains(@id,'f-label-star-rating')]");
    By ratingLocator=By.xpath("//span[contains(@class,'star-rating-text')]");
    By messageLocator=By.xpath("//div[@class='info unavailable-info']");
    By distanceLocator=By.xpath("//a[@data-menu='sort-submenu-distance']");
    By distanceOptLocator=By.xpath("//a[@data-option-id='opt_DISTANCE_FROM_LANDMARK_ID']");
    By popFilterLocator=By.xpath("//label[contains(@for,'f-popular')]");
    By poolLocator=By.xpath("//label[@id='f-label-popular-128']");
    By messageDistLocator= By.xpath("//ul[@class='property-landmarks']//child::li[contains(text(),'LGA')]");
    By hotelNameLocator=By.xpath("//a[@class='property-name-link']");


    public void selectStars(String star){
        sleep(2000);
        List<WebElement> stars=findElementsUsingFluentWait(starsLocator);
        for (WebElement starTest:stars){
            if(starTest.getText().startsWith(star)){
                clickThis(starTest);
                break;
            }
        }
    }

    public void VerifySearchIsDone(){
        sleep(4000);
        do {
            scrollToBottom();
            scrollbyPixel(-300);
            sleep(4000);
        } while (findElementsUsingFluentWait(messageLocator).size()==0);
    }

    public boolean verifyStars(String star){
        sleep(4000);
        ArrayList<String> ratings= getTextsFromWebElements(ratingLocator);
        boolean message=true;
        for (String rating:ratings){
            if (!rating.startsWith(star)){
                message=false;
                break;
            }
        }
        return message;
    }


    public void selectDistance(String distance){
        clickThis(distanceLocator);
        sleep(2000);
        List<WebElement> distOpt=findElementsUsingFluentWait(distanceOptLocator);
        for (WebElement dist:distOpt){
            if(dist.getText().contains(distance)){
                clickThis(dist);
                sleep(2000);
                break;

            }
        }
    }

    public void selectFilter(String filter){
        sleep(2000);
        List<WebElement> filters=findElementsUsingFluentWait(popFilterLocator);
        for (WebElement filter2:filters){
            if(filter2.getText().equalsIgnoreCase(filter) || filter2.getText().contains(filter)){
                clickThis(filter2);
                sleep(2000);
                break;
            }
        }
    }

    public boolean verifyMiles(int mile) {
        sleep(4000);
        ArrayList<String> distances = getTextsFromWebElements(messageDistLocator);
        boolean miles = true;
        for (String distance : distances) {
            double number = Double.valueOf(distance.substring(0, distance.indexOf(" ")));
            if (number > mile) {
                miles = false;
                break;
            }
        }
        return miles;
    }

    public boolean verifyName (String name){
            sleep(4000);
            ArrayList<String> names = getTextsFromWebElements(hotelNameLocator);
            boolean message = false;
            for (String name2 : names) {
                if (!name2.contains(name)) {
                    message = true;
                    break;
                }
            }
            return message;
        }

    }



