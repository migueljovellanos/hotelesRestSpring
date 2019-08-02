package com.hoteles.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hoteles.dao.HabitacionDao;
import com.hoteles.dao.entitys.Habitacion;
import com.hoteles.dao.mappers.HabitacionMapper;
@Component
public class HabitacionDaoImplementation implements HabitacionDao{
	
	@Autowired
	HabitacionMapper mapper;

	@Override
	public boolean insertHabitacion(Habitacion habitacion) {
		boolean isAdded = mapper.insertHabitacion(habitacion) > 0;
		return isAdded;
	}

	@Override
	public Habitacion getHabitacion(int idHabitacion) {
		Habitacion habitacion = mapper.getHabitacion(idHabitacion);
		return habitacion;
	}

	@Override
	public List<Habitacion> getAllHabitaciones() {
		List<Habitacion> habitacion = mapper.getAllHabitaciones();
		return habitacion;
	}

	@Override
	public boolean deleteHabitacion(int idHabitacion) {
		boolean isDeleted = mapper.deleteHabitacion(idHabitacion) > 0;
		return isDeleted;
	}

	@Override
	public boolean updateHabitacion(Habitacion habitacion) {
		boolean isUpdated = mapper.updateHabitacion(habitacion) > 0;
		return isUpdated;
	}

}
