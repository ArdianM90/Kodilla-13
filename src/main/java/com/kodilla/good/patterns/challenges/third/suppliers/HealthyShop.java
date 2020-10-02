package com.kodilla.good.patterns.challenges.third.suppliers;

import com.kodilla.good.patterns.challenges.third.FoodProduct;

public class HealthyShop extends Supplier {
    public HealthyShop() {
        supplierName = "HealthyShop";
    }

    @Override
    public void process(FoodProduct product, int quantity) {
        System.out.println("Realizacja zamówienia na "+quantity+" szt. "+product.getProductName()+", w sposób specyficzny dla sklepu HealthyShop");
    }
}
