package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;
import static utils.Actions.sendKeys;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver) {
        super (driver);
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
        sendKeys(usernameInput, username);
        sendKeys(emailInput, email);
        sendKeys(passwordInput, password);
        sendKeys(passwordConfirmInput, passConfirm);
    }

    public void submitForm() {
        click(submitButton);
    }
}
