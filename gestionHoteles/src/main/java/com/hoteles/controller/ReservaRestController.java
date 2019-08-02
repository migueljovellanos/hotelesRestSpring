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

import com.hoteles.dao.ReservaDao;
import com.hoteles.dao.entitys.Reserva;

@RestController
@RequestMapping("/reserva")
public class ReservaRestController {
	
	@Autowired
	ReservaDao reservaDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Reserva>> getAll(){
		List<Reserva> reservas = reservaDao.getAllReservas();
		ResponseEntity<List<Reserva>> respuesta = new ResponseEntity<>(reservas, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getReserva")
	public ResponseEntity<Reserva> getByID(@RequestParam int id){
		Reserva reserva = reservaDao.getReserva(id);
		ResponseEntity<Reserva> respuesta = new ResponseEntity<>(reserva, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/addReserva")
	public ResponseEntity<String> addReserva(@RequestBody Reserva reserva) {
		boolean isAdded = reservaDao.insertReserva(reserva);
		ResponseEntity<String> respuesta = null;
		if (isAdded) {
			respuesta = ResponseEntity.ok("Inserted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Inserted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteReserva")
	public ResponseEntity<String> deleteReserva(@RequestBody int id) {
		boolean idDeleted = reservaDao.deleteReserva(id);
		ResponseEntity<String> respuesta = null;
		if (idDeleted) {
			respuesta = ResponseEntity.ok("Deleted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Deleted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateReserva")
	public ResponseEntity<String> updateReserva(@RequestBody Reserva reserva) {
		boolean isUpdated = reservaDao.updateReserva(reserva);
		ResponseEntity<String> respuesta = null;
		if (isUpdated) {
			respuesta = ResponseEntity.ok("Updated Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Updated Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}


}
