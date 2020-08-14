package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {
    By createAccount = By.xpath("//div[@class='menu-nav']/ul/li[2]/a[1]");
    By TeacherRadioButton = By.xpath("//label[@for='acccountTeacther']");
    By nextLocator = By.id("linkChooseAcount");
    By titleLocator = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By mrsLocator = By.xpath("//span[text()='Mrs.']");
    By firstNameLocator = By.id("dwfrm_profile_customer_firstname");
    By lastNameLocator = By.id("dwfrm_profile_customer_lastname");
    By emailLocator = By.id("dwfrm_profile_customer_email");
    By passwordLocator = By.id("dwfrm_profile_login_password");
    By acceptTermsLocator = By.id("dwfrm_registration_termsofuseteacher");
    By nextButton = By.xpath("//button[@name='dwfrm_profile_confirm']");
    By zipcodeButton = By.id("dwfrm_myschool_schoolzip");
    By searchButton = By.xpath("//div[@class='findschool-byzip']//button[@id='button-search']");
    By schoolName = By.id("dwfrm_searchschool_schoolvalue");
    By TtofNYC = By.xpath("//ul[contains(@id,'ui-id')]");
    By mySchoolsnext = By.xpath("//button[@name='dwfrm_searchschool_findnext']");
    By myRoleDropDown = By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By myRoleTeacherByGrade = By.xpath("//span[contains(text(),'Teacher (by Grade)')]");
    By myRoleGrade = By.xpath("//div[@class='selected-option input-select noscroll']");
    By myRoleMultiGrade = By.xpath("//span[contains(text(),'Multi-Grade')]");
    By RoleGetNextButton = By.xpath("//button[@name='dwfrm_myrole_findgrade']");
    By RolePreschool = By.id("dwfrm_multigrade_preschool");
    By RolePreK = By.id("dwfrm_multigrade_prekinder");
    By roleClassesNext = By.xpath("//button[@name='dwfrm_multigrade_nextstep']");
    By AlmostThereSelectType = By.xpath("//div[@class='selected-option input-select required']");
    By AlmostThereNA = By.xpath("//span[contains(text(),'NA')]");
    By YesButton = By.id("dwfrm_profileselection_teaching__firstyear-0");
    By BookClub =By.id("dwfrm_profileselection_readingclub-1");
    By message=By.xpath("//div[@class='confirm-msg']");
    By signInLocator=By.xpath("//a[@class='signin']");
    By emailSighInLocator=By.xpath("//div[contains(@class,'login-box-content returning-customers clearfix')]//input[@id='dwfrm_login_username']");
    By passwordSighInLocator=By.xpath("//div[contains(@class,'form-row row-password-input required')]//input[@id='dwfrm_login_password']");
    By signInButton=By.xpath("//div[@id='dialog-container']//button[1]");

    public void createAccount() {
        clickThis(createAccount);
    }

    public void clickTeacherRadioButton() {
        sleep(2000);
        if (!findElementUsingFluentWait(TeacherRadioButton).isSelected()) {
            clickThis(TeacherRadioButton);
        }
        clickThis(nextLocator);
    }


    public void Form(){
        clickThis(titleLocator);
        sleep(2000);
        clickThis(mrsLocator);
        type(firstNameLocator,"karina");
        type(lastNameLocator,"mel");
        type(emailLocator,"test71@gmail.com");
        type(passwordLocator,"asdfg12345");
        clickThis(acceptTermsLocator);
        clickThis(nextButton);
        type(zipcodeButton,"10001");
        clickThis(searchButton);
        type(schoolName,"Tt of");
        sleep(2000);
        clickThis(TtofNYC);
        clickThis(mySchoolsnext);
        clickThis(myRoleDropDown);
        clickThis(myRoleTeacherByGrade);
        sleep(2000);
        clickThis(myRoleGrade);
        clickThis(myRoleMultiGrade);
        clickThis(RoleGetNextButton);
        type(RolePreschool,"10");
        type(RolePreK,"10");
        clickThis(roleClassesNext);
        clickThis(AlmostThereSelectType);
        clickThis(AlmostThereNA);
        clickThis(YesButton);
        clickThis(BookClub);
}

        public boolean verifyAccountMessage(){
        boolean mes=getTextFromElement(message).contains("Thank you for creating an account");
        return mes;
        }

        public void login(){
        clickThis(signInLocator);
        type(emailSighInLocator,"test65@gmail.com");
        type(passwordSighInLocator,"asdfg12345");
        clickThis(signInButton);
        }



}
