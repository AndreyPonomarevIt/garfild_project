package garfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static garfield.driver.DriverSetup.driver;
import static garfield.locators.Locators.*;
import static garfield.user.UserData.URL_GARFIELD_BY_CAT;

public class CardPage {
    public void orderAddCard(WebDriver driver, String product) {
        driver.get(URL_GARFIELD_BY_CAT);
        driver.findElement(CLICK_BUTTON_SEARCH).click();
        driver.findElement(INPUT_PRODUCT).sendKeys(product);
        driver.findElement(ADD_CART).click();
    }

    public void addCard(WebDriver driver) {
        driver.findElement(CLICK_BUTTON_CROSS).click();
        driver.findElement(CLICK_BTN_CARD).click();
    }

    public void increaseCount(WebDriver driver) {
        driver.findElement(CLICK_BUTTON_PLUS).click();
    }

    public void deleteProduct(WebDriver driver) {
        driver.findElement(CLICK_BUTTON_DELETE_ORDER).click();
    }
    public String checkProductInCard() {
        WebElement checkProductInCard = driver.findElement(LOGO_CARD_COMPARE);
        return checkProductInCard.getText();
    }
    public String checkPrise() {
        WebElement checkPrise = driver.findElement(CHECK_LOGO_PRISE);
        return checkPrise.getText();
    }
    public String checkDeleteFromCard() {
        WebElement checkDeleteFromCard = driver.findElement(CHECK_LOGO_DELETE_FROM_CARD);
        return checkDeleteFromCard.getText();
    }
}
