package com.kodilla.good.patterns.challenges.third;

public class Food2DoorRequest {
    private String supplierId = "ExtraFoodShop";
    private FoodProduct foodProduct = new FoodProduct();
    private int quantity = 4;

    public Food2DoorRequest(String supplierId, FoodProduct foodProduct, int quantity) {
        this.supplierId = supplierId;
        this.foodProduct = foodProduct;
        this.quantity = quantity;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public FoodProduct getFoodProduct() {
        return foodProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}
