package com.idat.EFjoaquinroque.cliente.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.idat.EFjoaquinroque.cliente.entity.ClientePizza;

@Repository
public interface ClientePizzaRepository extends CrudRepository<ClientePizza, Integer>{

}
