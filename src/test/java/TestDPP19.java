import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ASOSpages.ResetPasswordPage;


import static org.testng.Assert.assertTrue;

public class TestDPP19 extends BaseTest {

    @Test
    public void resetPasswordEnable(){

        assertTrue(ResetPasswordPage.openResetPasswordPage().isItResetPage(), "S");
    }
}
