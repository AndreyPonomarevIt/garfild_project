package it.academy.andrey.ponomarev.garfield.project.tests.ui;

import it.academy.andrey.ponomarev.garfield.project.steps.LoginSteps;
import org.junit.jupiter.api.Assertions;
import it.academy.andrey.ponomarev.garfield.project.pages.LoginPage;
import org.junit.jupiter.api.*;
import static it.academy.andrey.ponomarev.garfield.project.user.UserData.*;

public class LoginTest extends BaseTest  {
    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Авторизация с корректными валидными данными")
    public void  testLoginCorrectData() {
        LoginSteps.stepsUserLogIn(EMAIL, PASSWORD);
        Assertions.assertEquals(LOGO_NAME_USER, loginPage.getLogIn());
    }

    @Test
    @DisplayName("Авторизация с некорректными валидными данными")
    public void testLoginNotCorrectData() {
        loginPage.openAndInputLoginForm(RANDOM_EMAIL, RANDOM_PASSWORD);
        Assertions.assertEquals(TEXT_WRONG_PASSWORD, loginPage.getErrorPassword());
    }

    @Test
    @DisplayName("Авторизация с корректными валидными данными и с последующим checkout")
    public void testLoginCorrectDateAndCheckOut() {
        LoginSteps.stepsUserLogInAndCheckOut(EMAIL, PASSWORD);
        Assertions.assertEquals(LOGO_ENTER, loginPage.getOut());
    }

    @Test
    @DisplayName("Авторизация с невалидными данными")
    public void testInputNotCorrectDate() {
        loginPage.openAndInputLoginForm(WRONG_EMAIL, WRONG_PASSWORD);
        Assertions.assertEquals(TEXT_WRONG_EMAIL, loginPage.getErrorEmail());
        Assertions.assertEquals(TEXT_WRONG_PASSWORD, loginPage.getErrorPassword());
    }

    @Test
    @DisplayName("Авторизация с пустым значением Email")
    public void testEmptyEmail() {
        loginPage.openAndInputLoginForm(EMAIL_EMPTY, PASSWORD);
        Assertions.assertEquals(OBLIGATORY_FIELD, loginPage.getObligatoryFieldEmail());
    }

    @Test
    @DisplayName("Авторизация с пустым значением Password")
    public void testEmptyPassword() {
        loginPage.openAndInputLoginForm(EMAIL, PASSWORD_EMPTY);
        Assertions.assertEquals(OBLIGATORY_FIELD, loginPage.getObligatoryFieldEmail());
    }
}
