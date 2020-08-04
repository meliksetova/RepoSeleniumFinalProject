package Pages.Darksky;

import Pages.BasePage;
import Utils.DateHelper;
import Utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LandingPage extends BasePage {
   By hourlocator=By.xpath("//span[@class='hour']");


   public Boolean verifyInterval(int interval, int size) {
       List<WebElement> hours = findElementsUsingFluentWait(hourlocator);
       ArrayList<String> hours2 = new ArrayList<>();
       boolean verify;
       for (WebElement hour : hours) {
           hours2.add(getTextFromElement(hour));
       }
       hours2.removeAll(Arrays.asList("", null));
       if (size == (hours2.size()+1)) {
           ArrayList<String> hours3 = DateHelper.createArrayFromXTimeFromNow(interval, size);
           verify = Helper.compareTwoArrays(hours2, hours3);
       } else verify=false;
       return verify;
   }

}
