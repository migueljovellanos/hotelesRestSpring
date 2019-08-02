package com.hoteles.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hoteles.dao.entitys.Hotel;

@Mapper
public interface HotelMapper {

	@Insert("insert into hoteles(ho_nombre,ho_categoria,ho_zona,ho_direccion) values (#{ho_nombre},#{ho_categoria},#{ho_zona},#{ho_direccion})")
	public int insertHotel(Hotel hotel);

	@Select("select * from hoteles where ho_id =#{id}")
	public Hotel getHotel(int id);

	@Select("select * from hoteles")
	public List<Hotel> getAllHotels();

	@Delete("delete from hoteles where ho_id = #{id}")
	public int deleteHotel(int id);

	@Update("update hoteles set ho_nombre = #{ho_nombre} , ho_categoria = #{ho_categoria} , ho_zona = #{ho_zona} , ho_direccion = #{ho_direccion} where ho_id = #{ho_id}")
	public int updateHotel(Hotel hotel);
}
