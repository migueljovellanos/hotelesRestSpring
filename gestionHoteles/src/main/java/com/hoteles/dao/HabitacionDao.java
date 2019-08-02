package com.hoteles.dao;

import java.util.List;
import com.hoteles.dao.entitys.Habitacion;


public interface HabitacionDao {
	
	public boolean insertHabitacion(Habitacion habitacion);

	public Habitacion getHabitacion(int idHabitacion);

	public List<Habitacion> getAllHabitaciones();

	public boolean deleteHabitacion(int idHabitacion);

	public boolean updateHabitacion(Habitacion habitacion);

}
