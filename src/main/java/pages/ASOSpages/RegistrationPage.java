package pages.ASOSpages;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.*;
import java.text.*;

import java.util.SplittableRandom;


public class RegistrationPage extends BasePage {


    @FindBy(xpath = "//input[@id='Email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement fieldFirstName;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement fieldLastName;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//select[@id='BirthDay']")
    private WebElement fieldBirthDay;

    @FindBy(xpath = "//select[@id='BirthMonth']")
    private WebElement fieldBirthMonth;

    @FindBy(xpath = "//select[@id='BirthYear']")
    private WebElement fieldBirthYear;

    @FindBy(xpath = "//button[@class='reveal hidden qa-reveal']")
    private WebElement buttonShow;

    @FindBy(xpath = "//input[@id='register']")
    private WebElement buttonSubmit;

    public RegistrationPage() {
        super();
    }

    public RegistrationPage(String url) {
        super(url);
    }

    public static RegistrationPage openRegistrationPage() {
        return new RegistrationPage("https://my.asos.com/identity/register?lang=en-US&store=US&country=US&keyStoreDataversion=jqvkhhb-21&returnUrl=https%3A%2F%2Fwww.asos.com%2Fus%2Fmen%2F");
    }

    public static RegistrationPage initRegistrationPage() {
        return new RegistrationPage();
    }

    public RegistrationPage fieldEmailFillIn(String value) {
        fieldEmail.sendKeys(value);
        return this;
    }

    public RegistrationPage fieldFirstNameFillIn(String value) {
        fieldFirstName.sendKeys(value);
        return this;
    }

    public RegistrationPage fieldLastNameFieldIn(String value) {
        fieldLastName.sendKeys(value);
        return this;
    }

    public RegistrationPage fieldPasswordFullIn(String value) {
        fieldPassword.sendKeys(value);
        return this;
    }

    public String getPasswordValue() {
        return fieldPassword.getAttribute("value");
    }

    public String getEmailValue() {
        return fieldEmail.getAttribute("value");
    }

    public String getFirstNameValue() {
        return fieldFirstName.getAttribute("value");
    }

    public String getLastNameValue() {
        return fieldLastName.getAttribute("value");
    }

    public RegistrationPage fieldBirthDaySetValue(String value) {
        fieldBirthDay.sendKeys(value);
        return this;
    }

    public String getBirthDayValue() {
        return fieldBirthDay.getAttribute("value");
    }

    public RegistrationPage fieldBirthMonthSetValue(String value) {
        fieldBirthMonth.sendKeys(value);
        return this;
    }

    public String getBirthMonthValue() {
        String number = fieldBirthMonth.getAttribute("value");
        GregorianCalendar date = new GregorianCalendar();
        date.set(Calendar.MONTH, Integer.parseInt(number) - 1);
        DateFormat fmt = DateFormat.getDateInstance(DateFormat.FULL);
        String str = fmt.format(date.getTime());
        StringTokenizer stz = new StringTokenizer(str, " ");
        stz.nextToken();
        str = stz.nextToken();
        return str;
    }

    public RegistrationPage setFieldBirthYear(String value) {
        fieldBirthYear.sendKeys(value);
        return this;
    }

    public String getBirthYear() {
        return fieldBirthYear.getAttribute("value");
    }

   /* public boolean isRegistrationFirst4FieldFullIn() {
        try {
//            RegistrationPage.openRegistrationPage()
//                    .fieldEmailFillIn()
//                    .fieldFirstNameFillIn()
//                    .fieldLastNameFieldIn()
//                    .fieldPasswordFullIn();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }


*/


}
