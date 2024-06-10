package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
private int id;
private String place;
private String venue;
private String event;
private Date date;
private int numberOfGuest;
private String food;

private String equipment;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public String getVenue() {
	return venue;
}

public void setVenue(String venue) {
	this.venue = venue;
}

public String getEvent() {
	return event;
}

public void setEvent(String event) {
	this.event = event;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public int getNumberOfGuest() {
	return numberOfGuest;
}

public void setNumberOfGuest(int numberOfGuest) {
	this.numberOfGuest = numberOfGuest;
}

public String getFood() {
	return food;
}

public void setFood(String food) {
	this.food = food;
}

public String getEquipment() {
	return equipment;
}

public void setEquipment(String equipment) {
	this.equipment = equipment;
}

@Override
public String toString() {
	return "UserEvent [id=" + id + ", place=" + place + ", venue=" + venue + ", event=" + event + ", date=" + date
			+ ", numberOfGuest=" + numberOfGuest + ", food=" + food + ", equipment=" + equipment + "]";
}

public UserEvent(int id, String place, String venue, String event, Date date, int numberOfGuest, String food,
		String equipment) {
	super();
	this.id = id;
	this.place = place;
	this.venue = venue;
	this.event = event;
	this.date = date;
	this.numberOfGuest = numberOfGuest;
	this.food = food;
	this.equipment = equipment;
}

public UserEvent() {
	super();
	// TODO Auto-generated constructor stub
}





}
