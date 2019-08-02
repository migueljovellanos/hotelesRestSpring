package com.hoteles.dao;

import java.util.List;

import com.hoteles.dao.entitys.Reserva;

public interface ReservaDao {
	public boolean insertReserva(Reserva reserva);

	public Reserva getReserva(int idReserva);

	public List<Reserva> getAllReservas();

	public boolean deleteReserva(int idReserva);

	public boolean updateReserva(Reserva reserva);

}
