package com.kodilla.good.patterns.challenges.service;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService , final OrderService orderService , final OrderRepository orderRepository){
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrder = orderService.order(orderRequest.getUser() , orderRequest.getOrderDay() , orderRequest.getProduct());
        if(isOrder){
            informationService.inform(orderRequest);
            orderRepository.createOrder(orderRequest.getUser() , orderRequest.getOrderDay(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        }else{
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
