package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.OrderRequest;


public class ProductOrderRequest implements OrderRequest {
    public ProductOrderRequest(User user, Product product, int quantity, String from) {
        this.user = user;
        this.product = product;
        this.quantity = 15;
        this.from = from;
    }

    private final User user;
    private final Product product;
    private final int quantity;
    private final String from;

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
