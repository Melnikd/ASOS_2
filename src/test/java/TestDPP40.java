import org.testng.annotations.Test;
import pages.ASOSpages.FemalePage;

import static org.testng.Assert.assertTrue;

public class TestDPP40 extends BaseTest {
    @Test
    public void goToPageMans(){

        assertTrue(FemalePage.openPageFemale().clickFieldMale().findElementPageTitleMen(),"Test pas");
    }


}
