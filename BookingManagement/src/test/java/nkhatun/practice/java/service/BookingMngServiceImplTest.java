package nkhatun.practice.java.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import nkhatun.practice.java.entity.HotelRoom;
import nkhatun.practice.java.repository.RoomRepository;

class BookingMngServiceImplTest {
	RoomRepository roomRepo = mock(RoomRepository.class);
	BookingMngServiceImpl bookingService = mock(BookingMngServiceImpl.class);
	CustomerMngServiceImpl customerService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("to find room by valid room type")
	public void testFindByValidRoomType() {
		when(roomRepo.findByRoomType("SINGLE")).thenReturn(Arrays.asList(
				new HotelRoom(1L,new BigDecimal(145.99), "SINGLE","11")));
		List<HotelRoom> rooms = bookingService.searchAvailableRooms("SINGLE");
		assertEquals(1, rooms.size(),() -> "should return room size same as");
	}

}
