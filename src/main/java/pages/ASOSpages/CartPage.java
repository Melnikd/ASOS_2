package pages.ASOSpages;

import pages.BasePage;

public class CartPage extends BasePage {
    public CartPage(){
        super();
    }
    public static CartPage initCartPage(){
        return new CartPage();
    }
    public static CartPage openCartPage(){
        return FirstDressPage.initFirstDressPage().clickButtonViewCart();
    }
}
