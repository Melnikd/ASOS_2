package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class FemalePage extends BasePage {

    @FindBy(xpath = "//a[@class='TO7hyVB _3B0kHbC _3AH1eDT']")
    private WebElement fieldMale;

    @FindBy(xpath = "//a[@class='_24SZgSx _6DZZlcW']") //"//a[@class='_24SZgSx _6DZZlcW and @href='https://www.asos.com/us/men']
    private WebElement isItFemalePageLocator;

    @FindBy(xpath = "//span[@type='accountUnfilled']")
    private WebElement fieldAccount;

   // <span type="accountUnfilled" class="_3iH_8F6 -rhP1cz gBrrjX4 _2nHArcS"></span>
    @FindBy(xpath = "//a[@data-testid='signin-link']")
    private WebElement fieldSignIn;
  //  <a class="_1336dMe _1uUU2Co _1336dMe _1uUU2Co" href="https://my.asos.com/my-account?lang=en-US&amp;store=US&amp;country=US&amp;keyStoreDataversion=jqvkhhb-21"
 //   data-testid="signin-link" tabindex="-1">Sign In</a>


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
        fieldMale.click();
        return MalePage.initMalePage();
    }

    public boolean isItFemalePageLocatorFind(){
      return isItFemalePageLocator.isDisplayed();
    }

    public FemalePage clickFieldAccount(){
      fieldAccount.click();
      return this;
    }

    public SignInPage clickFieldSignIn(){
      fieldAccount.click();
      fieldSignIn.click();
      return SignInPage.initSignInPage();
    }

}
