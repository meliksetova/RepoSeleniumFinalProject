package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {
    By enterOrders=By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[@id='enter-orders']");
    By yourTeacherOrder=By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[contains(text(),'Your Teacher Order')]");



    public void selectTeacherOrder(){
        sleep(2000);
        clickThis(enterOrders);
        clickThis(yourTeacherOrder);
    }



}
