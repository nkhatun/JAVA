package nkhatun.practice.java.service;

import java.util.List;

import nkhatun.practice.java.entity.HotelRoom;
import nkhatun.practice.java.entity.RoomCustomer;

public interface IBookingMngService{
	public void checkoutRoom(HotelRoom room);
	public void checkinRoom(HotelRoom room, List<RoomCustomer> customers);
	public void alterRoom(HotelRoom room, List<RoomCustomer> customers);
	public void cancelBooking(HotelRoom room);
	public List<HotelRoom> searchAvailableRooms(String roomType);
	public HotelRoom addEmptyRoom(HotelRoom room);
}
