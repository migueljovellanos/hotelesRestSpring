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

import com.hoteles.dao.HotelDao;
import com.hoteles.dao.entitys.Hotel;

@RestController
@RequestMapping("/hotel")
public class HotelRestController {

	@Autowired
	HotelDao hotelDao;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Hotel>> getAll() {
		List<Hotel> hotels = hotelDao.getAllHotels();
		ResponseEntity<List<Hotel>> respuesta = new ResponseEntity<>(hotels, HttpStatus.OK);
		return respuesta;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getHotel")
	public ResponseEntity<Hotel> getByID(@RequestParam int id) {
		Hotel hotel = hotelDao.getHotel(id);
		ResponseEntity<Hotel> respuesta = new ResponseEntity<>(hotel, HttpStatus.OK);
		return respuesta;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/addHotel")
	public ResponseEntity<String> addHotel(@RequestBody Hotel hotel) {
		boolean isAdded = hotelDao.insertHotel(hotel);
		ResponseEntity<String> respuesta = null;
		if (isAdded) {
			respuesta = ResponseEntity.ok("Inserted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Inserted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteHotel")
	public ResponseEntity<String> deleteHotel(@RequestBody int id) {
		boolean idDeleted = hotelDao.deleteHotel(id);
		ResponseEntity<String> respuesta = null;
		if (idDeleted) {
			respuesta = ResponseEntity.ok("Deleted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Deleted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateHotel")
	public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel) {
		boolean isUpdated = hotelDao.updateHotel(hotel);
		ResponseEntity<String> respuesta = null;
		if (isUpdated) {
			respuesta = ResponseEntity.ok("Updated Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Updated Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

}
