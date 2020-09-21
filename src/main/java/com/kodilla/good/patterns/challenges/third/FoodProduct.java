package com.kodilla.good.patterns.challenges.third;

public class FoodProduct {
    private final String productId = "Frytki";
    private final int price = 15;
    private boolean isAvailable = true;

    public String getProductId() {
        return productId;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
