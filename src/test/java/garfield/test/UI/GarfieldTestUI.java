package garfield.test.UI;
import garfield.test.main.page.GarfieldPage;
import garfield.test.main.step.GarfieldStep;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;



public class GarfieldTestUI {
    WebDriver driver;

    @BeforeEach
    public void initObject() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(GarfieldPage.URL_GARFIELD_BY);
    }


    @Test
    public void testInputCorrectDate() {
        GarfieldStep inputLoginAndPassword = new GarfieldStep(driver);
        inputLoginAndPassword.testLoginValidDate();
    }

    @Test
    public void testInputCorrectDateAndCheckExitFormAndCheck() {
        GarfieldStep inputLoginAndPasswordAndExit = new GarfieldStep(driver);
        inputLoginAndPasswordAndExit.testLoginValidDateAndExit();
    }

    @Test
    public void testInputNotCorrectDate() {
        GarfieldStep inputNotCorrectPassword = new GarfieldStep(driver);
        inputNotCorrectPassword.testLoginNotValidDate();
    }

    @Test
    public void testEmptyEmail() {
        GarfieldStep emptyEmail = new GarfieldStep(driver);
        emptyEmail.testEmptyEmail();
    }

    @Test
    public void testEmptyPassword() {
        GarfieldStep emptyPassword = new GarfieldStep(driver);
        emptyPassword.testEmptyPassword();
    }


    @Test
    public void testOrderProduct() {
        GarfieldStep orderProduct = new GarfieldStep(driver);
        orderProduct.testOrderProductToCard();
    }

    @Test
    public void testOrderProductWithCardAddCount() {
        GarfieldStep orderProductWithCardAddCountAndClear = new GarfieldStep(driver);
        orderProductWithCardAddCountAndClear.testOrderProductWithCardAddCount();
    }

    @Test
    public void testOrderProductWithCardAndDelete() {
        GarfieldStep orderProductWithCardAndDelete = new GarfieldStep(driver);
        orderProductWithCardAndDelete.testOrderProductWithCardAndDelete();
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }
}






