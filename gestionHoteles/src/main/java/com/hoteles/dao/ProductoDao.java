package com.hoteles.dao;

import java.util.List;

import com.hoteles.dao.entitys.Producto;

public interface ProductoDao {

	public boolean insertProducto(Producto producto);

	public Producto getProducto(int idProducto);

	public List<Producto> getAllProductos();

	public boolean deleteProducto(int idProducto);

	public boolean updateProducto(Producto producto);
}
