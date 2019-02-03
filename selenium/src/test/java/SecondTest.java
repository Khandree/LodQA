import org.junit.Assert;
import org.junit.Test;


public class SecondTest extends TestBase{

    @Test
    public void popTest() {
        homePage.clickSingUpTodayButton();
        signUpPage.fillInForm("Username", "email@test.com", "Admin123", "Admin123");
        signUpPage.submitForm();
    }

    @Test
    public void contactPageTest() {
        homePage.clickContactLink();
        String contactPageHeaderText = contactPage.contactPageHeader.getText();
        String expectedContactText = "Contact";
        Assert.assertEquals(contactPageHeaderText, expectedContactText);
        contactPage.fillInContactForm("Kopytko", "kopytko@kopytko.pl", "Hello!");
        contactPage.submitForm();
        String expectedMessage = "Your message has been sent.";
        String returnMessage = contactPage.waitForSubmitToFinish(driver, expectedMessage);
        Assert.assertEquals(returnMessage, expectedMessage);
    }

}
