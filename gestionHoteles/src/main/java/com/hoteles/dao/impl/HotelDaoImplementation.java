package com.hoteles.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hoteles.dao.HotelDao;
import com.hoteles.dao.entitys.Hotel;
import com.hoteles.dao.mappers.HotelMapper;

@Component
public class HotelDaoImplementation implements HotelDao {

	@Autowired
	HotelMapper mapper;

	@Override
	public boolean insertHotel(Hotel hotel) {
		boolean isAdded = mapper.insertHotel(hotel) > 0;
		return isAdded;
	}

	@Override
	public Hotel getHotel(int idHotel) {
		Hotel hotel = mapper.getHotel(idHotel);
		return hotel;
	}

	@Override
	public List<Hotel> getAllHotels() {
		List<Hotel> hoteles = mapper.getAllHotels();
		return hoteles;
	}

	@Override
	public boolean deleteHotel(int idHotel) {
		boolean isDeleted = mapper.deleteHotel(idHotel) > 0;
		return isDeleted;
	}

	@Override
	public boolean updateHotel(Hotel hotel) {
		boolean isUpdated = mapper.updateHotel(hotel) > 0;
		return isUpdated;
	}

}
