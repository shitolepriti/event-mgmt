package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddVenue {
@Id
@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
	private int id;
	private String venuname;
	private String place;
	private String venucontact;
	private String eventname;
	private String food;
	private int food_price;
	private String equipment;
	private int equipment_price;
	private int total_price;
	@Override
	public String toString() {
		return "AddVenue [id=" + id + ", venuname=" + venuname + ", place=" + place + ", venucontact=" + venucontact
				+ ", eventname=" + eventname + ", food=" + food + ", food_price=" + food_price + ", equipment="
				+ equipment + ", equipment_price=" + equipment_price + ", total_price=" + total_price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVenuname() {
		return venuname;
	}
	public void setVenuname(String venuname) {
		this.venuname = venuname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getVenucontact() {
		return venucontact;
	}
	public void setVenucontact(String venucontact) {
		this.venucontact = venucontact;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getFood_price() {
		return food_price;
	}
	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public int getEquipment_price() {
		return equipment_price;
	}
	public void setEquipment_price(int equipment_price) {
		this.equipment_price = equipment_price;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public AddVenue(int id, String venuname, String place, String venucontact, String eventname, String food,
			int food_price, String equipment, int equipment_price, int total_price) {
		super();
		this.id = id;
		this.venuname = venuname;
		this.place = place;
		this.venucontact = venucontact;
		this.eventname = eventname;
		this.food = food;
		this.food_price = food_price;
		this.equipment = equipment;
		this.equipment_price = equipment_price;
		this.total_price = total_price;
	}
	public AddVenue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
