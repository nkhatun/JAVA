package nkhatun.practice.java.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nkhatun.practice.java.dto.RoomType;
import nkhatun.practice.java.entity.HotelRoom;
import nkhatun.practice.java.service.BookingMngServiceImpl;
import nkhatun.practice.java.service.IBookingMngService;

@RestController
@RequestMapping("/api/v1")
public class BookingMngController {
	@Autowired
	private IBookingMngService bookingService;
	
	@GetMapping("/searchAvailableRooms")
	public ResponseEntity<?> searchRooms(@RequestParam(name = "roomType", required = false) String roomType) {
		if(roomType != null && (Arrays.stream(RoomType.values()).noneMatch((t) -> t.name().equalsIgnoreCase(roomType)))) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(bookingService.searchAvailableRooms(roomType));
	}
	@PostMapping("/addEmptyRoom")
	public ResponseEntity<?> addEmptyRoom(@RequestBody HotelRoom room){
		if(room == null) {
			return ResponseEntity.badRequest().build();
		}
		try {
			HotelRoom roomSaved = bookingService.addEmptyRoom(room) ;
			return ResponseEntity.created(new URI("/booking/" + roomSaved.getRoomId())).build();
		} catch (URISyntaxException e) {
			//TODO check application exception
			return ResponseEntity.badRequest().body("An exception occurred "+e.getReason());
		}
	}
}
