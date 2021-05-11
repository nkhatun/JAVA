package nkhatun.practice.java.service;

import java.util.List;

import nkhatun.practice.java.entity.RoomCustomer;

public interface ICustomerMngService {
	RoomCustomer findCustomerById(long id);
	List<RoomCustomer> findAllCustomers();	
	RoomCustomer saveCustomer(RoomCustomer customer);
	boolean deleteCustomerEntry(Long id);
	List<RoomCustomer> findByRoomCustomerFirstNameLastName(String fName, String lName);
}
