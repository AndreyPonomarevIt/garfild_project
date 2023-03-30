package it.academy.andrey.ponomarev.garfield.project.tests.ui;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import org.junit.jupiter.api.Assertions;
import it.academy.andrey.ponomarev.garfield.project.pages.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static it.academy.andrey.ponomarev.garfield.project.user.UserData.*;

public class LoginTest extends LoginPage {
    LoginPage loginPage = new LoginPage();
    @BeforeEach
    public void initObject() {
        WebDriver driver = DriverSetup.createDriver();
        driver.get(URL_GARFIELD_BY);
    }

    @Test
    @DisplayName("Авторизация с корректными валидными данными")
    public void testLoginCorrectData() {
        loginPage.openAndInputLoginForm(DriverSetup.driver, EMAIL, PASSWORD);
        loginPage.clickBtnEnter(DriverSetup.driver);
        Assertions.assertEquals(LOGO_NAME_USER, checkLogIn());
    }

    @Test
    @DisplayName("Авторизация с некорректными валидными данными")
    public void testLoginNotCorrectData() {
        loginPage.openAndInputLoginForm(DriverSetup.driver, RANDOM_EMAIL, RANDOM_PASSWORD);
        Assertions.assertEquals(TEXT_WRONG_PASSWORD, checkWrongPassword() );
    }

    @Test
    @DisplayName("Авторизация с корректными валидными данными и с последующим checkout")
    public void testLoginCorrectDateAndCheckOut() {
        loginPage.openAndInputLoginForm(DriverSetup.driver, EMAIL, PASSWORD);
        loginPage.clickBtnEnter(DriverSetup.driver);
        Assertions.assertEquals(LOGO_NAME_USER, checkNameLoginForm());
        loginPage.clickBtnEnter2(DriverSetup.driver);
        Assertions.assertEquals(LOGO_ENTER, checkOut());
    }

    @Test
    @DisplayName("Авторизация с невалидными данными")
    public void testInputNotCorrectDate() {
        loginPage.openAndInputLoginForm(DriverSetup.driver, WRONG_EMAIL, WRONG_PASSWORD);
        Assertions.assertEquals(TEXT_WRONG_EMAIL, checkWrongEmail());
        Assertions.assertEquals(TEXT_WRONG_PASSWORD, checkWrongPassword());
    }

    @Test
    @DisplayName("Авторизация с пустым значением Email")
    public void testEmptyEmail() {
        loginPage.openAndInputLoginForm(DriverSetup.driver, EMAIL_EMPTY, PASSWORD);
        loginPage.obligatoryField(DriverSetup.driver);
        Assertions.assertEquals(OBLIGATORY_FIELD, checkObligatoryField());
    }

    @Test
    @DisplayName("Авторизация с пустым значением Password")
    public void testEmptyPassword() {
        loginPage.openAndInputLoginForm(DriverSetup.driver, EMAIL, PASSWORD_EMPTY);
        loginPage.obligatoryField(DriverSetup.driver);
        Assertions.assertEquals(OBLIGATORY_FIELD2, checkObligatoryField());
    }

    @AfterEach
    public void closeDriver() {
        DriverSetup.closeDriver();
    }
}





