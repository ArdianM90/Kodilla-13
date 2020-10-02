package com.kodilla.good.patterns.challenges.third.products.map;

import com.kodilla.good.patterns.challenges.third.FoodProduct;

public class OrderedProductValue {
    private final FoodProduct product;
    private final int quantity;

    public OrderedProductValue(FoodProduct product, int quantity) {
        this.product = product;
        this.quantity= quantity;
    }

    public String getName() {
        return product.getName();
    }

    public int getPrice() {
        return product.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public FoodProduct getProduct() {
        return product;
    }
}
