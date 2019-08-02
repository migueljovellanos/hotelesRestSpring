package com.hoteles.dao;

import java.util.List;

import com.hoteles.dao.entitys.Cliente;

public interface ClienteDao {
	
	public boolean insertCliente(Cliente cliente);
	
	public Cliente getCliente(String dniCliente);
	
	public List<Cliente> getAllClientes();
	
	public boolean deleteCliente(String dniCliente);
	
	public boolean updateCliente(Cliente cliente);
	
}
