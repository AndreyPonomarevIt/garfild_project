package garfield.test.main.step;

import garfield.test.main.text.GarfieldText;
import garfield.test.main.page.GarfieldPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GarfieldStep {
    WebDriver driver;

    public GarfieldStep(WebDriver driver) {
        this.driver = driver;
    }

    public void testLoginValidDate() {

        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_ENTER)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).sendKeys(GarfieldText.EMAIL);
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_PASSWORD)).sendKeys(GarfieldText.PASSWORD);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_ENTER_WITH_FILL_DATA)).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.
                stalenessOf(driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN))));
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        WebElement elementName = driver.findElement(By.xpath(GarfieldPage.CHECK_NAME_WITH_LOGIN_FORM));
        Assertions.assertEquals(GarfieldText.LOGO_NAME_USER, elementName.getText());
    }

    public void testLoginValidDateAndExit() {

        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_ENTER)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).sendKeys(GarfieldText.EMAIL);
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_PASSWORD)).sendKeys(GarfieldText.PASSWORD);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_ENTER_WITH_FILL_DATA)).click();
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.
                stalenessOf(driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN))));
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        WebElement elementName = driver.findElement(By.xpath(GarfieldPage.CHECK_NAME_WITH_LOGIN_FORM));
        Assertions.assertEquals(GarfieldText.LOGO_NAME_USER, elementName.getText());
        driver.findElement(By.xpath(GarfieldPage.BUTTON_EXIT)).click();
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)));
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        WebElement elementEnter = driver.findElement(By.xpath(GarfieldPage.BUTTON_ENTER));
        Assertions.assertEquals(GarfieldText.LOGO_ENTER, elementEnter.getText());
    }

    public void testLoginNotValidDate() {
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_ENTER)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).sendKeys(GarfieldText.EMAIL_NOT_CORRECT);
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_PASSWORD)).sendKeys(GarfieldText.PASSWORD_NOT_CORRECT);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_ENTER_WITH_FILL_DATA)).click();
        WebElement element = driver.findElement(By.xpath(GarfieldPage.MESSAGE_WRONG_EMAIL));
        Assertions.assertEquals(GarfieldText.MESSAGE_WRONG_EMAIL, element.getText());
        WebElement element2 = driver.findElement(By.xpath(GarfieldPage.MESSAGE_WRONG_PASSWORD));
        Assertions.assertEquals(GarfieldText.MESSAGE_WRONG_PASSWORD, element2.getText());
    }

    public void testEmptyEmail() {
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_ENTER)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_PASSWORD)).sendKeys(GarfieldText.PASSWORD);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_ENTER_WITH_FILL_DATA)).click();
        WebElement element3 = driver.findElement(By.xpath(GarfieldPage.LOGO_OBLIGATORY_FIELD));
        Assertions.assertEquals(GarfieldText.OBLIGATORY_FIELD, element3.getText());
    }

    public void testEmptyPassword() {
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_ENTER)).click();
        driver.findElement(By.xpath(GarfieldPage.BUTTON_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).click();
        driver.findElement(By.xpath(GarfieldPage.FIELD_CLICK_LOGIN_FROM_EMAIL)).sendKeys(GarfieldText.EMAIL);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_ENTER_WITH_FILL_DATA)).click();
        WebElement element4 = driver.findElement(By.xpath(GarfieldPage.LOGO_OBLIGATORY_FIELD));
        Assertions.assertEquals(GarfieldText.OBLIGATORY_FIELD2, element4.getText());
    }

    public void testOrderProductToCard() {
        driver.get(GarfieldPage.URL_GARFIELD_BY_CAT);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_SEARCH)).click();
        driver.findElement(By.xpath(GarfieldPage.INPUT_PRODUCT)).sendKeys(GarfieldText.NAME_OF_THE_PRODUCT);
        driver.findElement(By.xpath(GarfieldPage.ADD_CART)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_CROSS)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BTN_CARD)).click();
        WebElement element3 = driver.findElement(By.xpath(GarfieldPage.LOGO_CARD_COMPARE));
        Assertions.assertEquals(GarfieldText.NAME_OF_THE_PRODUCT, element3.getText());
    }

    public void testOrderProductWithCardAddCount() {
        driver.get(GarfieldPage.URL_GARFIELD_BY_CAT);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_SEARCH)).click();
        driver.findElement(By.xpath(GarfieldPage.INPUT_PRODUCT)).sendKeys(GarfieldText.NAME_OF_THE_PRODUCT);
        driver.findElement(By.xpath(GarfieldPage.ADD_CART)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_CROSS)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BTN_CARD)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_PLUS)).click();
        WebElement element5 = driver.findElement(By.xpath(GarfieldPage.CHECK_LOGO_PRISE));
        Assertions.assertEquals(GarfieldText.CHECK_PRISE, element5.getText());

    }

    public void testOrderProductWithCardAndDelete() {
        driver.get(GarfieldPage.URL_GARFIELD_BY_CAT);
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_SEARCH)).click();
        driver.findElement(By.xpath(GarfieldPage.INPUT_PRODUCT)).sendKeys(GarfieldText.NAME_OF_THE_PRODUCT);
        driver.findElement(By.xpath(GarfieldPage.ADD_CART)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_CROSS)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BTN_CARD)).click();
        driver.findElement(By.xpath(GarfieldPage.CLICK_BUTTON_DELETE_ORDER)).click();
        WebElement element6 = driver.findElement(By.xpath(GarfieldPage.CHECK_LOGO_DELETE_FROM_CARD));
        Assertions.assertEquals(GarfieldText.CHECK_LOGO_DELETE_FROM_CARD, element6.getText());

    }
}

