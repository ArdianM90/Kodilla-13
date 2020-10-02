package com.kodilla.good.patterns.challenges.third;

import com.kodilla.good.patterns.challenges.third.suppliers.Supplier;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorProcessor {
    private final List<Supplier> suppliersList;

    public Food2DoorProcessor(List<Supplier> suppliersList) {
        this.suppliersList = suppliersList;
    }

    public void process(Food2DoorRequest newFoodRequest) {
        List<Supplier> supplierForEachProduct = computeSuppliersList(newFoodRequest.getProductsNames());
        for (int i = 0; i < supplierForEachProduct.size(); i++) {
            FoodProduct product = newFoodRequest.getProductsList().get(i);
            int quantity = newFoodRequest.getProductsQuantities().get(i);
            supplierForEachProduct.get(i).process(product, quantity);
        }
    }

    private List<Supplier> computeSuppliersList(List<String> productsWithoutSupplier) {
        int exitArraySize = productsWithoutSupplier.size();
        List<Supplier> supplierForEachProduct = setListNull(exitArraySize);
        while (supplierForEachProduct.contains(null)) {
            Supplier mostEffectiveSupplier = findMostEfficientSupplier(productsWithoutSupplier);
            for (int j = 0; j < exitArraySize; j++) {
                if (mostEffectiveSupplier.canDeliver(productsWithoutSupplier.get(j))) {
                    supplierForEachProduct.set(j, mostEffectiveSupplier);
                    productsWithoutSupplier.set(j, null);
                }
            }
        }
        return supplierForEachProduct;
    }

    private List<Supplier> setListNull(int size) {
        List<Supplier> exitList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            exitList.add(i, null);
        }
        return exitList;
    }

    private Supplier findMostEfficientSupplier(List<String> orderedProductsList) {
        int[] suppPossibilities = new int[suppliersList.size()];
        for (int i = 0; i < suppliersList.size(); i++) {
            suppPossibilities[i] = suppliersList.get(i).howManyCanDeliverFromList(orderedProductsList);
        }
        int maxPossibilitiesIndex  = getIndexOfLargest(suppPossibilities);
        return suppliersList.get(maxPossibilitiesIndex);
    }

    private int getIndexOfLargest(int[] array) {
        if (array == null || array.length == 0 ) return -1;
        int largest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest] ) {
                largest = i;
            }
        }
        return largest;
    }
}
