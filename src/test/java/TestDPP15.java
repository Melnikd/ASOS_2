import org.testng.annotations.Test;
import pages.ASOSpages.RegistrationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestDPP15 extends BaseTest {

    @Test
    public void registrationFormIsFullInEmailFirstLastPassword() {
        //введи в него даные
        //проверь что данные ввелись

        String expectedValue = "test_password";
        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.fieldPasswordFullIn(expectedValue);
        String passwordValue = registrationPage.getPasswordValue();

        assertEquals(passwordValue, expectedValue, "Test 1 pas");
    }

//    @Test
//    public void registrationFormIsBirthDayFullIn() {
//        assertTrue(RegistrationPage.openRegistrationPage().fieldBirthDayIsClick(), "Test 2 pas");
//    }
//
//    @Test
//    public void registrationFormIsBirthMonthFullIn() {
//        assertTrue(RegistrationPage.openRegistrationPage().fieldBirthMonthIsClick(), "Test 2 pas");
//    }
//
//    @Test
//    public void registrationFormIsBirthYearFullIn() {
//        assertTrue(RegistrationPage.openRegistrationPage().fieldBirthYearIsClick(), "Test 3 pas");
//    }

}
