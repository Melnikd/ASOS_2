package core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    static {
        String s = System.getProperty("os.name");
        if (s.contains("Linux")) {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_linux78");

        } else if (s.contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32");
        } else if (s.contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_mac78");
        }
    }



    private DriverFactory() {
    }

    static WebDriver createDriver() {
        return new ChromeDriver();
    }

}
