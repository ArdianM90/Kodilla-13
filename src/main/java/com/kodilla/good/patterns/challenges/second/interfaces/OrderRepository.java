package com.kodilla.good.patterns.challenges.second.interfaces;

import com.kodilla.good.patterns.challenges.second.Product;
import com.kodilla.good.patterns.challenges.second.User;

public interface OrderRepository {
    boolean createOrder(User user, Product product, int quantity);
}
