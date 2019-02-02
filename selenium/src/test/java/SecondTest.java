import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignUpPage;

public class SecondTest {

    private WebDriver driver;
    HomePage homePage;
    SignUpPage signUpPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LisMarciniaA\\Desktop\\LodQA\\jak-to-sie-robi-z-webdriver\\selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/");
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void popTest() {
        homePage.clickSingUpTodayButton();
        signUpPage.fillInForm("Username", "email@test.com", "Admin123", "Admin123");
        signUpPage.submitForm();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
