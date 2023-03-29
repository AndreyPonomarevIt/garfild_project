package garfield.tests.ui;

import garfield.driver.DriverSetup;
import garfield.pages.CardPage;
import garfield.user.UserData;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import static garfield.driver.DriverSetup.driver;
import static garfield.user.UserData.*;

public class CardTest extends CardPage {
    CardPage cardPage = new CardPage();
    @BeforeEach
    public void initObject() {
        WebDriver driver = DriverSetup.createDriver();
        driver.get(URL_GARFIELD_BY_CAT);
    }
    @Test
    @DisplayName("Добавление выбранного продукта в корзину")
    public void testOrderProduct() {
        cardPage.orderAddCard(driver, PRODUCT);
        cardPage.addCard(driver);
        Assertions.assertEquals(PRODUCT, checkProductInCard());
    }

    @Test
    @DisplayName("Добавление выбранного продукта в корзину и увеличение его количества")
    public void testOrderProductWithCardAddCount() {
        cardPage.orderAddCard(driver, PRODUCT);
        cardPage.addCard(driver);
        cardPage.increaseCount(driver);
        Assertions.assertEquals(UserData.CHECK_PRISE, checkPrise());
    }

    @Test
    @DisplayName("Добавление выбранного продукта в корзину c последующим удалением из нее")
    public void testOrderProductWithCardAndDelete() {
        cardPage.orderAddCard(driver, PRODUCT);
        cardPage.addCard(driver);
        cardPage.deleteProduct(driver);
        Assertions.assertEquals(TEXT_LOGO_DELETE_FROM_CARD, checkDeleteFromCard());
    }
    @AfterEach
    public void closeDriver() {
        DriverSetup.closeDriver();
    }

}
