package com.project.reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.project.tableinfo.entity.TableInfo;
import com.project.user.entity.User;

@Table(name = "reservation")
@Entity
public class Reservation {

	@Id
	@Column(name = "reservation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationId;

	@Column(name = "booking_start_time")
	private long bookingStartTime;

	@Column(name = "booking_end_time")
	private long bookingEndTime;

	@ManyToOne
	@JoinColumn(name = "table_info_id", referencedColumnName = "table_info_id")
	private TableInfo tableInfo;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public long getBookingStartTime() {
		return bookingStartTime;
	}

	public void setBookingStartTime(long bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}

	public long getBookingEndTime() {
		return bookingEndTime;
	}

	public void setBookingEndTime(long bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}

}
