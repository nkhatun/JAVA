package nkhatun.practice.java.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nkhatun.practice.java.entity.RoomCustomer;

@Repository
public interface CustomerRepository extends CrudRepository<RoomCustomer, Long>{
	public RoomCustomer findByCustomerId(Long customerId);
}
