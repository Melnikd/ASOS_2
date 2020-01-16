package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class FemalePage extends BasePage {

    @FindBy(xpath = "//a[@class='TO7hyVB _3B0kHbC _3AH1eDT']")
    private WebElement fieldMens;

    public FemalePage(){
        super();
    }


    public FemalePage(String url){
        super(url);
    }

    public static FemalePage openFemalePage(){
        return new FemalePage("https://www.asos.com/us/women/");
    }

    public static FemalePage initFemalePage() {
        return new FemalePage();
    }

    public MalePage clickFieldMale(){
        fieldMens.click();
        return MalePage.initMalePage();
    }
}
