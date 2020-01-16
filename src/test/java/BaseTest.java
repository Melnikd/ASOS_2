import core.DriverManager;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    @AfterSuite
    public static void afterTeats(){
        DriverManager.quitDriver();
    }

}
