package com.hoteles.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hoteles.dao.entitys.Producto;

@Mapper
public interface ProductoMapper {
	
	@Insert("insert into productos(pro_nombre,pro_unidad_medida,pro_precio_venta) values (#{pro_nombre},#{pro_unidad_medida},#{pro_precio_venta})")
	public int insertProducto(Producto producto);
	
	@Select("select * from producto where pro_id =#{id}")
	public Producto getProducto(int id);
	
	@Select("select * from productos")
	public List<Producto> getAllProductos();

	@Delete("delete from productos where pro_id = #{id}")
	public int deleteProducto(int id);

	@Update("update producto set pro_nombre = #{pro_nombre} , pro_unidad_medida = #{pro_unidad_medida} , pro_precio_venta= #{pro_precio_venta} where pro_id = #{pro_id}")
	public int updateProducto(Producto producto);

}
