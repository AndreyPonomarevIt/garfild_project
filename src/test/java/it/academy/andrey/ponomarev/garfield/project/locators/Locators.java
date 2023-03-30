package it.academy.andrey.ponomarev.garfield.project.locators;

import org.openqa.selenium.By;

public class Locators {




    public static final By CLICK_BUTTON_SEARCH = By.xpath("//div[@id='js-search']");
    public static final By INPUT_PRODUCT = By.cssSelector("input.search-field__input.js-header-search-input");
    public static final By ADD_CART = By.xpath("//div[@prod-id='237981']");
    public static final By CLICK_BUTTON_CROSS
            = By.xpath("//img[@class='search-field__close js-popup-close']");
    public static final By CLICK_BTN_CART = By.xpath("//a[@id='bx_basketFKauiI']");
    public static final By LOGO_CARD_COMPARE = By.xpath("//p[text()='Advance Cat Kitten (Курица и рис), 400 г']");
    public static final By CLICK_BUTTON_PLUS = By.xpath("//a[@data-entity='basket-item-quantity-plus']");
    public static final By CHECK_LOGO_PRISE = By.xpath("//p[@class='cart-goods-item__sum bold orange'][contains(text(),'16.90 руб.')]");
    public static final By CLICK_BUTTON_DELETE_ORDER = By.xpath("//span[@data-entity='basket-item-delete']");
    public static final By CHECK_LOGO_DELETE_FROM_CARD = By.xpath("//p[@class='p2 gray'][contains(text(),'корзины')]");

}
