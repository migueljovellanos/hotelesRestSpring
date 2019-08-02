package com.hoteles.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hoteles.dao.PagoDao;
import com.hoteles.dao.entitys.Pago;
import com.hoteles.dao.mappers.PagoMapper;


@Component
public class PagoDaoImplementation implements PagoDao{
	
	@Autowired
	PagoMapper mapper;

	@Override
	public boolean insertPago(Pago pago) {
		boolean isAdded = mapper.insertPago(pago) > 0;
		return isAdded;
	}

	@Override
	public Pago getPago(int idPago) {
		Pago pago = mapper.getPago(idPago);
		return pago;
	}

	@Override
	public List<Pago> getAllPagos() {
		List<Pago> pagos = mapper.getAllPagos();
		return pagos;
	}

	@Override
	public boolean deletePago(int idPago) {
		boolean isDeleted = mapper.deletePago(idPago) > 0;
		return isDeleted;
	}

	@Override
	public boolean updatePago(Pago pago) {
		boolean isUpdated = mapper.updatePago(pago) > 0;
		return isUpdated;
	}

}
