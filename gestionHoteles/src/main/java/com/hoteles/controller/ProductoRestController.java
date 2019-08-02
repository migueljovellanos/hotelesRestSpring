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

import com.hoteles.dao.ProductoDao;
import com.hoteles.dao.entitys.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {
	
	@Autowired
	ProductoDao productoDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> getAll(){
		List<Producto> productos = productoDao.getAllProductos();
		ResponseEntity<List<Producto>> respuesta = new ResponseEntity<>(productos, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getProducto")
	public ResponseEntity<Producto> getByID(@RequestParam int id){
		Producto producto = productoDao.getProducto(id);
		ResponseEntity<Producto> respuesta = new ResponseEntity<>(producto, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/addProducto")
	public ResponseEntity<String> addProducto(@RequestBody Producto producto) {
		boolean isAdded = productoDao.insertProducto(producto);
		ResponseEntity<String> respuesta = null;
		if (isAdded) {
			respuesta = ResponseEntity.ok("Inserted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Inserted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteProducto")
	public ResponseEntity<String> deleteProducto(@RequestBody int id) {
		boolean idDeleted = productoDao.deleteProducto(id);
		ResponseEntity<String> respuesta = null;
		if (idDeleted) {
			respuesta = ResponseEntity.ok("Deleted Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Deleted Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/updateProducto")
	public ResponseEntity<String> updateProducto(@RequestBody Producto producto) {
		boolean isUpdated = productoDao.updateProducto(producto);
		ResponseEntity<String> respuesta = null;
		if (isUpdated) {
			respuesta = ResponseEntity.ok("Updated Successfully");
		} else {
			respuesta = new ResponseEntity<String>("Updated Failed", HttpStatus.BAD_REQUEST);
		}

		return respuesta;
	}


}
