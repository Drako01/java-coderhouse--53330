package com.coder.house.ventas.online.ventasonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coder.house.ventas.online.ventasonline.entidad.Cliente;
import com.coder.house.ventas.online.ventasonline.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		return this.clienteRepository.findAll();
	}

	public Cliente save(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	public Cliente findById(Integer id) {
		
		var opCliente =  this.clienteRepository.findById(id);
		if (opCliente.isPresent()) {
			return opCliente.get();
		} else {
			return new Cliente();
		}
	}
	
}
