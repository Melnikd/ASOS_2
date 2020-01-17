package pages.ASOSpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RegistrationPage extends BasePage {


    @FindBy(xpath = "//input[@id='Email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement fieldFirstName;

    @FindBy(xpath = "//input[@id='LastName']")
    private  WebElement fieldLastName;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//select[@id='BirthDay']")
    private  WebElement fieldBirthDay;

    @FindBy(xpath = "//select[@id='BirthMonth']")
    private  WebElement fieldBirthMonth;

    @FindBy(xpath = "//select[@id='BirthYear']")
    private WebElement fieldBirthYear;


    public RegistrationPage(){
        super();
    }

    public  RegistrationPage(String url){
        super(url);
    }

    public  static  RegistrationPage openRegistrationPage(){
        return  new RegistrationPage("https://my.asos.com/identity/register?lang=en-US&store=US&country=US&keyStoreDataversion=jqvkhhb-21&returnUrl=https%3A%2F%2Fwww.asos.com%2Fus%2Fmen%2F");
    }

    public  RegistrationPage initRegistrationPage(){
        return new RegistrationPage();
    }

    public RegistrationPage fieldEmailFillIn(){
        fieldEmail.sendKeys("email@email.com");
        return this;
    }

    public RegistrationPage fieldFirstNameFillIn(){
        fieldFirstName.sendKeys("Name");
        return this;
    }

    public RegistrationPage fieldLastNameFieldIn(){
        fieldLastName.sendKeys("Last");
        return this;
    }

    public RegistrationPage fieldPasswordFullIn(){
        fieldPassword.sendKeys("12345678");
        return this;
    }

    public boolean fieldBirthDayIsClick(){
        return  fieldBirthDay.isEnabled();
    }

    public boolean fieldBirthMonthIsClick(){
        return fieldBirthMonth.isEnabled();
    }

    public boolean fieldBirthYearIsClick(){
        return fieldBirthYear.isEnabled();
    }

    public boolean isRegistrationFirst4FieldFullIn(){
        try {
            RegistrationPage.openRegistrationPage()
                    .fieldEmailFillIn().
                    fieldFirstNameFillIn()
                    .fieldLastNameFieldIn()
                    .fieldPasswordFullIn();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }






}
