import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ASOSpages.RegistrationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestDPP15 extends BaseTest {

    @Test
    public void registrationFormFullIn(){
        SoftAssert softAssert = new SoftAssert();
        RegistrationPage registrationPage =RegistrationPage.openRegistrationPage();

        String expectedValueForEmail = "diana.melnyk@nure.ua";
        registrationPage.fieldEmailFillIn(expectedValueForEmail);
        String emailValue = registrationPage.getEmailValue();
        softAssert.assertEquals(emailValue , expectedValueForEmail, " Email value and expectedValueForEmail do not match" );

        String expectedValueForFirstName = "Diana";
        registrationPage.fieldFirstNameFillIn(expectedValueForFirstName);
        String firstName = registrationPage.getFirstNameValue();
        softAssert.assertEquals(firstName, expectedValueForFirstName,"First name value and expectedValueForFirstName do not match");

        String expectedValueForLastName = "Hladush";
        registrationPage.fieldLastNameFieldIn(expectedValueForLastName);
        String lastName = registrationPage.getLastNameValue();
        softAssert.assertEquals(lastName,expectedValueForLastName,"Last Name and expectedValueForLastName do not match");

        String expectedValue = "test_password";
        registrationPage.fieldPasswordFullIn(expectedValue);
        String passwordValue = registrationPage.getPasswordValue();
        softAssert.assertEquals(passwordValue, expectedValue, " Password value and expectedValue do not match");

        String expectedValueForBirthDay = "13";
        registrationPage.fieldBirthDaySetValue(expectedValueForBirthDay);
        String birthDay = registrationPage.getBirthDayValue();
        softAssert.assertEquals(birthDay,expectedValueForBirthDay,"birthDay end expectedValueForBirthDay do not match");

        String expectedValueForBirthMonth="June";
        registrationPage.fieldBirthMonthSetValue(expectedValueForBirthMonth);
        String birthMonth = registrationPage.getBirthMonthValue();
        softAssert.assertEquals(birthMonth,expectedValueForBirthMonth," birthMonth  and expectedValueForBirthMonth  do not match");

        String expectedValueForBirthYear="1998";
        registrationPage.setFieldBirthYear(expectedValueForBirthYear);
        String birthYear = registrationPage.getBirthYear();
        softAssert.assertEquals(birthYear,expectedValueForBirthYear," birthMonth  and expectedValueForBirthMonth  do not match");

        softAssert.assertAll();

    }

//    @Test
//    public void registrationFormEmailIsFullIn(){
//
//        String expectedValueForEmail = "diana.melnyk@nure.ua";
//        RegistrationPage registrationPage =RegistrationPage.openRegistrationPage();
//
//        registrationPage.fieldEmailFillIn(expectedValueForEmail);
//        String emailValue = registrationPage.getEmailValue();
//
//        assertEquals(emailValue , expectedValueForEmail, " Email value and expectedValueForEmail do not match" );
//    }
//
//    @Test
//    public void registrationFormFirstNameIsFullIn(){
//        String expectedValueForFirstName = "Diana";
//        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();
//
//        registrationPage.fieldFirstNameFillIn(expectedValueForFirstName);
//        String firstName = registrationPage.getFirstNameValue();
//
//        assertEquals(firstName, expectedValueForFirstName,"First name value and expectedValueForFirstName do not match");
//    }
//
//    @Test
//    public void registrationFormLastNameIsFullIn(){
//        String expectedValueForLastName = "Hladush";
//        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();
//
//        registrationPage.fieldLastNameFieldIn(expectedValueForLastName);
//        String lastName = registrationPage.getLastNameValue();
//
//        assertEquals(lastName,expectedValueForLastName,"Last Name and expectedValueForLastName do not match");
//    }
//
//    @Test
//    public void registrationFormPasswordIsFullIn() {
//
//        String expectedValue = "test_password";
//        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();
//
//        registrationPage.fieldPasswordFullIn(expectedValue);
//        String passwordValue = registrationPage.getPasswordValue();
//
//        assertEquals(passwordValue, expectedValue, " Password value and expectedValue do not match");
//    }
//    @Test
//    public void registrationFormForBirthDayIsFullIn(){
//        String expectedValueForBirthDay = "13";
//        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();
//
//        registrationPage.fieldBirthDaySetValue(expectedValueForBirthDay);
//        String birthDay = registrationPage.getBirthDayValue();
//
//        assertEquals(birthDay,expectedValueForBirthDay,"birthDay end expectedValueForBirthDay do not match");
//    }
//    @Test
//    public void registrationFormForBirthMonthIsFullIn(){
//        String expectedValueForBirthMonth="June";
//        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();
//
//        registrationPage.fieldBirthMonthSetValue(expectedValueForBirthMonth);
//        String birthMonth = registrationPage.getBirthMonthValue();
//
//        assertEquals(birthMonth,expectedValueForBirthMonth," birthMonth  and expectedValueForBirthMonth  do not match");
//    }
//
//    @Test
//    public void registrationFormForBirthYearIsFullIn(){
//        String expectedValueForBirthYear="1998";
//        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();
//
//        registrationPage.setFieldBirthYear(expectedValueForBirthYear);
//        String birthYear = registrationPage.getBirthYear();
//
//        assertEquals(birthYear,expectedValueForBirthYear," birthMonth  and expectedValueForBirthMonth  do not match");
//    }

}
