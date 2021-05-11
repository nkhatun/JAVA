package nkhatun.practice.java.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "HotelRoom")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roomId;
	
	@Column(name = "room_rent")
	private BigDecimal roomRent;
	
	@Column(name = "room_type")
	private String roomType;
	
	@Column(name = "room_number")
	private String roomNumber;
}
