package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverSingleton;

import static utils.Actions.click;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver); //super - wywolaj konstruktor klasy matki
    }

    @FindBy(css = "a[href=\"signup.html\"]")
    private WebElement signUpTodayButton;

    @FindBy(css = "a[href=\"contact.html\"]")
    private WebElement contactPageLink;

    public void clickSingUpTodayButton() {
        click(signUpTodayButton);
    }

    public ContactPage openContactPage() {
        click(contactPageLink);
        return new ContactPage(WebDriverSingleton.getInstance());
    }
}
