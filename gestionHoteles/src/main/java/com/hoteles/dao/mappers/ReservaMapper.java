package com.hoteles.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hoteles.dao.entitys.Reserva;

@Mapper
public interface ReservaMapper {
	@Insert("insert into reservas(re_cli_dni,re_ha_id,re_fecha_reserva,re_fecha_ini,re_fecha_fin,re_coste_alojamiento,re_estado) values (#{re_cli_dni},#{re_ha_id},#{re_fecha_reserva},#{re_fecha_ini},#{re_fecha_fin},#{re_coste_alojamiento},#{re_estado})")
	public int insertReserva(Reserva reserva);
	
	@Select("select * from reservas where re_id =#{id}")
	public Reserva getReserva(int id);
	
	@Select("select * from reservas")
	public List<Reserva> getAllReservas();

	@Delete("delete from reservas where re_id = #{id}")
	public int deleteReserva(int id);

	@Update("update reservas set re_cli_dni = #{re_cli_dni} , re_ha_id = #{re_ha_id} , re_fecha_reserva = #{re_fecha_reserva} , re_fecha_ini = #{re_fecha_ini} , re_fecha_fin = #{re_fecha_fin} , re_coste_alojamiento = #{re_coste_alojamiento}, re_estado = #{re_estado} where re_id = #{re_id}")
	public int updateReserva(Reserva reserva);

}
