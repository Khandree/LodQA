package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton(){}

    public static WebDriver getInstance(){
        if(null==driver){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        return driver;
    }

    public static void quit(){
        if(null!=driver){
            driver.quit();
        }
        driver=null;
    }
}
