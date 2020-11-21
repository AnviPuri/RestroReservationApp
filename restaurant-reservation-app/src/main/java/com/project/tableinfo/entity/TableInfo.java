package com.project.tableinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.project.restaurant.entity.Restaurant;

@Table(name = "table_info")
@Entity
public class TableInfo {

	@Id
	@Column(name = "table_info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tableInfoId;

	@Column(name = "table_number")
	private String tableNumber;

	@Column(name = "number_of_seats")
	private int numberOfSeats;

	@Column(name = "is_available")
	private boolean isAvailable;

	@ManyToOne
	@JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id")
	private Restaurant restaurant;

	public int getTableInfoId() {
		return tableInfoId;
	}

	public void setTableInfoId(int tableInfoId) {
		this.tableInfoId = tableInfoId;
	}

	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
