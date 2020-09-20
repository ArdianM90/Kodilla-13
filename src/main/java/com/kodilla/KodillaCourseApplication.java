package com.kodilla;

import com.kodilla.good.patterns.challenges.second.*;

public class KodillaCourseApplication {
    public static void main(String[] args) {
        //===13.1 Zadanie: funkcyjna iteracja po tytułach
//        MovieStore movieStore = new MovieStore();
//        System.out.println(movieStore);
        //===13.2 Zadanie: stworzenie serwisu zamówień produktów
        ProductOrderRequest newRequest = new ProductOrderRequest();
        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(newRequest);
    }
}
