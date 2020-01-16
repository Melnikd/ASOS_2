package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MalePage extends BasePage {
    @FindBy(xpath = "//a[@data-testid='men-floor']")
    private WebElement pageTitleMen;

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

}
