package data.entities;

import java.util.Date;

public class ReservationRequest {
	
	public int id;
	public Date date;
	public Date time;
	public int countSeat;
	public String customerName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getCountSeat() {
		return countSeat;
	}
	public void setCountSeat(int countSeat) {
		this.countSeat = countSeat;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
