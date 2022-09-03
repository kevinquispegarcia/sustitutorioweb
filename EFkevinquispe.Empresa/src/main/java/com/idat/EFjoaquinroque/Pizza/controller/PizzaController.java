package com.idat.EFjoaquinroque.Pizza.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFjoaquinroque.Pizza.service.*;
import com.idat.EFjoaquinroque.Pizza.entity.Pizza;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
	
	private PizzaService service;
	
	@GetMapping("/all")
	public @ResponseBody List<Pizza> listarPizza(){
		return service.listarPizza();
	}	
	

	@GetMapping("/{id}")
	public @ResponseBody  Pizza ObtenerPizzaId(@PathVariable Integer id) {
		return service.pizzaPorId(id);
		
	}
	@DeleteMapping("/{id}")
	public void EliminarPizza(@PathVariable Integer id) {
		 service.eliminarPizzaId(id);
		
	}
	@PostMapping("/")
	public void GuardarPizza(@RequestBody Pizza pizza) {
		service.guardarPizza(pizza);
	}
}
