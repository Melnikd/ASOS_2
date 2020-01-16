package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MalePage extends BasePage {

    @FindBy(xpath = "//div[@data-pagetitle='Men']")
    private WebElement pageTitleMen;

    public MalePage() {
        super("https://www.asos.com/us/men/");
    }

    public static MalePage openMalePage(){
        return new MalePage();
    }

    public boolean findElementPageTitleMen(){
        return  pageTitleMen.isDisplayed();

    }
}

