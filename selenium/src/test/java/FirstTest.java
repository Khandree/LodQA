import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LisMarciniaA\\Desktop\\LodQA\\jak-to-sie-robi-z-webdriver\\selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/");

    }

    @Test
    public void pageTitleTest() {
        String pageTitle = driver.getTitle();
        String expectedTitle = "Protractor workshop | Home";
        Assert.assertTrue(pageTitle.equals(expectedTitle));
    }

    @Test
    public void openNewPageTest(){
        WebElement servicesLink = driver.findElement(By.cssSelector("a[href=\"service.html\"]"));
        servicesLink.click();
        WebElement servicesPageHeader = driver.findElement(By.tagName("h1"));
        String servicesPageHeaderText = servicesPageHeader.getText();
        String expectedText = "Services";
        Assert.assertEquals(servicesPageHeaderText, expectedText);
    }

    @Test
    public void openContactPageTest(){
        WebElement contactLink = driver.findElement(By.cssSelector("a[href=\"contact.html\"]"));
        contactLink.click();
        WebElement contactPageHeader = driver.findElement(By.xpath("//div[@class=\"page-header\"]/h1"));
        String contactPageHeaderText = contactPageHeader.getText();
        String expectedText = "Contact";
        Assert.assertEquals(contactPageHeaderText, expectedText);
        WebElement nameInput = driver.findElement(By.id("name"));
        nameInput.sendKeys("Kopytko");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("kopytko@kopytko.pl");
        WebElement messageInput = driver.findElement(By.id("content"));
        messageInput.sendKeys("Hello!");
        WebElement submitButton = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String expectedMessage = "Your message has been sent.";
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".message h3"), expectedMessage));
        WebElement successMessage = driver.findElement(By.cssSelector(".message h3"));
        String successMessageText = successMessage.getText();
        Assert.assertEquals(successMessageText, expectedMessage);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
