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

import com.hoteles.dao.PagoDao;
import com.hoteles.dao.entitys.Pago;

@RestController
@RequestMapping("/pago")
public class PagoRestController {
	@Autowired
	PagoDao pagoDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pago>> getAll(){
		List<Pago> pagos = pagoDao.getAllPagos();
		ResponseEntity<List<Pago>> respuesta = new ResponseEntity<>(pagos, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getPago")
	public ResponseEntity<Pago> getByID(@RequestParam int id){
		Pago pago = pagoDao.getPago(id);
		ResponseEntity<Pago> respuesta = new ResponseEntity<>(pago, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/addPago")
	public ResponseEntity<String> addPago(@RequestBody Pago pago) {
		boolean isAdded = pagoDao.insertPago(pago);
		ResponseEntity<String> respuesta = null;
		if (isAdded) {
			respuesta = ResponseEntity.ok("Inserted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Inserted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deletePago")
	public ResponseEntity<String> deletePago(@RequestBody int id) {
		boolean idDeleted = pagoDao.deletePago(id);
		ResponseEntity<String> respuesta = null;
		if (idDeleted) {
			respuesta = ResponseEntity.ok("Deleted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Deleted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updatePago")
	public ResponseEntity<String> updatePago(@RequestBody Pago pago) {
		boolean isUpdated = pagoDao.updatePago(pago);
		ResponseEntity<String> respuesta = null;
		if (isUpdated) {
			respuesta = ResponseEntity.ok("Updated Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Updated Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

}
