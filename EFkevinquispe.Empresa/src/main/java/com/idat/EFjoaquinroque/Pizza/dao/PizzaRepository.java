package com.idat.EFjoaquinroque.Pizza.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFjoaquinroque.Pizza.entity.Pizza;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Integer>{


}
