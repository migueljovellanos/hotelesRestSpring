package com.hoteles.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hoteles.dao.ReservaDao;
import com.hoteles.dao.entitys.Reserva;
import com.hoteles.dao.mappers.ReservaMapper;

@Component
public class ReservaDaoController implements ReservaDao{
	
	@Autowired
	ReservaMapper mapper;

	@Override
	public boolean insertReserva(Reserva reserva) {
		boolean isAdded = mapper.insertReserva(reserva) > 0;
		return isAdded;
	}

	@Override
	public Reserva getReserva(int idReserva) {
		Reserva reserva = mapper.getReserva(idReserva);
		return reserva;
	}

	@Override
	public List<Reserva> getAllReservas() {
		List<Reserva> reserva = mapper.getAllReservas();
		return reserva;
	}

	@Override
	public boolean deleteReserva(int idReserva) {
		boolean isDeleted = mapper.deleteReserva(idReserva) > 0;
		return isDeleted;
	}

	@Override
	public boolean updateReserva(Reserva reserva) {
		boolean isUpdated = mapper.updateReserva(reserva) > 0;
		return isUpdated;
	}

}
