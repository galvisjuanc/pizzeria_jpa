package com.jcgc.pizzeria.persistance.audit;

import com.jcgc.pizzeria.persistance.entity.PizzaEntity;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PreRemove;
import lombok.ToString;

@ToString
public class AuditPizzaListener {

    @PostPersist
    @PostUpdate
    public void onPostPersist(PizzaEntity pizzaEntity) {
        System.out.println(pizzaEntity.toString());
    }

    @PreRemove
    public void onPreDelete(PizzaEntity pizzaEntity) {
        System.out.println(pizzaEntity.toString());
    }
}
