package com.spjpa.entity.orders;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")

public class Ordersinfo {
	@Column(name="oid")
	@Id
	private int id;
	@Column(name="no_of_items")
	private int items;
	@Column(name = "city")
	private String cityname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

}
