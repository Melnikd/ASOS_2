package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DressesPage extends BasePage {
    @FindBy(xpath = "//img[@alt='ASOS DESIGN plisse maxi dress in green floral ditsy print']")
    private WebElement firstDress;

    public DressesPage(){
        super();
    }
    public DressesPage initDressesPage(){
        return new DressesPage();
    }

    public static DressesPage openDressesPage(){
        return FemalePage.openFemalePage().clickDresses();
    }

    public FirstDressPage clickFirstDressField(){
        firstDress.click();
       return FirstDressPage.initFirstDressPage();
    }
}
