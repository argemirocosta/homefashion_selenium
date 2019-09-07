package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class TesteUtil {

    public static boolean encontrouTexto(String item, WebDriver driver) {
        return driver.getPageSource().contains(item);
    }

    public static void finalizarDriver(WebDriver driver){
        driver.close();
    }

    public static WebElement buscarComponentePorNome(String componente, WebDriver driver) {
        return driver.findElement(By.name(componente));
    }

}
