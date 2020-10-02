package com.kodilla.good.patterns.challenges.third.suppliers;

import com.kodilla.good.patterns.challenges.third.FoodProduct;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    protected String supplierName;
    protected final List<FoodProduct> availableProducts = new ArrayList<>();

    public void process(FoodProduct product, int quantity) {
        System.out.println("To powinno być nadpisane");
    };

    public void addAvailableProduct(FoodProduct newProduct) {
        availableProducts.add(newProduct);
    }

    public boolean canDeliver(String name) {
        return availableProducts.stream().anyMatch(e -> e.getProductName().equals(name));
    }

    public int howManyCanDeliverFromList(List<String> orderedProducts) {
        int counter = 0;
        for (int i = 0; i < availableProducts.size(); i++) {
            String productFromSupplierList = availableProducts.get(i).getProductName();
            for (int j = 0; j < orderedProducts.size(); j++) {
                String productFromOrderList = orderedProducts.get(j);
                if (productFromSupplierList.equals(productFromOrderList)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
