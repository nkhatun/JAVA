package nkhatun.practice.java.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nkhatun.practice.java.entity.HotelRoom;

@Repository
public interface RoomRepository  extends CrudRepository<HotelRoom, Long>{
	public HotelRoom findByRoomId(Long roomId);
	public List<HotelRoom> findByRoomType(String roomType);
}
