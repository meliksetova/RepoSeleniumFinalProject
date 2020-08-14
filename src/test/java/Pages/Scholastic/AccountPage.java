package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {
    By enterOrders=By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[@id='enter-orders']");
    By yourTeacherOrder=By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[contains(text(),'Your Teacher Order')]");
    By myAccountLocator=By.xpath("//span[@class='hide-mobile user-account-name']");
    By profileLocator=By.xpath("//a[@class='null'][contains(text(),'Profile')]");
    By notificationClose=By.xpath("//span[@class='notification-close']");
    By searchBox=By.xpath("//input[@id='q']");
    By searchButtonLocator=By.xpath("//form[@name='simpleSearch']//fieldset//button");


    public void closeNotification() {
        sleep(4000);
        if (findElementUsingFluentWait(notificationClose).isDisplayed()) {
            clickThis(notificationClose);
        }
    }

    public void selectTeacherOrder(){
        clickThis(enterOrders);
        clickThis(yourTeacherOrder);
    }

    public void goToMyAccount(){
        dropdownWithClicks(myAccountLocator,profileLocator,"Profile");
    }

    public void search(String name){
        type(searchBox,name);
        clickThis(searchButtonLocator);
    }

}
