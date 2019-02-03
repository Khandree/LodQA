package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

    public static void click (WebElement element){
        element.click();
    }

    public static void sendKeys(WebElement element, String text){
        click(element);
        element.clear();
        element.sendKeys(text);
    }

    public static void waitForTextToBePresentInElement(WebElement element, String expectedText){
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 10);
        wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }
}
