package com.hoteles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hoteles.dao.ClienteDao;
import com.hoteles.dao.entitys.Cliente;


@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
	
	@Autowired
	ClienteDao clienteDao;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> getAll() {
		List<Cliente> clientes = clienteDao.getAllClientes();
		ResponseEntity<List<Cliente>> respuesta = new ResponseEntity<>(clientes, HttpStatus.OK);
		return respuesta;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getCliente")
	public ResponseEntity<Cliente> getByDNI(@RequestParam String dniCliente) {
		Cliente cliente = clienteDao.getCliente(dniCliente);
		ResponseEntity<Cliente> respuesta = new ResponseEntity<>(cliente, HttpStatus.OK);
		return respuesta;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/addCliente")
	public ResponseEntity<String> addCliente(@RequestBody Cliente cliente) {
		boolean isAdded = clienteDao.insertCliente(cliente);
		ResponseEntity<String> respuesta = null;
		if (isAdded) {
			respuesta = ResponseEntity.ok("Inserted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Inserted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteCliente")
	public ResponseEntity<String> deleteCliente(@RequestBody String dniCliente) {
		boolean idDeleted = clienteDao.deleteCliente(dniCliente);
		ResponseEntity<String> respuesta = null;
		if (idDeleted) {
			respuesta = ResponseEntity.ok("Deleted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Deleted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateCliente")
	public ResponseEntity<String> updateCliente(@RequestBody Cliente cliente) {
		boolean isUpdated = clienteDao.updateCliente(cliente);
		ResponseEntity<String> respuesta = null;
		if (isUpdated) {
			respuesta = ResponseEntity.ok("Updated Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Updated Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}
	
}
