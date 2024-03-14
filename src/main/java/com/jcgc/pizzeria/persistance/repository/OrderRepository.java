package com.jcgc.pizzeria.persistance.repository;

import com.jcgc.pizzeria.persistance.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
