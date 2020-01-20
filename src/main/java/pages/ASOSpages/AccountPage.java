package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AccountPage extends BasePage {




    public AccountPage(){
        super();
    }
    public AccountPage(String url){
        super(url);
    }

    public static AccountPage openAccountPage(){
        return new AccountPage("https://my.asos.com/my-account?country=US&keyStoreDataversion=jqvkhhb-21&lang=en-US&nlid=nav%20header&store=US");
    }
    public static AccountPage initAccountPage(){
        return new AccountPage();
    }
}

