package com.hoteles.dao;

import java.util.List;

import com.hoteles.dao.entitys.Consumo;

public interface ConsumoDao {
	
	public boolean insertConsumo(Consumo consumo);

	public Consumo getConsumo(int idConsumo);

	public List<Consumo> getAllConsumos();

	public boolean deleteConsumo(int idConsumo);

	public boolean updateConsumo(Consumo consumo);

}
