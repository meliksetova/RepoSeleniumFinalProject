package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Cart extends BasePage {
    By submitOrder= By.id("dwfrm_cart_checkoutCart");
    By secondSubmitOrder=By.xpath("//div[@class='modal-content-TCI']//button[@name='dwfrm_cart_checkoutCart'][contains(text(),'Proceed to Checkout')]");


    public void goToCheckout(){
        clickThis(submitOrder);
        clickThis(secondSubmitOrder);
    }

}
