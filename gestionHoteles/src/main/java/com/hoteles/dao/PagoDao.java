package com.hoteles.dao;

import java.util.List;

import com.hoteles.dao.entitys.Pago;

public interface PagoDao {
	
	public boolean insertPago(Pago pago);

	public Pago getPago(int idPago);

	public List<Pago> getAllPagos();

	public boolean deletePago(int idPago);

	public boolean updatePago(Pago pago);

}
