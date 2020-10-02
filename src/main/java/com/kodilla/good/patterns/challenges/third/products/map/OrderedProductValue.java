package com.kodilla.good.patterns.challenges.third.products.map;

public class OrderedProductValue {
    private final String name;
    private final int price;
    private final int quantity;

    public OrderedProductValue(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity= quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}