package com.kodilla.good.patterns.challenges.third.suppliers;

import com.kodilla.good.patterns.challenges.third.FoodProduct;
import com.kodilla.good.patterns.challenges.third.Supplier;

public class ExtraFoodShop implements Supplier {
    private final String supplierId = "ExtraFoodShop";

    @Override
    public void process(FoodProduct product, int quantity) { //dodac identyfikator producenta do produktu, klient nie decyduje o dostawcy
        System.out.println("Realizacja zamówienia na "+quantity+" szt. "+product.getProductId()+", w sposób specyficzny dla sklepu ExtraFoodShop");
    }

    public String getSupplierId() {
        return supplierId;
    }
}
