package com.hoteles.dao.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hoteles.dao.entitys.Pago;


@Mapper
public interface PagoMapper {
	
	@Insert("insert into pago(pag_re_id,pag_total,pag_fecha_pago) values (#{pag_re_id},#{pag_total},#{pag_fecha_pago})")
	public int insertPago(Pago pago);

	@Select("select * from pago where pag_id =#{id}")
	public Pago getPago(int id);

	@Select("select * from pago")
	public List<Pago> getAllPagos();

	@Delete("delete from pago where pag_id = #{id}")
	public int deletePago(int id);

	@Update("update pago set pag_re_id = #{pag_re_id} , pag_total = #{pag_total} , pag_fecha_pago = #{pag_fecha_pago} where pag_id = #{pag_id}")
	public int updatePago(Pago pago);

}
