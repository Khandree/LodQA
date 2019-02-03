import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import utils.WebDriverSingleton;


public class SecondTest extends TestBase {

    @Test
    public void popTest() {
        homePage.clickSingUpTodayButton();
        signUpPage.fillInForm("Username", "email@test.com", "Admin123", "Admin123");
        signUpPage.submitForm();
    }

    @Test
    public void contactPageTest() {
        String currentMessage = new HomePage(WebDriverSingleton.getInstance())
                .openContactPage()
                .fillInContactForm("Kopytko", "kopytko@kopytko.pl", "Hello!")
                .submitForm()
                .waitForConfirmationMessage()
                .getConfirmationText();
        String expectedMessage = "Your message has been sent.";
        Assert.assertEquals(currentMessage, expectedMessage);
    }

}
