package garfield.tests.ui;

import garfield.pages.CardPage;
import garfield.user.UserData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import static garfield.driver.DriverSetup.driver;
import static garfield.locators.Locators.*;
import static garfield.user.UserData.PRODUCT;
import static garfield.user.UserData.TEXT_LOGO_DELETE_FROM_CARD;

public class CardTest extends LoginTest {
    @Test
    @DisplayName("Добавление выбранного продукта в корзину")
    public void testOrderProduct() {
        CardPage cardPage = new CardPage();
        cardPage.orderAddCard(driver, PRODUCT);
        cardPage.addCard(driver);
        WebElement logoCardCompare = driver.findElement(LOGO_CARD_COMPARE);
        Assertions.assertEquals(PRODUCT, logoCardCompare.getText());
    }

    @Test
    @DisplayName("Добавление выбранного продукта в корзину и увеличение его количества")
    public void testOrderProductWithCardAddCount() {
        CardPage cardPage = new CardPage();
        cardPage.orderAddCard(driver, PRODUCT);
        cardPage.addCard(driver);
        cardPage.increaseCount(driver);
        WebElement checkLogoPrice = driver.findElement(CHECK_LOGO_PRISE);
        Assertions.assertEquals(UserData.CHECK_PRISE, checkLogoPrice.getText());
    }

    @Test
    @DisplayName("Добавление выбранного продукта в корзину c последующим удалением из нее")
    public void testOrderProductWithCardAndDelete() {
        CardPage cardPage = new CardPage();
        cardPage.orderAddCard(driver, PRODUCT);
        cardPage.addCard(driver);
        cardPage.deleteProduct(driver);
        WebElement checkLogoDeleteFromCard = driver.findElement(CHECK_LOGO_DELETE_FROM_CARD);
        Assertions.assertEquals(TEXT_LOGO_DELETE_FROM_CARD, checkLogoDeleteFromCard.getText());
    }

}
