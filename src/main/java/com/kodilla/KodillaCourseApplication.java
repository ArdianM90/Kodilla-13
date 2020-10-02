package com.kodilla;

import com.kodilla.good.patterns.challenges.first.MovieStore;
import com.kodilla.good.patterns.challenges.second.*;
import com.kodilla.good.patterns.challenges.third.Food2DoorProcessor;
import com.kodilla.good.patterns.challenges.third.Food2DoorRequest;
import com.kodilla.good.patterns.challenges.third.FoodProduct;
import com.kodilla.good.patterns.challenges.third.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.third.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.third.suppliers.HealthyShop;
import com.kodilla.good.patterns.challenges.third.suppliers.Supplier;

import java.util.ArrayList;
import java.util.List;

public class KodillaCourseApplication {
    public static void main(String[] args) {
        //===13.1 Zadanie: funkcyjna iteracja po tytułach
        System.out.println();
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore);
        //===13.2 Zadanie: stworzenie serwisu zamówień produktów
        System.out.println();
        ProductOrderRequest newRequest = new ProductOrderRequest(
                new User("Ardian", "Mienkovsky"),
                new Product("Klapki", 15),
                30, "Allegro");
        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService());
        orderProcessor.process(newRequest);
        //===13.4 Przełożenie teorii na praktykę cz.1
        System.out.println();

        FoodProduct firstProduct = new FoodProduct("Frytki", 15);
        FoodProduct secondProduct = new FoodProduct("Kiełbasa", 10);
        FoodProduct thirdProduct = new FoodProduct("Mleko", 5);
        FoodProduct fourthProduct = new FoodProduct("Jajka", 9);
        FoodProduct fifthProduct = new FoodProduct("Chleb", 3);
        FoodProduct sixthProduct = new FoodProduct("Szpinak", 3);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();
        extraFoodShop.addAvailableProduct(firstProduct);
        extraFoodShop.addAvailableProduct(secondProduct);
        extraFoodShop.addAvailableProduct(fifthProduct);
        glutenFreeShop.addAvailableProduct(fifthProduct);
        glutenFreeShop.addAvailableProduct(sixthProduct);
        healthyShop.addAvailableProduct(secondProduct);
        healthyShop.addAvailableProduct(thirdProduct);
        healthyShop.addAvailableProduct(fourthProduct);
        healthyShop.addAvailableProduct(fifthProduct);

        List<Supplier> suppliersList = new ArrayList<>();
        suppliersList.add(extraFoodShop);
        suppliersList.add(glutenFreeShop);
        suppliersList.add(healthyShop);

        Food2DoorRequest newFoodRequest = new Food2DoorRequest();
        newFoodRequest.addToOrder(firstProduct, 2);
        newFoodRequest.addToOrder(secondProduct, 2);
        newFoodRequest.addToOrder(fifthProduct, 14);
        newFoodRequest.addToOrder(sixthProduct, 8);

        Food2DoorProcessor foodProcessor = new Food2DoorProcessor(suppliersList);
        foodProcessor.process(newFoodRequest);
        //===13.4 Przełożenie teorii na praktykę cz.2
        System.out.println();
    }
}
