package com.kodilla.good.patterns.challenges.second.interfaces;

import com.kodilla.good.patterns.challenges.second.Product;
import com.kodilla.good.patterns.challenges.second.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.second.User;

public interface OrderService {
    boolean order(User user, Product product, int quantity);
}
