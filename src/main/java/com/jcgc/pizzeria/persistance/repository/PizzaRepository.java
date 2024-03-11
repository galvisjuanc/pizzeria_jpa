package com.jcgc.pizzeria.persistance.repository;

import com.jcgc.pizzeria.persistance.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
}
