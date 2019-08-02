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

import com.hoteles.dao.HabitacionDao;
import com.hoteles.dao.entitys.Habitacion;

@RestController
@RequestMapping("/habitacion")
public class HabitacionRestController {
	
	@Autowired
	HabitacionDao habitacionDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Habitacion>> getAll(){
		List<Habitacion> habitaciones = habitacionDao.getAllHabitaciones();
		ResponseEntity<List<Habitacion>> respuesta = new ResponseEntity<>(habitaciones, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getHabitacion")
	public ResponseEntity<Habitacion> getByID(@RequestParam int id){
		Habitacion habitacion = habitacionDao.getHabitacion(id);
		ResponseEntity<Habitacion> respuesta = new ResponseEntity<>(habitacion, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/addHabitacion")
	public ResponseEntity<String> addHabitacion(@RequestBody Habitacion habitacion) {
		boolean isAdded = habitacionDao.insertHabitacion(habitacion);
		ResponseEntity<String> respuesta = null;
		if (isAdded) {
			respuesta = ResponseEntity.ok("Inserted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Inserted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteHabitacion")
	public ResponseEntity<String> deleteHabitacion(@RequestBody int id) {
		boolean idDeleted = habitacionDao.deleteHabitacion(id);
		ResponseEntity<String> respuesta = null;
		if (idDeleted) {
			respuesta = ResponseEntity.ok("Deleted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Deleted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateHabitacion")
	public ResponseEntity<String> updateHabitacion(@RequestBody Habitacion habitacion) {
		boolean isUpdated = habitacionDao.updateHabitacion(habitacion);
		ResponseEntity<String> respuesta = null;
		if (isUpdated) {
			respuesta = ResponseEntity.ok("Updated Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Updated Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

}
