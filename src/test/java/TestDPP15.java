import org.testng.annotations.Test;
import pages.ASOSpages.RegistrationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestDPP15 extends BaseTest {

    @Test
    public void registrationFormEmailIsFullIn(){

        String expectedValueForEmail = "diana.melnyk@nure.ua";
        RegistrationPage registrationPage =RegistrationPage.openRegistrationPage();

        registrationPage.fieldEmailFillIn(expectedValueForEmail);
        String emailValue = registrationPage.getEmailValue();

        assertEquals(emailValue , expectedValueForEmail, " Email value and expectedValueForEmail do not match" );
    }

    @Test
    public void registrationFormFirstNameIsFullIn(){
        String expectedValueForFirstName = "Diana";
        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.fieldFirstNameFillIn(expectedValueForFirstName);
        String firstName = registrationPage.getFirstNameValue();

        assertEquals(firstName, expectedValueForFirstName,"First name value and expectedValueForFirstName do not match");
    }

    @Test
    public void registrationFormLastNameIsFullIn(){
        String expectedValueForLastName = "Hladush";
        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.fieldLastNameFieldIn(expectedValueForLastName);
        String lastName = registrationPage.getLastNameValue();

        assertEquals(lastName,expectedValueForLastName,"Last Name and expectedValueForLastName do not match");
    }

    @Test
    public void registrationFormPasswordIsFullIn() {

        String expectedValue = "test_password";
        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.fieldPasswordFullIn(expectedValue);
        String passwordValue = registrationPage.getPasswordValue();

        assertEquals(passwordValue, expectedValue, " Password value and expectedValue do not match");
    }
    @Test
    public void registrationFormForBirthDayIsFullIn(){
        String expectedValueForBirthDay = "13";
        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.fieldBirthDaySetValue(expectedValueForBirthDay);
        String birthDay = registrationPage.getBirthDayValue();

        assertEquals(birthDay,expectedValueForBirthDay,"birthDay end expectedValueForBirthDay do not match");
    }
    @Test
    public void registrationFormForBirthMonthIsFullIn(){
        String expectedValueForBirthMonth="June";
        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.fieldBirthMonthSetValue(expectedValueForBirthMonth);
        String birthMonth = registrationPage.getBirthMonthValue();

        assertEquals(birthMonth,expectedValueForBirthMonth," birthMonth  and expectedValueForBirthMonth  do not match");
    }

    @Test
    public void registrationFormForBirthYearIsFullIn(){
        String expectedValueForBirthYear="1998";
        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.setFieldBirthYear(expectedValueForBirthYear);
        String birthYear = registrationPage.getBirthYear();

        assertEquals(birthYear,expectedValueForBirthYear," birthMonth  and expectedValueForBirthMonth  do not match");
    }

}
