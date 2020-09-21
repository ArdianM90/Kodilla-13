package com.kodilla.good.patterns.challenges.third;

public class FoodOrderDto {
    private final FoodProduct product;
    private final int quantity;
    public FoodOrderDto(FoodProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
