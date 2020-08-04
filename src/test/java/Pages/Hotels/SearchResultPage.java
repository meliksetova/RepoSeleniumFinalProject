package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage {
    By fiveStarSelection=By.xpath("//input[@id='f-star-rating-5']");
    By fourStarSelection=By.xpath("//input[@id='f-star-rating-4']");
    By threeStarSelection=By.xpath("//input[@id='f-star-rating-3']");
    By twoStarSelection=By.xpath("//input[@id='f-star-rating-2']");
    By oneStarSelection=By.xpath("//input[@id='f-star-rating-1']");
    By ratingLocator=By.xpath("//span[contains(@class,'star-rating-text')]");
    By messageLocator=By.xpath("//div[@class='info unavailable-info']");
    By distanceLocator=By.xpath("//a[@data-menu='sort-submenu-distance']");
    By LGALocator=By.xpath("//a[contains(text(),'LaGuardia Airport (LGA)')]");
    By poolLocator=By.xpath("//label[@id='f-label-popular-128']");
    By messageDistLocator= By.xpath("//ul[@class='property-landmarks']//child::li[contains(text(),'LGA')]");
    By hotelNameLocator=By.xpath("//a[@class='property-name-link']");

    public void selectStars(String star){
        sleep(2000);
        switch (star){
            case "5":
                clickThis(fiveStarSelection);
                break;
            case "4":
                clickThis(fourStarSelection);
                break;
            case "3":
                clickThis(threeStarSelection);
                break;
            case "2":
                clickThis(twoStarSelection);
                break;
            case "1":
                clickThis(oneStarSelection);
                break;
            default:
                System.out.println("Wrong Input");
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


    public void selectLGA(){
        clickThis(distanceLocator);
        sleep(2000);
        clickThis(LGALocator);
    }

    public void selectPool(){
        clickThis(poolLocator);
    }


    public boolean verifyMiles(){
        sleep(4000);
        ArrayList<String> distances=getTextsFromWebElements(messageDistLocator);
        boolean miles=true;
        for (String distance:distances){
            double number=Double.valueOf(distance.substring(0,distance.indexOf(" ")));
            if (number>20){
                miles=false;
                break;
            }
            } return miles;
        }

    public boolean verifyName(String name){
        sleep(4000);
        ArrayList<String> names= getTextsFromWebElements(hotelNameLocator);
        boolean message=false;
        for (String name2:names){
            if (!name2.contains(name)){
                message=true;
                break;
            }
        }
        return message;
    }

    }



