package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.OrderRequest;

public class ProductOrderRequest implements OrderRequest {
    private final User user = new User("Ardian", "Mienkovsky");
    private final Product product = new Product("Klapki", 15);
    private final int quantity = 15;
    private final String from = "Allegro";

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFrom() {
        return from;
    }
}
