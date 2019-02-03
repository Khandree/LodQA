package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverSingleton;

import static utils.Actions.*;


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
    private WebElement confirmationMessage;

    public ContactPage fillInContactForm(String name, String email, String message) {
        sendKeys(nameInput, name);
        sendKeys(emailInput, email);
        sendKeys(messageInput, message);
        return new ContactPage(WebDriverSingleton.getInstance());
    }

    public ContactPage submitForm() {
        click(submitButton);
        return this;
    }

    public ContactPage waitForConfirmationMessage(){
        String expectedMessage = "Your message has been sent.";
        waitForTextToBePresentInElement(confirmationMessage, expectedMessage);
        return this;
    }

    public String getConfirmationText(){
        return getTextFromElement(confirmationMessage);
    }
}
