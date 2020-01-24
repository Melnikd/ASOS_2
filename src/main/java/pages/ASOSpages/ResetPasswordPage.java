package pages.ASOSpages;

import pages.BasePage;

public class ResetPasswordPage extends BasePage {

    public ResetPasswordPage (){
        super();
    }

    public ResetPasswordPage initResetPasswordPage(){
        return new ResetPasswordPage();
    }

    public ResetPasswordPage openResetPasswordPage(){
        return  FemalePage.openFemalePage().clickFieldSignIn().clickFieldForgotPassword();
    }

}
