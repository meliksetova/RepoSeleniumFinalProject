package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Checkout extends BasePage {
    By continueCheckout= By.xpath("//button[@id='btn-continue-checkout']//span[contains(text(),'Continue Checkout')]");
    By selectPaymentOption=By.xpath("//div[@class='selected-option']");
    By purchaseOrder=By.xpath("//li[@class='custom-option PO']//span[contains(text(),'Purchase Order')]");
    By orderNumber=By.id("dwfrm_billing_paymentMethods_po_ponumber");
    By continueCheckoutBilling=By.id("billingContinueButton");
    By submitOrder=By.xpath("//div[@class='row enter-order-info']//div[@class='order-summary-footer']//div[@class='form-row']//button[@type='submit']");
    By message=By.xpath("//div[@class='col order-instruction']//child::h2");

    public void submitCheckout(){
        clickThis(continueCheckout);
        clickThis(selectPaymentOption);
        sleep(2000);
        clickThis(purchaseOrder);
        sleep(2000);
        type(orderNumber,"3452727");
        clickThis(continueCheckoutBilling);
        clickThis(submitOrder);
    }

    public boolean VerifyOrder(){
        boolean text=getTextFromElement(findElementUsingFluentWait(message)).contains("Thank You for Your Order");
        return text;
    }


}
