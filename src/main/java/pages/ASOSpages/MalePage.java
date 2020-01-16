package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MalePage extends BasePage {
    @FindBy(xpath = "//a[@class='_24SZgSx _6DZZlcW'")//"//a[@class='_24SZgSx _6DZZlcW and @href='https://www.asos.com/us/men/']]"
    private WebElement pageTitleMen;//a[@data-testid='men-floor'

    @FindBy(xpath = "//a[@class='TO7hyVB _3B0kHbC _3AH1eDT']")
    private WebElement fieldFemale;

    public MalePage() {
        super();
    }

    public MalePage(String url) {
        super(url);
    }

    public static MalePage openMalePage() {
        return new MalePage("https://www.asos.com/us/men/");
    }

    public static MalePage initMalePage() {
        return new MalePage();
    }

    public boolean findElementPageTitleMen() {
        return pageTitleMen.isDisplayed();
    }

    public FemalePage clickFieldFemale(){
        fieldFemale.click();
        return FemalePage.initFemalePage();
    }

}
