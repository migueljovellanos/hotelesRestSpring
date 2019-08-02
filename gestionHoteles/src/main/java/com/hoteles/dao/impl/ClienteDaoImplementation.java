package com.hoteles.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hoteles.dao.ClienteDao;
import com.hoteles.dao.entitys.Cliente;
import com.hoteles.dao.mappers.ClienteMapper;

@Component
public class ClienteDaoImplementation implements ClienteDao{

	@Autowired
	ClienteMapper mapper;

	@Override
	public boolean insertCliente(Cliente cliente) {
		boolean isAdded = mapper.insertCliente(cliente) > 0;
		return isAdded;
	}

	@Override
	public Cliente getCliente(String dniCliente) {
		Cliente cliente = mapper.getCliente(dniCliente);
		return cliente;
	}

	@Override
	public List<Cliente> getAllClientes() {
		List<Cliente> clientes = mapper.getAllClientes();
		return clientes;
	}

	@Override
	public boolean deleteCliente(String dniCliente) {
		boolean isDeleted = mapper.deleteCliente(dniCliente) > 0;
		return isDeleted;
	}

	@Override
	public boolean updateCliente(Cliente cliente) {
		boolean isUpdated = mapper.updateCliente(cliente) > 0;
		return isUpdated;
	}
	
}
