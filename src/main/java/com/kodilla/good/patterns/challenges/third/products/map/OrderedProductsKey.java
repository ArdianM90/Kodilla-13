package com.kodilla.good.patterns.challenges.third.products.map;

public class OrderedProductsKey {
    private final String productName;
    private final int productQuantity;
    public OrderedProductsKey(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }
}
