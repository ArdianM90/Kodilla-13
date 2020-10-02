package com.kodilla.good.patterns.challenges.third.suppliers;

import com.kodilla.good.patterns.challenges.third.FoodProduct;

public class GlutenFreeShop extends Supplier {
    public GlutenFreeShop() {
        supplierName = "GlutenFreeShop";
    }

    @Override
    public void process(FoodProduct product, int quantity) {
        System.out.println("Realizacja zamówienia na "+quantity+" szt. "+product.getName()+", w sposób specyficzny dla sklepu GlutenFreeShop");
    }
}
