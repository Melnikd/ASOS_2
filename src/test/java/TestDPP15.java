import org.testng.annotations.Test;
import pages.ASOSpages.RegistrationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestDPP15 extends BaseTest {

    @Test
    public void registrationFormIsFullInEmailFirstLastPassword(){
        assertTrue(RegistrationPage.openRegistrationPage().isRegistrationFirst4FieldFullIn(), "Test 1 pas");
    }

    @Test
    public void  registrationFormIsBirthDayFullIn(){
        assertTrue(RegistrationPage.openRegistrationPage().fieldBirthDayIsClick(),"Test 2 pas");
    }

    @Test
    public void registrationFormIsBirthMonthFullIn(){
        assertTrue(RegistrationPage.openRegistrationPage().fieldBirthMonthIsClick(),"Test 2 pas");
    }

    @Test
    public void registrationFormIsBirthYearFullIn(){
        assertTrue(RegistrationPage.openRegistrationPage().fieldBirthYearIsClick(),"Test 3 pas");
    }

}
