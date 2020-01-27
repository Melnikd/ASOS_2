package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ResetPasswordPage extends BasePage {

    @FindBy(xpath = "/input[@id='Email']")
    private WebElement fieldEmailForReset;

    @FindBy(xpath = "/p[text()='Type in your email address below and we'll send you an email with instructions on how to create a new password']")
    private WebElement fieldTextMessage;

    public ResetPasswordPage (){
        super();
    }

    public static ResetPasswordPage initResetPasswordPage(){
        return new ResetPasswordPage();
    }

    public static ResetPasswordPage openResetPasswordPage(){
        return SignInPage.openSignInPage().clickFieldForgotPassword() ;
    }

    public boolean isItResetPage(){
        return (fieldEmailForReset.isEnabled() && fieldTextMessage.isDisplayed());
    }

}
