package com.hoteles.dao;

import java.util.List;

import com.hoteles.dao.entitys.Hotel;

public interface HotelDao {

	public boolean insertHotel(Hotel hotel);

	public Hotel getHotel(int idHotel);

	public List<Hotel> getAllHotels();

	public boolean deleteHotel(int idHotel);

	public boolean updateHotel(Hotel hotel);

}
