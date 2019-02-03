package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

    public static void click (WebElement element){
        System.out.println("Clicking on element: " + element.toString());
        element.click();
    }

    public static void sendKeys(WebElement element, String text){
        click(element);
        System.out.println("Sending keys: " + text + " to element: " + element.toString());
        element.clear();
        element.sendKeys(text);
    }

    public static String getTextFromElement(WebElement element){
        System.out.println("Getting text from element: " + element.toString());
        return element.getText();
    }

    public static void waitForTextToBePresentInElement(WebElement element, String expectedText){
        System.out.println("Waiting for text: " + expectedText + " to be present in element: " + element.toString());
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 10);
        wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }
}
