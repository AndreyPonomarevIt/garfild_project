package it.academy.andrey.ponomarev.garfield.project.pages;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import it.academy.andrey.ponomarev.garfield.project.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    WebDriver driver;
    public LoginPage() {
     driver=DriverSetup.createDriver();
    }
    private final By BUTTON_CLICK_LOGIN = By.xpath("//div[@class='header-buttons__item js-personal-open h-border']");
    private final By BUTTON_CLICK_ENTER = By.xpath("(//a[@id='js-auth'])[1]");
    private final By BUTTON_CLICK_LOGIN_FROM_EMAIL = By.xpath("//a[contains(text(),'электронной почте')]");
    private final By FIELD_CLICK_LOGIN_FROM_EMAIL = By.xpath("(//input[@name='USER_LOGIN'])[1]");
    private final By FIELD_CLICK_LOGIN_FROM_PASSWORD = By.xpath("//input[@name='USER_PASSWORD']");
    private final By CLICK_BUTTON_ENTER_WITH_FILL_DATA = By.xpath("//a[@class='auth-content__button js-button']");
    private final By CHECK_NAME_LOGIN_FORM = By.xpath("//p[@class='h4']");
    private final By BUTTON_EXIT = By.xpath("//a[@class='header-buttons-personal__bottom gray p2 link']");
    private final By LOGO_OBLIGATORY_FIELD_EMAIL = By.xpath("//p[@class='field-error js-error js-error-empty active'][contains(text(),'Обязательное поле')]");
    private final By MESSAGE_WRONG_EMAIL = By.xpath("(//p[contains(text(),'почтовом адресе ошибка')])[1]");
    private final By MESSAGE_WRONG_PASSWORD = By.xpath("//p[@class='field-error js-error js-error-incorrect active'][contains(text(),'В пароле ошибка')]");
    private final By BUTTON_ENTER = By.xpath("//a[@class='link p2 gray js-popup-open'][contains(text(),'Войти')]");
    public LoginPage openAndInputLoginForm( String email, String password) {
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_CLICK_ENTER).click();
        driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
        driver.findElement(FIELD_CLICK_LOGIN_FROM_EMAIL).sendKeys(email);
        driver.findElement(FIELD_CLICK_LOGIN_FROM_PASSWORD).sendKeys(password);
        driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
        return this;
    }
    public LoginPage clickBtnEnter() {
        Util.waitStalenessOf(driver.findElement(BUTTON_CLICK_LOGIN));
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        return this;
    }
    public LoginPage clickBtnEnterLoginForm() {
        Util.waitStalenessOf(driver.findElement(BUTTON_CLICK_LOGIN));
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_EXIT).click();
        Util.waitPresenceOfElement((By.ByXPath)BUTTON_CLICK_LOGIN);
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        return this;
    }
    public String getObligatoryFieldEmail() {
        WebElement obligatoryFieldEmail = driver.findElement(LOGO_OBLIGATORY_FIELD_EMAIL);
        return obligatoryFieldEmail.getText();
    }
    public String getErrorPassword() {
        driver.findElement(MESSAGE_WRONG_PASSWORD).click();
        WebElement messageWrongPassword = driver.findElement(MESSAGE_WRONG_PASSWORD);
        return messageWrongPassword.getText();
    }
    public String getLogIn() {
        WebElement checkNameLoginForm = driver.findElement(CHECK_NAME_LOGIN_FORM);
        return checkNameLoginForm.getText();
    }
    public String getOut() {
        WebElement checkOut = driver.findElement(BUTTON_ENTER);
        return checkOut.getText();
    }
    public String getErrorEmail() {
        WebElement checkWrongEmail = driver.findElement(MESSAGE_WRONG_EMAIL);
        return checkWrongEmail.getText();
    }
}
