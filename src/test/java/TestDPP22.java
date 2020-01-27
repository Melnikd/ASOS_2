import org.testng.annotations.Test;
import pages.ASOSpages.FemalePage;

import static org.testng.Assert.assertTrue;

public class TestDPP22 extends BaseTest {
    @Test
    public void cartIconIsDisplayed(){

        assertTrue(FemalePage.openFemalePage().findFieldCart());
    }
}
