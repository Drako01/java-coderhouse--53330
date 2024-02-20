package com.coder.house.ventas.online.ventasonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coder.house.ventas.online.ventasonline.entidad.Producto;
import com.coder.house.ventas.online.ventasonline.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> findAll() {
		return this.productoRepository.findAll();
	}

	public Producto save(Producto cliente) {
		return this.productoRepository.save(cliente);
	}

	public Producto findById(Integer id) {
		
		var opCliente =  this.productoRepository.findById(id);
		if (opCliente.isPresent()) {
			return opCliente.get();
		} else {
			return new Producto();
		}
	}
	
}
