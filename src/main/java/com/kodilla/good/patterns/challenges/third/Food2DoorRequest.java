package com.kodilla.good.patterns.challenges.third;

import com.kodilla.good.patterns.challenges.third.products.map.OrderedProducts;

import java.util.List;

public class Food2DoorRequest {
    private final OrderedProducts orderedProducts = new OrderedProducts();

    public void addToOrder(FoodProduct product, int quantity) {
        orderedProducts.add(product, quantity);
    }

    public List<String> getProductsNames() {
        return orderedProducts.getProductsNamesList();
    }

    public List<Integer> getProductsPriceList() {
        return orderedProducts.getProductsPriceList();
    }

    public List<Integer> getProductsQuantities() {
        return orderedProducts.getProductsQuantitiesList();
    }

    public List<FoodProduct> getProductsList() {
        return orderedProducts.getProductsList();
    }
}
