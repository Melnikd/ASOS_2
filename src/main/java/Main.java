import pages.ASOSpages.RegistrationPage;

public class Main {
    public static void main(String[] args) {

        String expectedValueForBirthDay = "13";

        RegistrationPage registrationPage = RegistrationPage.openRegistrationPage();

        registrationPage.fieldBirthDaySetValue(expectedValueForBirthDay);

        //String birthDay = registrationPage.getBirthDayValue();


    }
}
