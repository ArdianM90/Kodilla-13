package com.kodilla.good.patterns.challenges.third;

import java.util.Objects;

public class FoodProduct {
    private final String productName;
    private final int price;

    public FoodProduct(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        FoodProduct that = (FoodProduct) o;
        return price == that.price &&
                Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price);
    }
}
