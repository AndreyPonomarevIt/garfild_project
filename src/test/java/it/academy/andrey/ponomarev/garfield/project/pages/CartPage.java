package it.academy.andrey.ponomarev.garfield.project.pages;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import it.academy.andrey.ponomarev.garfield.project.user.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage {
    WebDriver driver;
    public CartPage() {
        driver= DriverSetup.createDriver();
    }
    private  final By CLICK_BUTTON_SEARCH = By.xpath("//div[@id='js-search']");
    private final By INPUT_PRODUCT = By.cssSelector("input.search-field__input.js-header-search-input");
    private final By ADD_CART = By.xpath("//div[@prod-id='237981']");
    private final By CLICK_BUTTON_CROSS = By.xpath("//img[@class='search-field__close js-popup-close']");
    private final By CLICK_BTN_CART = By.xpath("//a[@id='bx_basketFKauiI']");
    private final By LOGO_CARD_COMPARE = By.xpath("//p[text()='Advance Cat Kitten (Курица и рис), 400 г']");
    private final By CLICK_BUTTON_PLUS = By.xpath("//a[@data-entity='basket-item-quantity-plus']");
    private final By CHECK_LOGO_PRISE = By.xpath("//p[@class='cart-goods-item__sum bold orange'][contains(text(),'16.90 руб.')]");
    private final By CLICK_BUTTON_DELETE_ORDER = By.xpath("//span[@data-entity='basket-item-delete']");
    private final By CHECK_LOGO_DELETE_FROM_CARD = By.xpath("//p[@class='p2 gray'][contains(text(),'корзины')]");
    public CartPage orderAddCart(String product) {
        driver.get(UserData.URL_GARFIELD_BY_CAT);
        driver.findElement(CLICK_BUTTON_SEARCH).click();
        driver.findElement(INPUT_PRODUCT).sendKeys(product);
        driver.findElement(ADD_CART).click();
        return this;
    }
    public CartPage addCart() {
        driver.findElement(CLICK_BUTTON_CROSS).click();
        driver.findElement(CLICK_BTN_CART).click();
        return this;
    }
    public CartPage increaseCount() {
        driver.findElement(CLICK_BUTTON_PLUS).click();
        return this;
    }
    public CartPage deleteProduct() {
        driver.findElement(CLICK_BUTTON_DELETE_ORDER).click();
        return this;
    }
    public String getProductInCart() {
        WebElement checkProductInCard = driver.findElement(LOGO_CARD_COMPARE);
        return checkProductInCard.getText();
    }
    public String getPrise() {
        WebElement checkPrise = driver.findElement(CHECK_LOGO_PRISE);
        return checkPrise.getText();
    }
    public String getDeleteFromCart() {
        WebElement checkDeleteFromCard = driver.findElement(CHECK_LOGO_DELETE_FROM_CARD);
        return checkDeleteFromCard.getText();
    }
}
