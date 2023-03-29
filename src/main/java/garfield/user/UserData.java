package garfield.user;

import com.github.javafaker.Faker;
public class UserData  {
    static Faker faker = new Faker();
    public static final String URL_GARFIELD_BY = "https://garfield.by";
    public static final String URL_GARFIELD_BY_CAT = "https://garfield.by/catalog/cats/suhie-korma-dlya-koshek.html";
    public static final String EMAIL = "Droner7777777@gmail.com";
    public static final String WRONG_EMAIL = "Droner7777777@gmai";
    public static final String WRONG_PASSWORD = "asd23";
    public static final String EMAIL_EMPTY = " ";
    public static final String PASSWORD = "kol63zei";
    public static final String PASSWORD_EMPTY = "";
    public static final String TEXT_WRONG_EMAIL = "В почтовом адресе ошибка";
    public static final String TEXT_WRONG_PASSWORD = "В пароле ошибка";
    public static final String PRODUCT = "Advance Cat Kitten (Курица и рис), 400 г";
    public static final String OBLIGATORY_FIELD = "Обязательное поле";
    public static final String OBLIGATORY_FIELD2 = "Обязательное поле";
    public static final String CHECK_PRISE = "16.90 руб.";
    public static final String TEXT_LOGO_DELETE_FROM_CARD = "удален из корзины";
    public static final String LOGO_NAME_USER = "Droner";
    public static final String LOGO_ENTER = "Войти";

    public static final String RANDOM_EMAIL = faker.internet().emailAddress();
    public static final String RANDOM_PASSWORD = faker.internet().password(
            3,
            5,
            true,
            true,
            true);
}
