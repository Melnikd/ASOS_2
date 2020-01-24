import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ASOSpages.AccountPage;
import pages.ASOSpages.FemalePage;
import pages.ASOSpages.SignInPage;

import static org.testng.Assert.assertTrue;

public class TestDPP16 extends BaseTest {
    @Test
    public void signInToAccount(){

        SoftAssert softAssert = new SoftAssert();
        String email = "diana.melnyk@nure.ua";
        String password = "1234567890";
        SignInPage signInPage;
        signInPage = SignInPage.openSignInPage();

        signInPage.inputFieldEmailAddress(email);
        String emailValue= signInPage.getEmailAddress();
        softAssert.assertEquals(emailValue,email,"emailValue and email do not match");

        signInPage.inputFieldPassword(password);
        String passwordValue = signInPage.getPasswordValue();
        softAssert.assertEquals(passwordValue,password,"passwordValue and password do not match");

        signInPage.clickButtonSignIn();

        softAssert.assertAll();


    }
}
