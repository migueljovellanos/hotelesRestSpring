package com.hoteles.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hoteles.dao.ProductoDao;
import com.hoteles.dao.entitys.Producto;
import com.hoteles.dao.mappers.ProductoMapper;

@Component
public class ProductoDaoImplementation implements ProductoDao{
	
	@Autowired
	ProductoMapper mapper;

	@Override
	public boolean insertProducto(Producto producto) {
		boolean isAdded = mapper.insertProducto(producto) > 0;
		return isAdded;
	}

	@Override
	public Producto getProducto(int idProducto) {
		Producto producto = mapper.getProducto(idProducto);
		return producto;
	}

	@Override
	public List<Producto> getAllProductos() {
		List<Producto> producto = mapper.getAllProductos();
		return producto;
	}

	@Override
	public boolean deleteProducto(int idProducto) {
		boolean isDeleted = mapper.deleteProducto(idProducto) > 0;
		return isDeleted;
	}

	@Override
	public boolean updateProducto(Producto producto) {
		boolean isUpdated = mapper.updateProducto(producto) > 0;
		return isUpdated;
	}

}
