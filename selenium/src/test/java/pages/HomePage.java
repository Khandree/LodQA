package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSingUpTodayButton() {
        WebElement signUpTodayButton = driver.findElement(By.cssSelector("a[href=\"signup.html\"]"));
        signUpTodayButton.click();

    }
}
