package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

    private WebDriver driver;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInForm(String username, String email, String password, String passConfirm) {
        WebElement usernameInput = driver.findElement(By.id("usernamesignup"));
        WebElement emailInput = driver.findElement(By.id("emailsignup"));
        WebElement passwordInput = driver.findElement(By.id("passwordsignup"));
        WebElement passwordConfirmInput = driver.findElement(By.id("passwordsignup_confirm"));
        usernameInput.sendKeys(username);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        passwordConfirmInput.sendKeys(passConfirm);
    }

    public void submitForm() {
        WebElement submitButton = driver.findElement(By.cssSelector("a[type=\"button\"]"));
        submitButton.click();
    }
}
