package com.idat.EFjoaquinroque.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.idat.EFjoaquinroque.cliente.dao.ClienteRepository;
import com.idat.EFjoaquinroque.cliente.Client.OpenFeignClient;
import com.idat.EFjoaquinroque.cliente.dao.ClientePizzaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.idat.EFjoaquinroque.cliente.dao.Pizza;

import com.idat.EFjoaquinroque.cliente.entity.Cliente;
import com.idat.EFjoaquinroque.cliente.entity.ClientePizza;
import com.idat.EFjoaquinroque.cliente.entity.ClientePizzaFK;

@Service
public class ClienteServiceImple implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private ClientePizzaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> listarCliente() {
		
		return (List<Cliente>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente clientePorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void eliminarClienteId(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);

	}
	
	@Override
	public void asignarClientePizza() {
	
		List<Pizza> listado=feign.ListarPizza();
		ClientePizzaFK fk=null;
		
		for(Pizza pizza : listado) {
			 fk= new ClientePizzaFK();
			fk.setIdCliente(pizza.getIdPizza());
			fk.setIdPizza(1);
			
			ClientePizza detalle= new ClientePizza();
			detalle.setFk(fk);
			repositoryDetalle.save(detalle);
		}
		
	
		
		

	}
	
	


}
