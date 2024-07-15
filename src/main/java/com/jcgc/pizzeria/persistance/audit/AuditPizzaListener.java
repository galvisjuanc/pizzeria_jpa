package com.jcgc.pizzeria.persistance.audit;

import com.jcgc.pizzeria.persistance.entity.PizzaEntity;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PreRemove;
import lombok.ToString;
import org.springframework.util.SerializationUtils;

@ToString
public class AuditPizzaListener {

    private PizzaEntity currentValue;

    @PostLoad
    public void postLoad(PizzaEntity pizzaEntity) {
        System.out.println("Post Load");
        this.currentValue = SerializationUtils.clone(pizzaEntity);
    }

    @PostPersist
    @PostUpdate
    public void onPostPersist(PizzaEntity pizzaEntity) {
        System.out.println("Post Persist or Update");
        System.out.println("Old Value: " + this.currentValue.toString());
        System.out.println("New Value: " + pizzaEntity.toString());
    }

    @PreRemove
    public void onPreDelete(PizzaEntity pizzaEntity) {
        System.out.println(pizzaEntity.toString());
    }
}
