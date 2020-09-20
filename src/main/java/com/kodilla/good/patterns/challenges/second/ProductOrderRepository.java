package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.OrderRepository;

public class ProductOrderRepository implements OrderRepository {
    public void createOrder(User user, Product product, int quantity) {
        System.out.println("Zamówienie użytkownika "+user.getName()+" "+user.getSurname()+" na "+quantity+" szt. produktu "+product.getName()+" zostało wysłane.");
    }
}
