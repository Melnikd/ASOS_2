import org.testng.annotations.Test;
import pages.ASOSpages.AccountPage;
import pages.ASOSpages.FemalePage;
import pages.ASOSpages.SignInPage;

import static org.testng.Assert.assertTrue;

public class TestDPP16 extends BaseTest {
    @Test
    public void signInToAccount(){

        assertTrue(FemalePage.openFemalePage().clickFieldAccount().clickFieldSignIn().inputFieldEmailAddress().inputFieldPassword().isThisAccountPage(),"Test pas");
    }
}
