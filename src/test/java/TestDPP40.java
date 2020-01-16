import org.testng.annotations.Test;
import pages.ASOSpages.FemalePage;

import static org.testng.Assert.assertTrue;

public class TestDPP40 extends BaseTest {
    @Test
    public void goToMalePage(){

        assertTrue(FemalePage.openFemalePage().clickFieldMale().findElementPageTitleMen(),"Test pas");
    }


}
