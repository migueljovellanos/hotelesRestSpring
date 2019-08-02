package com.hoteles.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hoteles.dao.entitys.Cliente;

@Mapper
public interface ClienteMapper {
	
	@Insert("insert into clientes(cli_dni, cli_nombre, cli_apellido, cli_email, cli_direccion, cli_codigopos, cli_ciudad, password) values (#{cli_dni},#{cli_nombre},#{cli_apellido},#{cli_email},#{cli_direccion},#{cli_codigopos},#{cli_ciudad},#{password})")
	public int insertCliente(Cliente cliente);

	@Select("select * from clientes where cli_dni =#{dniCliente}")
	public Cliente getCliente(String dniCliente);

	@Select("select * from clientes")
	public List<Cliente> getAllClientes();

	@Delete("delete from clientes where cli_dni = #{dniCliente}")
	public int deleteCliente(String dniCliente);

	@Update("update clientes set cli_dni = #{cli_dni} , cli_nombre = #{cli_nombre} , cli_apellido = #{cli_apellido} , cli_email = #{cli_email}, cli_direccion = #{cli_direccion}, cli_codigopos = #{cli_codigopos}, cli_ciudad = #{cli_ciudad}, password = #{password} where , cli_dni = #{cli_dni}")
	public int updateCliente(Cliente cliente);

}
