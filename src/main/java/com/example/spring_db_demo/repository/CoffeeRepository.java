package com.example.spring_db_demo.repository;

import com.example.spring_db_demo.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
