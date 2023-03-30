package it.academy.andrey.ponomarev.garfield.project.tests.ui;

import it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup;
import it.academy.andrey.ponomarev.garfield.project.pages.CartPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import static it.academy.andrey.ponomarev.garfield.project.driver.DriverSetup.driver;
import static it.academy.andrey.ponomarev.garfield.project.user.UserData.*;

public class CartTest extends CartPage {
    CartPage cardPage = new CartPage();
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
        Assertions.assertEquals(CHECK_PRISE, checkPrise());
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
