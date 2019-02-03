package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "usernamesignup")
    private WebElement usernameInput;

    @FindBy(id = "emailsignup")
    private WebElement emailInput;

    @FindBy(id = "passwordsignup")
    private WebElement passwordInput;

    @FindBy(id = "passwordsignup_confirm")
    private WebElement passwordConfirmInput;

    @FindBy(css = "a[type=\"button\"]")
    private WebElement submitButton;

    public void fillInForm(String username, String email, String password, String passConfirm) {
        usernameInput.sendKeys(username);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        passwordConfirmInput.sendKeys(passConfirm);
    }

    public void submitForm() {
        submitButton.click();
    }
}
