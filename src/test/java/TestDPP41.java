import org.testng.annotations.Test;
import pages.ASOSpages.MalePage;

import static org.testng.Assert.assertTrue;

public class TestDPP41 {
    @Test
    public void goToFemalePage(){
        assertTrue(MalePage.openMalePage().clickFieldFemale().isItFemalePageLocatorFind(), "Test pas");
    }
}
