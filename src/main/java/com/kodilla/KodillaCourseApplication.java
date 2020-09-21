package com.kodilla;

import com.kodilla.good.patterns.challenges.first.MovieStore;
import com.kodilla.good.patterns.challenges.second.*;
import com.kodilla.good.patterns.challenges.third.Food2DoorProcessor;
import com.kodilla.good.patterns.challenges.third.Food2DoorRequest;
import com.kodilla.good.patterns.challenges.third.FoodProduct;

public class KodillaCourseApplication {
    public static void main(String[] args) {
        //===13.1 Zadanie: funkcyjna iteracja po tytułach
        System.out.println();
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore);
        //===13.2 Zadanie: stworzenie serwisu zamówień produktów
        System.out.println();
        ProductOrderRequest newRequest = new ProductOrderRequest();
        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(newRequest);
        //===13.4 Przełożenie teorii na praktykę cz.1
        System.out.println();
        String supplierId = "ExtraFoodShop";
        FoodProduct sampleProduct = new FoodProduct();
        int quantity = 15;
        Food2DoorRequest newFoodRequest = new Food2DoorRequest(supplierId, sampleProduct, quantity);
        Food2DoorProcessor foodProcessor = new Food2DoorProcessor();
        foodProcessor.process(newFoodRequest);
    }
}
