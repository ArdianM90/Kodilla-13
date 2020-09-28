package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.InformationService;
import com.kodilla.good.patterns.challenges.second.interfaces.OrderRepository;
import com.kodilla.good.patterns.challenges.second.interfaces.OrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final ProductOrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser()); //orderRepository powinien byc skladnikiem orderService
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity()); //co gry orderRep sie wywali
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(),true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
