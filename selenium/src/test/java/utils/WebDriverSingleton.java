package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton(){}

    public static WebDriver getInstance(){
        if(null==driver){
            driver=new ChromeDriver();
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
