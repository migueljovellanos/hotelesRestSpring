package com.hoteles.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hoteles.dao.ConsumoDao;
import com.hoteles.dao.entitys.Consumo;
import com.hoteles.dao.entitys.Hotel;
import com.hoteles.dao.mappers.ConsumoMapper;

@Component
public class ConsumoDaoImplementation implements ConsumoDao{
	
	@Autowired
	ConsumoMapper mapper;
	
	@Override
	public boolean insertConsumo(Consumo consumo) {
		boolean isAdded = mapper.insertConsumo(consumo) > 0;
		return isAdded;
	}

	@Override
	public Consumo getConsumo(int idConsumo) {
		Consumo consumo = mapper.getConsumo(idConsumo);
		return consumo;
	}

	@Override
	public List<Consumo> getAllConsumos() {
		List<Consumo> consumos = mapper.getAllConsumos();
		return consumos;
	}

	@Override
	public boolean deleteConsumo(int idConsumo) {
		boolean isDeleted = mapper.deleteConsumo(idConsumo) > 0;
		return isDeleted;
	}

	@Override
	public boolean updateConsumo(Consumo consumo) {
		boolean isUpdated = mapper.updateConsumo(consumo) > 0;
		return isUpdated;
	}

}
