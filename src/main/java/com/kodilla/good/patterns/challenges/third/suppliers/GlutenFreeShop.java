package com.kodilla.good.patterns.challenges.third.suppliers;

import com.kodilla.good.patterns.challenges.third.FoodOrderDto;
import com.kodilla.good.patterns.challenges.third.FoodProduct;
import com.kodilla.good.patterns.challenges.third.Supplier;

public class GlutenFreeShop implements Supplier {
    private final String supplierId = "GlutenFreeShop";

    @Override
    public void process(FoodProduct product, int quantity) {
        System.out.println("Realizacja zamówienia na "+quantity+" szt. "+product.getProductId()+", w sposób specyficzny dla sklepu GlutenFreeShop");
    }

    public String getSupplierId() {
        return supplierId;
    }
}
