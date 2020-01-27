package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@id='EmailAddress']")
    private WebElement fieldEmailAddress;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@id='signin']")
    private WebElement buttonSignIn;

    @FindBy(xpath = "//a[@class='qa-forgot-password adobeTrackedButton' and text()='Forgot password?']")
    private WebElement fieldForgotPassword;

    public SignInPage(){
        super();
    }

    private SignInPage (String url){
        super(url);
    }

    public static SignInPage initSignInPage(){
        return new SignInPage();
    }

    public static SignInPage openSignInPage(){
        return FemalePage.openFemalePage().clickFieldSignIn();
    }

    public SignInPage inputFieldEmailAddress(String email){
        fieldEmailAddress.sendKeys(email);
        return this;
    }
    public String getEmailAddress(){
       return fieldEmailAddress.getAttribute("value");
    }
    public SignInPage inputFieldPassword(String password){
        fieldPassword.sendKeys(password);
        return this;
    }

    public String getPasswordValue(){
        return fieldPassword.getAttribute("value");
    }

    public AccountPage clickButtonSignIn(){
        buttonSignIn.click();
        return AccountPage.initAccountPage();
    }

    public boolean isThisAccountPage(){
        AccountPage accountPage = new AccountPage();
       return clickButtonSignIn().equals(accountPage);
    }

    public ResetPasswordPage clickFieldForgotPassword(){
        fieldForgotPassword.click();
        return ResetPasswordPage.initResetPasswordPage();
    }

}




