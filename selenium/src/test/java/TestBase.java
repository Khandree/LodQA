import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.ContactPage;
import pages.HomePage;
import pages.SignUpPage;
import utils.WebDriverSingleton;

public class TestBase {
    protected WebDriver driver;
    HomePage homePage;
    SignUpPage signUpPage;
    ContactPage contactPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LisMarciniaA\\Desktop\\LodQA\\jak-to-sie-robi-z-webdriver\\selenium\\drivers\\chromedriver.exe");
        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/");
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
        contactPage = new ContactPage(driver);
    }

    @After
    public void tearDown() {
        WebDriverSingleton.quit();
    }
}
