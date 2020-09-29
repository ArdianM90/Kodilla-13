package com.kodilla.good.patterns.challenges.second;

import com.kodilla.good.patterns.challenges.second.interfaces.InformationService;
import com.kodilla.good.patterns.challenges.second.interfaces.OrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(final ProductOrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(),true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
