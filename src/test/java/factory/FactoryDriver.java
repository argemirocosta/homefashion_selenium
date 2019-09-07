package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FactoryDriver {

    private static WebDriver driver;
    private static final String DRIVER_CHROME = "chrome";
    private static final String DRIVER_FIREFOX = "firefox";

    public static WebDriver createDriver(String browserName) {

        if (browserName.equals(DRIVER_FIREFOX)) {
            driver = new FirefoxDriver();
        }

        if (browserName.equals(DRIVER_CHROME)) {
            driver = new ChromeDriver();
        }

        return driver;
    }

}
