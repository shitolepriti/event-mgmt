package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Organizer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
private int id;
private String orgname;
private String address;
private String mobilenumber;
private String emailaddress;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOrgname() {
	return orgname;
}
public void setOrgname(String orgname) {
	this.orgname = orgname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getEmailaddress() {
	return emailaddress;
}
public void setEmailaddress(String emailaddress) {
	this.emailaddress = emailaddress;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Organizer [id=" + id + ", orgname=" + orgname + ", address=" + address + ", mobilenumber=" + mobilenumber
			+ ", emailaddress=" + emailaddress + ", password=" + password + "]";
}
public Organizer(int id, String orgname, String address, String mobilenumber, String emailaddress, String password) {
	super();
	this.id = id;
	this.orgname = orgname;
	this.address = address;
	this.mobilenumber = mobilenumber;
	this.emailaddress = emailaddress;
	this.password = password;
}
public Organizer() {
	super();
	// TODO Auto-generated constructor stub
}


}
