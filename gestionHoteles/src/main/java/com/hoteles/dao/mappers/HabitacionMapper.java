package com.hoteles.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hoteles.dao.entitys.Habitacion;


@Mapper
public interface HabitacionMapper {
	
	@Insert("insert into habitaciones(ha_piso,ha_numero,ha_vista,ha_clase,ha_camas,ha_precio,ha_personas,ha_dis,ha_ho_id) values (#{ha_piso},#{ha_numero},#{ha_vista},#{ha_clase},#{ha_camas},#{ha_precio},#{ha_personas},#{ha_dis},#{ha_ho_id})")
	public int insertHabitacion(Habitacion habitacion);
	
	@Select("select * from habitaciones where ha_id =#{id}")
	public Habitacion getHabitacion(int id);
	
	@Select("select * from habitaciones")
	public List<Habitacion> getAllHabitaciones();

	@Delete("delete from habitaciones where ha_id = #{id}")
	public int deleteHabitacion(int id);

	@Update("update habitaciones set ha_piso = #{ha_piso} , ha_numero = #{ha_numero} , ha_vista = #{ha_vista} , ha_clase = #{ha_clase} , ha_camas = #{ha_camas} , ha_precio = #{ha_precio}, ha_personas = #{ha_personas}, ha_dis = #{ha_dis} , ha_ho_id = #{ha_ho_id} where ha_id = #{ha_id}")
	public int updateHabitacion(Habitacion habitacion);

}
