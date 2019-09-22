package factory;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FactoryDriver {

    private static WebDriver driver;
    private static Propriedades propriedades = new Propriedades();

    public static WebDriver createDriver() {

        if(propriedades.TIPO_EXECUCAO.equals(Propriedades.TipoExecucao.LOCAL)) {
            switch (propriedades.BROWSER){
                case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME: driver = new ChromeDriver(); break;
            }
        }

        else if(propriedades.TIPO_EXECUCAO.equals(Propriedades.TipoExecucao.GRID)) {
            DesiredCapabilities capabilities = null;
            switch (propriedades.BROWSER){
                case FIREFOX: capabilities = DesiredCapabilities.firefox(); break;
                case CHROME: capabilities = DesiredCapabilities.chrome(); break;
            }
            try {
                driver = new RemoteWebDriver(new URL("http://192.168.0.7:4444/wd/hub"), capabilities);
            }catch (MalformedURLException e){
                e.printStackTrace();
            }
        }

        else if(propriedades.TIPO_EXECUCAO.equals(Propriedades.TipoExecucao.NUVEM)) {
            DesiredCapabilities capabilities = null;
            switch (propriedades.BROWSER){
                case FIREFOX: capabilities = DesiredCapabilities.firefox(); break;
                case CHROME: capabilities = DesiredCapabilities.chrome(); break;
            }
            try {
                driver = new RemoteWebDriver(new URL("http://argemirocosta:86ce0617-a042-4c5a-8c27-fb897fb8177d@ondemand.saucelabs.com:80/wd/hub"), capabilities);
            }catch (MalformedURLException e){
                e.printStackTrace();
            }
        }

        driver.manage().window().setSize(new Dimension(1200, 765));

        return driver;
    }

}
