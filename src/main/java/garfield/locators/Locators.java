package garfield.locators;

import org.openqa.selenium.By;

public class Locators {

    public static final By BUTTON_CLICK_LOGIN = By.xpath("//div[@class='header-buttons__item js-personal-open h-border']");
    public static final By BUTTON_CLICK_ENTER = By.xpath("(//a[@id='js-auth'])[1]");
    public static final By BUTTON_CLICK_LOGIN_FROM_EMAIL = By.xpath("//a[contains(text(),'электронной почте')]");
    public static final By FIELD_CLICK_LOGIN_FROM_EMAIL = By.xpath("(//input[@name='USER_LOGIN'])[1]");
    public static final By FIELD_CLICK_LOGIN_FROM_PASSWORD = By.xpath("//input[@name='USER_PASSWORD']");
    public static final By CLICK_BUTTON_ENTER_WITH_FILL_DATA = By.xpath("//a[@class='auth-content__button js-button']");
    public static final By CLICK_BUTTON_SEARCH = By.xpath("//div[@id='js-search']");
    public static final By INPUT_PRODUCT = By.xpath("//input[@class='search-field__input js-header-search-input']");
    public static final By ADD_CART = By.xpath("//div[@prod-id='237981']");
    public static final By CLICK_BUTTON_CROSS = By.xpath("//img[@class='search-field__close js-popup-close']");
    public static final By CLICK_BTN_CARD = By.xpath("//a[@id='bx_basketFKauiI']");
    public static final By LOGO_CARD_COMPARE = By.xpath("//p[text()='Advance Cat Kitten (Курица и рис), 400 г']");
    public static final By MESSAGE_WRONG_EMAIL = By.xpath("(//p[contains(text(),'почтовом адресе ошибка')])[1]");
    public static final By MESSAGE_WRONG_PASSWORD = By.xpath("//p[@class='field-error js-error js-error-incorrect active'][contains(text(),'В пароле ошибка')]");
    public static final By LOGO_OBLIGATORY_FIELD = By.xpath("//p[@class='field-error js-error js-error-empty active'][contains(text(),'Обязательное поле')]");
    public static final By CLICK_BUTTON_PLUS = By.xpath("//a[@data-entity='basket-item-quantity-plus']");
    public static final By CHECK_LOGO_PRISE = By.xpath("//p[@class='cart-goods-item__sum bold orange'][contains(text(),'16.90 руб.')]");
    public static final By CLICK_BUTTON_DELETE_ORDER = By.xpath("//span[@data-entity='basket-item-delete']");
    public static final By CHECK_LOGO_DELETE_FROM_CARD = By.xpath("//p[@class='p2 gray'][contains(text(),'корзины')]");
    public static final By CHECK_NAME_LOGIN_FORM = By.xpath("//p[@class='h4']");
    public static final By BUTTON_EXIT = By.xpath("//a[@class='header-buttons-personal__bottom gray p2 link']");
    public static final By BUTTON_ENTER = By.xpath("//a[@class='link p2 gray js-popup-open'][contains(text(),'Войти')]");
    public static final By LOGO_OBLIGATORY_FIELD_EMAIL = By.xpath("//p[@class='field-error js-error js-error-empty active'][contains(text(),'Обязательное поле')]");
}
