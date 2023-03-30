package it.academy.andrey.ponomarev.garfield.project.pages;

import it.academy.andrey.ponomarev.garfield.project.unit.Unit;
import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static it.academy.andrey.ponomarev.garfield.project.constants.Constants.EXPLICITLY;
import static it.academy.andrey.ponomarev.garfield.project.user.UserData.EMAIL;
import static it.academy.andrey.ponomarev.garfield.project.user.UserData.PASSWORD;

public class LoginPage {

    public static final By BUTTON_CLICK_LOGIN = By.xpath("//div[@class='header-buttons__item js-personal-open h-border']");
    public static final By BUTTON_CLICK_ENTER = By.xpath("(//a[@id='js-auth'])[1]");
    public static final By BUTTON_CLICK_LOGIN_FROM_EMAIL = By.xpath("//a[contains(text(),'электронной почте')]");
    public static final By FIELD_CLICK_LOGIN_FROM_EMAIL = By.xpath("(//input[@name='USER_LOGIN'])[1]");
    public static final By FIELD_CLICK_LOGIN_FROM_PASSWORD = By.xpath("//input[@name='USER_PASSWORD']");
    public static final By CLICK_BUTTON_ENTER_WITH_FILL_DATA = By.xpath("//a[@class='auth-content__button js-button']");
    public static final By CHECK_NAME_LOGIN_FORM = By.xpath("//p[@class='h4']");
    public static final By BUTTON_EXIT = By.xpath("//a[@class='header-buttons-personal__bottom gray p2 link']");
    public static final By LOGO_OBLIGATORY_FIELD_EMAIL = By.xpath("//p[@class='field-error js-error js-error-empty active'][contains(text(),'Обязательное поле')]");
    public static final By MESSAGE_WRONG_EMAIL = By.xpath("(//p[contains(text(),'почтовом адресе ошибка')])[1]");
    public static final By MESSAGE_WRONG_PASSWORD = By.xpath("//p[@class='field-error js-error js-error-incorrect active'][contains(text(),'В пароле ошибка')]");
    public static final By BUTTON_ENTER = By.xpath("//a[@class='link p2 gray js-popup-open'][contains(text(),'Войти')]");
    public static final By LOGO_OBLIGATORY_FIELD = By.xpath("//p[@class='field-error js-error js-error-empty active'][contains(text(),'Обязательное поле')]");


    public void openAndInputLoginForm(WebDriver driver, String email, String password) {
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_CLICK_ENTER).click();
        driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
        driver.findElement(FIELD_CLICK_LOGIN_FROM_EMAIL).sendKeys(email);
        driver.findElement(FIELD_CLICK_LOGIN_FROM_PASSWORD).sendKeys(password);
        driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
    }

    public void clickBtnEnter(WebDriver driver) {
        Unit.waitStalenessOf(driver.findElement(BUTTON_CLICK_LOGIN));
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        WebElement checkNameLoginForm = driver.findElement(CHECK_NAME_LOGIN_FORM);
    }

    public void clickBtnEnter2(WebDriver driver) {
        driver.findElement(BUTTON_EXIT).click();
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY)).
                until(ExpectedConditions.
                        presenceOfElementLocated(BUTTON_CLICK_LOGIN));
        driver.findElement(BUTTON_CLICK_LOGIN).click();
    }

    public void obligatoryField(WebDriver driver) {
        WebElement obligatoryFieldEmail = driver.findElement(LOGO_OBLIGATORY_FIELD_EMAIL);
        Unit.waitVisibilityOf(obligatoryFieldEmail);
    }

    public void testLoginCorrectData() {
        openAndInputLoginForm(DriverSetup.driver, EMAIL, PASSWORD);
        clickBtnEnter(DriverSetup.driver);
    }

    public String checkWrongPassword() {
        WebElement messageWrongPassword = DriverSetup.driver.findElement(MESSAGE_WRONG_PASSWORD);
        Unit.waitVisibilityOf(messageWrongPassword);
        return messageWrongPassword.getText();
    }

    public String checkLogIn() {
        WebElement checkNameLoginForm = DriverSetup.driver.findElement(CHECK_NAME_LOGIN_FORM);
        return checkNameLoginForm.getText();
    }

    public String checkNameLoginForm() {
        WebElement checkNameLoginForm = DriverSetup.driver.findElement(CHECK_NAME_LOGIN_FORM);
        return checkNameLoginForm.getText();
    }

    public String checkOut() {
        WebElement checkOut = DriverSetup.driver.findElement(BUTTON_ENTER);
        return checkOut.getText();
    }

    public String checkWrongEmail() {
        WebElement checkWrongEmail = DriverSetup.driver.findElement(MESSAGE_WRONG_EMAIL);
        return checkWrongEmail.getText();
    }

    public String checkObligatoryField() {
        WebElement checkObligatoryFieldEmail = DriverSetup.driver.findElement(LOGO_OBLIGATORY_FIELD);
        return  checkObligatoryFieldEmail.getText();
    }

}
