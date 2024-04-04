package com.jcgc.pizzeria.service;

import com.jcgc.pizzeria.persistance.entity.OrderEntity;
import com.jcgc.pizzeria.persistance.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getAll() {
        List<OrderEntity> orderEntities = this.orderRepository.findAll();
        orderEntities.forEach(o -> System.out.println(o.getCustomer().getName()));
        return orderEntities;
    }

    public List<OrderEntity> getTodayOrders() {
        LocalDateTime today = LocalDate.now().atTime(0,0);
        return this.orderRepository.findAllByDateAfter(today);
    }

}
