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

import com.hoteles.dao.ConsumoDao;
import com.hoteles.dao.entitys.Consumo;


@RestController
@RequestMapping("/consumo")
public class ConsumoRestController {
	
	@Autowired
	ConsumoDao consumoDao;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Consumo>> getAll() {
		List<Consumo> consumos = consumoDao.getAllConsumos();
		ResponseEntity<List<Consumo>> respuesta = new ResponseEntity<>(consumos, HttpStatus.OK);
		return respuesta;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getConsumo")
	public ResponseEntity<Consumo> getByID(@RequestParam int id) {
		Consumo consumo = consumoDao.getConsumo(id);
		ResponseEntity<Consumo> respuesta = new ResponseEntity<>(consumo, HttpStatus.OK);
		return respuesta;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/addConsumo")
	public ResponseEntity<String> addHotel(@RequestBody Consumo consumo) {
		boolean isAdded = consumoDao.insertConsumo(consumo);
		ResponseEntity<String> respuesta = null;
		if (isAdded) {
			respuesta = ResponseEntity.ok("Inserted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Inserted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteConsumo")
	public ResponseEntity<String> deleteConsumo(@RequestBody int id) {
		boolean idDeleted = consumoDao.deleteConsumo(id);
		ResponseEntity<String> respuesta = null;
		if (idDeleted) {
			respuesta = ResponseEntity.ok("Deleted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Deleted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateConsumo")
	public ResponseEntity<String> updateConsumo(@RequestBody Consumo consumo) {
		boolean isUpdated = consumoDao.updateConsumo(consumo);
		ResponseEntity<String> respuesta = null;
		if (isUpdated) {
			respuesta = ResponseEntity.ok("Updated Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Updated Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

}
