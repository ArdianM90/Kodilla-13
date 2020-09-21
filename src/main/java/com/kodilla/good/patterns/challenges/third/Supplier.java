package com.kodilla.good.patterns.challenges.third;

public interface Supplier {
    void process(FoodProduct product, int quantity);

    String getSupplierId();
}
