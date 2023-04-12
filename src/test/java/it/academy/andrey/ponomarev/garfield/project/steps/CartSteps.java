package it.academy.andrey.ponomarev.garfield.project.steps;

import it.academy.andrey.ponomarev.garfield.project.pages.CartPage;

import static it.academy.andrey.ponomarev.garfield.project.user.UserData.PRODUCT;

public class CartSteps extends CartPage {
    public static void putOrderToCart() {
        new CartPage()
                .orderAddCart(PRODUCT)
                .addCart();
    }
    public static void putOrderToCardAndIncreaseCount() {
        new CartPage()
                .orderAddCart(PRODUCT)
                .addCart()
                .increaseCount();
    }
    public static void putOrderToCartAndDelete() {
        new CartPage()
                .orderAddCart(PRODUCT)
                .addCart()
                .deleteProduct();
    }
}
