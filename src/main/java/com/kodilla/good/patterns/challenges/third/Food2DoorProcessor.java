package com.kodilla.good.patterns.challenges.third;

import com.kodilla.good.patterns.challenges.third.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.third.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.third.suppliers.HealthyShop;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorProcessor {
    public void process(Food2DoorRequest newFoodRequest) {
        final List<Supplier> suppliersList = new ArrayList<>();
        suppliersList.add(new ExtraFoodShop());
        suppliersList.add(new GlutenFreeShop());
        suppliersList.add(new HealthyShop());
        String expectedSupplier = newFoodRequest.getSupplierId();
        Supplier mySupplier = suppliersList.stream().filter(e -> e.getSupplierId().equals(expectedSupplier)).findAny().get();
        mySupplier.process(newFoodRequest.getFoodProduct(), newFoodRequest.getQuantity());
    }
}
