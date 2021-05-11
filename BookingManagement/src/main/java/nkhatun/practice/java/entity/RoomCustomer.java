package nkhatun.practice.java.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RoomCustomer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	@Column(name = "first_name")	
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "passport_no")
	private String passportNo;
	@Column(name = "nationality")
	private String nationality;
	@JoinColumn(name = "roomId")
	private String roomId;
}
