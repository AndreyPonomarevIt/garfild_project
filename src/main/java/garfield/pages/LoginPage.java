package garfield.pages;

import garfield.unit.Unit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static garfield.constants.Constants.EXPLICITLY;
import static garfield.driver.DriverSetup.driver;
import static garfield.locators.Locators.*;
import static garfield.locators.Locators.CLICK_BUTTON_ENTER_WITH_FILL_DATA;
import static garfield.user.UserData.EMAIL;
import static garfield.user.UserData.PASSWORD;

public class LoginPage {


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
        openAndInputLoginForm(driver, EMAIL, PASSWORD);
        clickBtnEnter(driver);
    }
}

