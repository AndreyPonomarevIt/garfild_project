package it.academy.andrey.ponomarev.garfield.project.tests.ui;

import it.academy.andrey.ponomarev.garfield.project.pages.CartPage;
import it.academy.andrey.ponomarev.garfield.project.steps.CartSteps;
import org.junit.jupiter.api.*;

import static it.academy.andrey.ponomarev.garfield.project.user.UserData.*;

public class CartTest extends BaseTest  {
    CartPage cardPage = new CartPage();

    @Test
    @DisplayName("Добавление выбранного продукта в корзину")
    public void testOrderProduct() {
        CartSteps.putOrderToCart();
        Assertions.assertEquals(PRODUCT, cardPage.getProductInCart());
    }

    @Test
    @DisplayName("Добавление выбранного продукта в корзину и увеличение его количества")
    public void testOrderProductWithCardAddCount() {
        CartSteps.putOrderToCardAndIncreaseCount();
        Assertions.assertEquals(CHECK_PRISE, cardPage.getPrise());
    }

    @Test
    @DisplayName("Добавление выбранного продукта в корзину c последующим удалением из нее")
    public void testOrderProductWithCardAndDelete() {
        CartSteps.putOrderToCartAndDelete();
        Assertions.assertEquals(TEXT_LOGO_DELETE_FROM_CARD, cardPage.getDeleteFromCart());
    }

}
