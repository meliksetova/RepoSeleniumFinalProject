package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Profile extends BasePage {
By addCardLocator=By.xpath("//a[@class='reading-club add-creditcardtoaccount']");
By newCardNumberLocator=By.xpath("//input[contains(@id,'paymentinstruments_creditcards_newcreditcard_number')]");
By expDateMonthDropdown=By.xpath("//div[contains(text(),'Month')]");
By monthsLocator=By.xpath("//div[@id='scrollbar-1']//ancestor::li");
By expYearDropdown=By.xpath("//div[contains(text(),'Year')]");
By yearsLocator=By.xpath("//div[@id='scrollbar-2']//ancestor::li");
By securityCode=By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_cvn");
By firstNameLocator=By.id("dwfrm_paymentinstruments_creditcards_address_firstname");
By lastNameLocator=By.id("dwfrm_paymentinstruments_creditcards_address_lastname");
By AddressLocator=By.id("dwfrm_paymentinstruments_creditcards_address_address1");
By zipLocator=By.id("dwfrm_paymentinstruments_creditcards_address_postal");
By phoneNumberLocator=By.id("dwfrm_paymentinstruments_creditcards_address_phone");
By saveButtonLocator=By.id("applyBtn");
By editButton=By.xpath("//div[@class='name-section']//a[@class='reading-club'][contains(text(),'Edit')]");
By updateFirstName=By.id("dwfrm_profile_customer_firstname");
By updateLastName=By.id("dwfrm_profile_customer_lastname");
By saveUpdates=By.xpath("//button[@name='dwfrm_profile_save']");
By accountName=By.xpath("//div[@class='name-section']//h3[text()='Email']//preceding-sibling::div[@class='text-blk']");
By accountProfileName=By.xpath("//span[@class='user-data']");
By cardNamesLocator=By.xpath("//span[@class='text']");



public void newCard(String cardNumber){
    sleep(4000);
    clickThis(addCardLocator);
    type(newCardNumberLocator,cardNumber);
    dropdownWithClicks(expDateMonthDropdown,monthsLocator,"05");
    dropdownWithClicks(expYearDropdown,yearsLocator,"2022");
    type(securityCode,"234");
    sleep(2000);
    type(firstNameLocator,"karina");
    type(lastNameLocator,"melik");
    type(AddressLocator,"avenue n");
    type(zipLocator,"11230");
    type(phoneNumberLocator,"3476009837");
    clickThis(saveButtonLocator);
}


public void updateLastName(String firstName, String lastName){
    clickThis(editButton);
    clearField(updateFirstName);
    type(updateFirstName,firstName);
    clearField(updateLastName);
    type(updateLastName,lastName);
    clickThis(saveUpdates);
}

public boolean verifyNameUpdatesInAccount(String lastName, String firstName){
    boolean verify=getTextFromElement(accountName).contains(lastName) && getTextFromElement(accountName).contains(firstName);
    return verify;
}

public boolean verifyNameUpdatesInPageHeader(String lastName){
    boolean verify=getTextFromElement(accountProfileName).contains(lastName);
    return verify;
}

public boolean verifyCreditCardInAccount(String cardEnding){
    boolean cardIn=false;
        for (String cardNumber:getTextsFromWebElements(cardNamesLocator)){
            if (cardNumber.contains(cardEnding)){
                cardIn=true;
                break;
            }
        }
   return cardIn;
}

}
