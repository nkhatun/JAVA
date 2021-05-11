package nkhatun.practice.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import nkhatun.practice.java.entity.RoomCustomer;
@Service
public class CustomerMngServiceImpl implements ICustomerMngService{

	@Override
	public RoomCustomer findCustomerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomCustomer> findAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomCustomer saveCustomer(RoomCustomer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomerEntry(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RoomCustomer> findByRoomCustomerFirstNameLastName(String fName,
			String lName) {
		// TODO Auto-generated method stub
		return null;
	}

}
