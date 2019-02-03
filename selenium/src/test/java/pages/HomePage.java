package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver); //super - wywolaj konstruktor klasy matki
    }

    @FindBy(css = "a[href=\"signup.html\"]")
    private WebElement signUpTodayButton;

    @FindBy(css = "a[href=\"contact.html\"]")
    private WebElement contactLink;

    public void clickSingUpTodayButton() {
        signUpTodayButton.click();
    }

    public void clickContactLink() {
        contactLink.click();
    }
}
