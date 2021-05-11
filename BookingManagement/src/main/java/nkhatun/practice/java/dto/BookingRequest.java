package nkhatun.practice.java.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
	private long id;
	private long customerId;
	private long roomId;
	private Date startDate;
	private Date endDate;
}
