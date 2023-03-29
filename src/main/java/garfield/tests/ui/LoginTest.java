package garfield.tests.ui;

import garfield.driver.DriverSetup;
import garfield.locators.Locators;
import garfield.pages.LoginPage;
import garfield.unit.Unit;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static garfield.driver.DriverSetup.driver;
import static garfield.locators.Locators.*;
import static garfield.user.UserData.*;

public class LoginTest {

    @BeforeEach
    public void initObject() {
        Locators locators = new Locators();
        WebDriver driver = DriverSetup.createDriver();
        driver.get(URL_GARFIELD_BY);
    }


    @Test
    @DisplayName("Авторизация с корректными валидными данными")
    public void testLoginCorrectData() {
        LoginPage loginPage = new LoginPage();
        loginPage.openAndInputLoginForm(driver, EMAIL, PASSWORD);
        loginPage.clickBtnEnter(driver);
        WebElement checkNameLoginForm = driver.findElement(CHECK_NAME_LOGIN_FORM);
        Assertions.assertEquals(LOGO_NAME_USER, checkNameLoginForm.getText());
    }

    @Test
    @DisplayName("Авторизация с некорректными валидными данными")
    public void testLoginNotCorrectData() {
        LoginPage loginPage = new LoginPage();
        loginPage.openAndInputLoginForm(driver, RANDOM_EMAIL, RANDOM_PASSWORD);
        WebElement messageWrongPassword = driver.findElement(MESSAGE_WRONG_PASSWORD);
        Unit.waitVisibilityOf(messageWrongPassword);
        Assertions.assertEquals(TEXT_WRONG_PASSWORD, messageWrongPassword.getText());
    }

    @Test
    @DisplayName("Авторизация с корректными валидными данными и с последующим checkout")
    public void testLoginCorrectDateAndCheckOut() {
        LoginPage loginPage = new LoginPage();
        loginPage.openAndInputLoginForm(driver, EMAIL, PASSWORD);
        loginPage.clickBtnEnter(driver);
        WebElement checkNameLoginForm = driver.findElement(CHECK_NAME_LOGIN_FORM);
        Assertions.assertEquals(LOGO_NAME_USER, checkNameLoginForm.getText());
        driver.findElement(BUTTON_EXIT).click();
        loginPage.clickBtnEnter2(driver);
        WebElement btnEnter = driver.findElement(BUTTON_ENTER);
        Assertions.assertEquals(LOGO_ENTER, btnEnter.getText());
    }

    @Test
    @DisplayName("Авторизация с невалидными данными")
    public void testInputNotCorrectDate() {
        LoginPage loginPage = new LoginPage();
        loginPage.openAndInputLoginForm(driver, WRONG_EMAIL, WRONG_PASSWORD);
        WebElement messageWrongEmail = driver.findElement(MESSAGE_WRONG_EMAIL);
        Assertions.assertEquals(TEXT_WRONG_EMAIL, messageWrongEmail.getText());
        WebElement messageWrongPassword = driver.findElement(MESSAGE_WRONG_PASSWORD);
        Assertions.assertEquals(TEXT_WRONG_PASSWORD, messageWrongPassword.getText());
    }

    @Test
    @DisplayName("Авторизация с пустым значением Email")
    public void testEmptyEmail() {
        LoginPage loginPage = new LoginPage();
        loginPage.openAndInputLoginForm(driver, EMAIL_EMPTY, PASSWORD);
        loginPage.obligatoryField(driver);
        WebElement obligatoryFieldEmail = driver.findElement(LOGO_OBLIGATORY_FIELD);
        Assertions.assertEquals(OBLIGATORY_FIELD, obligatoryFieldEmail.getText());
    }

    @Test
    @DisplayName("Авторизация с пустым значением Password")
    public void testEmptyPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.openAndInputLoginForm(driver, EMAIL, PASSWORD_EMPTY);
        loginPage.obligatoryField(driver);
        WebElement obligatoryFieldEmail = driver.findElement(LOGO_OBLIGATORY_FIELD);
        Assertions.assertEquals(OBLIGATORY_FIELD2, obligatoryFieldEmail.getText());
    }

    @AfterEach
    public void closeDriver() {
        DriverSetup.closeDriver();
    }
}





