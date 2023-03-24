package garfield.test.main.page;

public class GarfieldPage {
 public static final String URL_GARFIELD_BY = "https://garfield.by";
 public static final String URL_GARFIELD_BY_CAT = "https://garfield.by/catalog/cats/suhie-korma-dlya-koshek.html";
 public static final String BUTTON_CLICK_LOGIN = "//div[@class='header-buttons__item js-personal-open h-border']";
 public static final String BUTTON_CLICK_ENTER = "(//a[@id='js-auth'])[1]";
 public static final String BUTTON_CLICK_LOGIN_FROM_EMAIL = "//a[contains(text(),'электронной почте')]";
 public static final String FIELD_CLICK_LOGIN_FROM_EMAIL = "(//input[@name='USER_LOGIN'])[1]";
 public static final String FIELD_CLICK_LOGIN_FROM_PASSWORD = "//input[@name='USER_PASSWORD']";
 public static final String CLICK_BUTTON_ENTER_WITH_FILL_DATA = "//a[@class='auth-content__button js-button']";
 public static final String CLICK_LOGO_CAT = "//div[@class='header-nav__item ']/a[contains(text(),'Кошки')]";
 public static final String CLICK_BUTTON_SEARCH = "//div[@id='js-search']";
 public static final String INPUT_PRODUCT = "//input[@class='search-field__input js-header-search-input']";
 public static final String ADD_CART = "//div[@prod-id='237981']";
 public static final String CLICK_BUTTON_CROSS = "//img[@class='search-field__close js-popup-close']";
 public static final String CLICK_BTN_CARD = "//a[@id='bx_basketFKauiI']";
 public static final String LOGO_CARD_COMPARE = "//p[text()='Advance Cat Kitten (Курица и рис), 400 г']";
 public static final String MESSAGE_WRONG_EMAIL = "(//p[contains(text(),'почтовом адресе ошибка')])[1]";
 public static final String MESSAGE_WRONG_PASSWORD = "//p[@class='field-error js-error js-error-incorrect active'][contains(text(),'В пароле ошибка')]";
 public static final String LOGO_OBLIGATORY_FIELD = "//p[@class='field-error js-error js-error-empty active'][contains(text(),'Обязательное поле')]";
 public static final String CLICK_BUTTON_PLUS = "//a[@data-entity='basket-item-quantity-plus']";
 public static final String CHECK_LOGO_PRISE = "//p[@class='cart-goods-item__sum bold orange'][contains(text(),'16.90 руб.')]";
 public static final String CLICK_BUTTON_DELETE_ORDER = "//span[@data-entity='basket-item-delete']";
 public static final String CHECK_LOGO_DELETE_FROM_CARD = "//p[@class='p2 gray'][contains(text(),'корзины')]";
 public static final String CHECK_NAME_WITH_LOGIN_FORM = "//p[@class='h4']";
 public static final String BUTTON_EXIT = "//a[@class='header-buttons-personal__bottom gray p2 link']";
 public static final String BUTTON_ENTER = "//a[@class='link p2 gray js-popup-open'][contains(text(),'Войти')]";
}
