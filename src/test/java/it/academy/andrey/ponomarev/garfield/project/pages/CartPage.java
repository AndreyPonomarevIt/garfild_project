package it.academy.andrey.ponomarev.garfield.project.pages;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import it.academy.andrey.ponomarev.garfield.project.locators.Locators;
import it.academy.andrey.ponomarev.garfield.project.user.UserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    public void orderAddCard(WebDriver driver, String product) {
        driver.get(UserData.URL_GARFIELD_BY_CAT);
        driver.findElement(Locators.CLICK_BUTTON_SEARCH).click();
        driver.findElement(Locators.INPUT_PRODUCT).sendKeys(product);
        driver.findElement(Locators.ADD_CART).click();
    }

    public void addCard(WebDriver driver) {
        driver.findElement(Locators.CLICK_BUTTON_CROSS).click();
        driver.findElement(Locators.CLICK_BTN_CART).click();
    }

    public void increaseCount(WebDriver driver) {
        driver.findElement(Locators.CLICK_BUTTON_PLUS).click();
    }

    public void deleteProduct(WebDriver driver) {
        driver.findElement(Locators.CLICK_BUTTON_DELETE_ORDER).click();
    }
    public String checkProductInCard() {
        WebElement checkProductInCard = DriverSetup.driver.findElement(Locators.LOGO_CARD_COMPARE);
        return checkProductInCard.getText();
    }
    public String checkPrise() {
        WebElement checkPrise = DriverSetup.driver.findElement(Locators.CHECK_LOGO_PRISE);
        return checkPrise.getText();
    }
    public String checkDeleteFromCard() {
        WebElement checkDeleteFromCard = DriverSetup.driver.findElement(Locators.CHECK_LOGO_DELETE_FROM_CARD);
        return checkDeleteFromCard.getText();
    }
}
