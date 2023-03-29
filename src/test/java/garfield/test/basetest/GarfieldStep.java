/*package garfield.step;

import garfield.user.UserData;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static garfield.constants.Constants.EXPLICITLY;
import static garfield.locators.GarfieldLocators.*;
import static garfield.user.UserData.*;

public class GarfieldStep  {
    WebDriver driver;

    public GarfieldStep(WebDriver driver) {

        this.driver = driver;
    }


    public void testLoginValidDate() {
       driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_CLICK_ENTER).click();
        driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
        driver.findElement(FIELD_CLICK_LOGIN_FROM_EMAIL).sendKeys(EMAIL);
        driver.findElement(FIELD_CLICK_LOGIN_FROM_PASSWORD).sendKeys(PASSWORD);
        driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY)).until(ExpectedConditions.
                stalenessOf(driver.findElement(BUTTON_CLICK_LOGIN)));
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        WebElement checkNameLoginForm = driver.findElement(CHECK_NAME_LOGIN_FORM);
        Assertions.assertEquals(LOGO_NAME_USER, checkNameLoginForm.getText());
    }

    public void testLoginValidDateAndExit() {

        driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_CLICK_ENTER).click();
        driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
        driver.findElement(FIELD_CLICK_LOGIN_FROM_EMAIL).sendKeys(EMAIL);
        driver.findElement(FIELD_CLICK_LOGIN_FROM_PASSWORD).sendKeys(PASSWORD);
        driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY)).until(ExpectedConditions.
                stalenessOf(driver.findElement(BUTTON_CLICK_LOGIN)));
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        WebElement checkNameLoginForm = driver.findElement(CHECK_NAME_LOGIN_FORM);
        Assertions.assertEquals(LOGO_NAME_USER, checkNameLoginForm.getText());
        driver.findElement(BUTTON_EXIT).click();
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY)).until(ExpectedConditions.presenceOfElementLocated(BUTTON_CLICK_LOGIN));
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        WebElement btnEnter = driver.findElement(BUTTON_ENTER);
        Assertions.assertEquals(LOGO_ENTER, btnEnter.getText());
    }

    public void testLoginNotValidDate() {
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_CLICK_ENTER).click();
        driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
        driver.findElement(FIELD_CLICK_LOGIN_FROM_EMAIL).sendKeys(RANDOM_EMAIL);
        driver.findElement(FIELD_CLICK_LOGIN_FROM_PASSWORD).sendKeys(RANDOM_PASSWORD);
        driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
        WebElement messageWrongEmail = driver.findElement(MESSAGE_WRONG_EMAIL);
        Assertions.assertEquals(TEXT_WRONG_EMAIL, messageWrongEmail.getText());
        WebElement element2 = driver.findElement(MESSAGE_WRONG_PASSWORD);
        Assertions.assertEquals(TEXT_WRONG_PASSWORD, element2.getText());
    }

    public void testEmptyEmail() {
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_CLICK_ENTER).click();
        driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
        driver.findElement(FIELD_CLICK_LOGIN_FROM_PASSWORD).sendKeys(PASSWORD);
        driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
        //driver.findElement(LOGO_OBLIGATORY_FIELD_EMAIL).click();
        WebElement obligatoryFieldEmail = driver.findElement(LOGO_OBLIGATORY_FIELD_EMAIL);
        new WebDriverWait (driver, Duration.ofSeconds(EXPLICITLY)).until(ExpectedConditions.
                visibilityOfAllElements(obligatoryFieldEmail));
        obligatoryFieldEmail.getText();
        Assertions.assertEquals(OBLIGATORY_FIELD, obligatoryFieldEmail.getText());


    }

    public void testEmptyPassword() {
        driver.findElement(BUTTON_CLICK_LOGIN).click();
        driver.findElement(BUTTON_CLICK_ENTER).click();
        driver.findElement(BUTTON_CLICK_LOGIN_FROM_EMAIL).click();
        driver.findElement(FIELD_CLICK_LOGIN_FROM_EMAIL).sendKeys(EMAIL);
        driver.findElement(CLICK_BUTTON_ENTER_WITH_FILL_DATA).click();
        WebElement logoObligatoryField = driver.findElement(LOGO_OBLIGATORY_FIELD);
        Assertions.assertEquals(OBLIGATORY_FIELD2, logoObligatoryField.getText());
    }

    public void testOrderProductToCard() {
        driver.get(URL_GARFIELD_BY_CAT);
        driver.findElement(CLICK_BUTTON_SEARCH).click();
        driver.findElement(INPUT_PRODUCT).sendKeys(PRODUCT);
        driver.findElement(ADD_CART).click();
        driver.findElement(CLICK_BUTTON_CROSS).click();
        driver.findElement(CLICK_BTN_CARD).click();
        WebElement logoCardCompare = driver.findElement(LOGO_CARD_COMPARE);
        Assertions.assertEquals(PRODUCT, logoCardCompare.getText());
    }

    public void testOrderProductWithCardAddCount() {
        driver.get(URL_GARFIELD_BY_CAT);
        driver.findElement(CLICK_BUTTON_SEARCH).click();
        driver.findElement(INPUT_PRODUCT).sendKeys(PRODUCT);
        driver.findElement(ADD_CART).click();
        driver.findElement(CLICK_BUTTON_CROSS).click();
        driver.findElement(CLICK_BTN_CARD).click();
        driver.findElement(CLICK_BUTTON_PLUS).click();
        WebElement checkLogoPrice = driver.findElement(CHECK_LOGO_PRISE);
        Assertions.assertEquals(UserData.CHECK_PRISE, checkLogoPrice.getText());
    }
    public void testOrderProductWithCardAndDelete() {
        driver.get(URL_GARFIELD_BY_CAT);
        driver.findElement(CLICK_BUTTON_SEARCH).click();
        driver.findElement(INPUT_PRODUCT).sendKeys(PRODUCT);
        driver.findElement(ADD_CART).click();
        driver.findElement(CLICK_BUTTON_CROSS).click();
        driver.findElement(CLICK_BTN_CARD).click();
        driver.findElement(CLICK_BUTTON_DELETE_ORDER).click();
        WebElement checkLogoDeleteFromCard = driver.findElement(CHECK_LOGO_DELETE_FROM_CARD);
        Assertions.assertEquals(TEXT_LOGO_DELETE_FROM_CARD, checkLogoDeleteFromCard.getText());

    }

}

*/