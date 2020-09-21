package com.kodilla.good.patterns.challenges.third.suppliers;

import com.kodilla.good.patterns.challenges.third.FoodProduct;
import com.kodilla.good.patterns.challenges.third.Supplier;

public class HealthyShop implements Supplier {
    private final String supplierId = "HealthyShop";

    @Override
    public void process(FoodProduct product, int quantity) {
        System.out.println("Realizacja zamówienia na "+quantity+" szt. "+product.getProductId()+", w sposób specyficzny dla sklepu HealthyShop");
    }

    public String getSupplierId() {
        return supplierId;
    }
}
