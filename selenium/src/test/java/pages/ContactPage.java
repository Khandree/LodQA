package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"page-header\"]/h1")
    public WebElement contactPageHeader;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "content")
    private WebElement messageInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitButton;

    @FindBy(css = ".message h3")
    private WebElement successMessage;

    public void fillInContactForm(String name, String email, String message) {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        messageInput.sendKeys(message);
    }

    public void submitForm() {
        submitButton.click();
    }

    public String waitForSubmitToFinish(WebDriver driver, String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".message h3"), expectedMessage));
        String successMessageText = successMessage.getText();
        return successMessageText;
    }
}