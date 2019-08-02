package com.hoteles.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hoteles.dao.entitys.Consumo;

@Mapper
public interface ConsumoMapper {
	
	@Insert("insert into consumo(con_re_id,con_pro_id,con_cantidad,con_precio_venta,con_estado) values (#{con_re_id},#{con_pro_id},#{con_cantidad},#{con_precio_venta},#{con_estado})")
	public int insertConsumo(Consumo consumo);

	@Select("select * from consumo where con_id =#{id}")
	public Consumo getConsumo(int id);

	@Select("select * from consumo")
	public List<Consumo> getAllConsumos();

	@Delete("delete from consumo where con_id = #{id}")
	public int deleteConsumo(int id);

	@Update("update consumo set con_re_id = #{con_re_id} , con_pro_id = #{con_pro_id} , con_cantidad = #{con_cantidad} , con_precio_venta = #{con_precio_venta} , con_estado = #{con_estado}")
	public int updateConsumo(Consumo consumo);

}
