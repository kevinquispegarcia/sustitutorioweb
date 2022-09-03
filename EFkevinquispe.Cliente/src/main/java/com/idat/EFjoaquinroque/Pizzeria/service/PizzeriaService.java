package com.idat.EFjoaquinroque.Pizzeria.service;

import java.util.List;

import com.idat.EFjoaquinroque.Pizzeria.entity.Pizzeria;

public interface PizzeriaService {
	
	List<Pizzeria> listarPizzeria();
	Pizzeria pizzeriaPorId(Integer id);
	void eliminarPizzeriaId(Integer id);
	void guardarPizzeria(Pizzeria pizzeria);
}
