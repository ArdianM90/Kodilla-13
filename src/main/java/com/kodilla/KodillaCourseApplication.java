package com.kodilla;

import com.kodilla.good.patterns.challenges.first.MovieStore;
import com.kodilla.good.patterns.challenges.fourth.Airport;
import com.kodilla.good.patterns.challenges.fourth.FindFlightService;
import com.kodilla.good.patterns.challenges.fourth.Flight;
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
        //===13.5 Przełożenie teorii na praktykę cz.2
        Airport airportWaw = new Airport("Warszawa", "WAW");
        Airport airportWmi = new Airport("Modlin", "WMI");
        Airport airportWro = new Airport("Wroclaw", "WRO");
        Airport airportPoz = new Airport("Poznan", "POZ");
        Airport airportKrk = new Airport("Krakow", "KRK");
        Airport airportKtw = new Airport("Katowice", "KTW");

        FindFlightService myService = new FindFlightService();
        List<Airport> through = new ArrayList<>();
        through.add(airportWmi);
        myService.addFlight(airportWaw, airportKrk, null);
        myService.addFlight(airportKrk, airportWaw, null);
        myService.addFlight(airportWaw, airportWro, null);
        myService.addFlight(airportWro, airportWaw, null);
        myService.addFlight(airportWaw, airportKtw, through);
        myService.addFlight(airportKtw, airportWaw, through);
        myService.addFlight(airportWaw, airportPoz, through);
        myService.addFlight(airportPoz, airportWaw, through);

        myService.findAllFlightsFrom(airportWaw);
        System.out.println();
        myService.findAllFlightsTo(airportKrk);
        System.out.println();
        myService.findAllFlightsFromWithStopover(airportWaw, through);
        System.out.println();
        myService.findAllFlightsToWithStopover(airportWaw, through);
    }
}
