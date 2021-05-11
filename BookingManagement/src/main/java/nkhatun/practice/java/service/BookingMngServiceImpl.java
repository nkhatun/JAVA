package nkhatun.practice.java.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import nkhatun.practice.java.entity.HotelRoom;
import nkhatun.practice.java.entity.RoomCustomer;
import nkhatun.practice.java.repository.RoomRepository;
@Service
public class BookingMngServiceImpl implements IBookingMngService{
	@Autowired
	private RoomRepository roomRepo;
	@Override
	public void checkoutRoom(HotelRoom room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkinRoom(HotelRoom room, List<RoomCustomer> customers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterRoom(HotelRoom room, List<RoomCustomer> customers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelBooking(HotelRoom room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HotelRoom> searchAvailableRooms(String roomType) {
		List<HotelRoom> roomList = new ArrayList<HotelRoom>();
		if(roomType != null && !roomType.isEmpty()) {
			roomList = roomRepo.findByRoomType(roomType);
			return roomList;
		}
		Iterable<HotelRoom>  roomsIter = roomRepo.findAll();
		roomList =  Streamable.of(roomsIter).toList();
		//roomsIter.forEach((room)-> roomList.add(new HotelRoom(room.getRoomId(),room.getRoomRent(),room.getRoomNumber(),room.getRoomType())));
		return roomList;
	}

	@Transactional
	public HotelRoom addEmptyRoom(HotelRoom room) {
		return roomRepo.save(room);		
	}
	
}
