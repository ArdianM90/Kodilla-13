package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.OrderService;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final Product product, final int quantity) {
        System.out.println("Użytkownik "+user.getName()+" złożył zamówienie na "+quantity+" szt. "+product.getName());
        return true;
    }
}
