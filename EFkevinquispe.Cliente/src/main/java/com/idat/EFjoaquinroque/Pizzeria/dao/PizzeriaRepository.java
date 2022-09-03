package com.idat.EFjoaquinroque.Pizzeria.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFjoaquinroque.Pizzeria.entity.Pizzeria;

@Repository
public interface PizzeriaRepository extends CrudRepository<Pizzeria, Integer> {

}
