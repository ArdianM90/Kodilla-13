package com.kodilla.good.patterns.challenges.third.products.map;

import com.kodilla.good.patterns.challenges.third.FoodProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderedProducts {
    private final Map<OrderedProductsKey, OrderedProductValue> orderedProducts = new HashMap<>();

    public void add(FoodProduct product, int quantity) {
        OrderedProductsKey newKey = new OrderedProductsKey(product.getName(), quantity);
        OrderedProductValue newValue = new OrderedProductValue(product, quantity);
        orderedProducts.put(newKey, newValue);
    }

    public List<String> getProductsNamesList() {
        List<String> names = new ArrayList<>();
        orderedProducts.values().forEach(e -> names.add(e.getName()));
        return names;
    }

    public List<Integer> getProductsPriceList() {
        List<Integer> priceList = new ArrayList<>();
        orderedProducts.values().forEach(e -> priceList.add(e.getPrice()));
        return priceList;
    }

    public List<Integer> getProductsQuantitiesList() {
        List<Integer> quantities = new ArrayList<>();
        orderedProducts.values().forEach(e -> quantities.add(e.getQuantity()));
        return quantities;
    }

    public List<FoodProduct> getProductsList() {
        List<FoodProduct> products = new ArrayList<>();
        orderedProducts.values().forEach(e -> products.add(e.getProduct()));
        return products;
    }
}
