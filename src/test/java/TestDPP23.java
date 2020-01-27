import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.ASOSpages.DressesPage;

public class TestDPP23 extends BaseTest {
    @Test
    public void selectProductToCart(){
        DressesPage dressesPage = new DressesPage().openDressesPage();
        dressesPage.clickFirstDressField().setSize("US 6").addItemToCart().clickButtonViewCart();
    }
}
