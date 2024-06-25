package com.jcgc.pizzeria.persistance.repository;

import com.jcgc.pizzeria.persistance.entity.PizzaEntity;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface PizzaPagSortRepository extends ListPagingAndSortingRepository<PizzaEntity, Integer> {
}
