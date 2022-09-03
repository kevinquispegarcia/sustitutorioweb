package com.idat.EFjoaquinroque.cliente.Client;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.idat.EFjoaquinroque.cliente.dao.Pizza;


@FeignClient(name="Microservicio-Pizza",url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/pizza/all")
	public List<Pizza> ListarPizza();
	

}
