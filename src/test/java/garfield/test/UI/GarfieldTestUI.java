package garfield.test.UI;
import garfield.step.GarfieldMethod;
import garfield.step.GarfieldStep;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

import static garfield.constants.Constants.IMPLICITLY;
import static garfield.text.GarfieldText.*;


public class GarfieldTestUI {
    WebDriver driver;

    @BeforeEach
    public void initObject() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY));
        driver.get(URL_GARFIELD_BY);
    }
    @Test
    public void test() {
        GarfieldMethod garfieldMethod = new GarfieldMethod(driver);
        garfieldMethod.inputEmailPassword(EMAIL,PASSWORD);
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






