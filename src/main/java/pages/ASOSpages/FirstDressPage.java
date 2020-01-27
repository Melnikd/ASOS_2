package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class FirstDressPage extends BasePage {
    @FindBy(xpath = "//select[@id='main-size-select-0']")
    private WebElement fieldSelectSize;

    @FindBy(xpath = "//span[@data-bind='text: buttonText']")
    private WebElement buttonAddItemToCart;
    //<span data-bind="text: buttonText">Add to cart</span>
    @FindBy(xpath = "//a[@href='https://www.asos.com/us/bag?ctaref=mini%20bag']")
    private WebElement buttonViewCart;
//<a data-test-id="bag-link" tabindex="-1" class="_1TlOB9h _2tvh469 _12h15d-"
//    href="https://www.asos.com/us/bag?ctaref=mini%20bag" type="button"><span class="_1M-cSy1">View Cart</span></a>
    public FirstDressPage(){
        super();
    }
    public static FirstDressPage initFirstDressPage(){
        return new FirstDressPage();
    }
    public FirstDressPage openFirstDressPage(){
        return DressesPage.openDressesPage().clickFirstDressField();
    }

    public FirstDressPage setSize(String value){
        fieldSelectSize.sendKeys(value);
        return this;
    }
    public FirstDressPage addItemToCart(){
        buttonAddItemToCart.click();
        return this;
    }
    public void clickButtonViewCart(){
        buttonViewCart.click();
    }

}
