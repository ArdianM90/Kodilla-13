package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.OrderService;

public class ProductOrderService implements OrderService {
    private final ProductOrderRepository productOrderRepository = new ProductOrderRepository();

    public boolean order(final User user, final Product product, final int quantity) {
        if (productOrderRepository.createOrder(user, product, quantity)) {
            System.out.println("Użytkownik "+user.getName()+" złożył zamówienie na "+quantity+" szt. "+product.getName());
            return true;
        } else {
            System.out.println("Błąd podczas zapisywania zamównienia. Spróbuj ponownie.");
            return false;
        }
    }
}
