package com.jcgc.pizzeria.persistance.repository;

import com.jcgc.pizzeria.persistance.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
