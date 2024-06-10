package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
private int id;
private String custname;
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
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
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
	return "Customer [id=" + id + ", custname=" + custname + ", address=" + address + ", mobilenumber=" + mobilenumber
			+ ", emailaddress=" + emailaddress + ", password=" + password + "]";
}
public Customer(int id, String custname, String address, String mobilenumber, String emailaddress, String password) {
	super();
	this.id = id;
	this.custname = custname;
	this.address = address;
	this.mobilenumber = mobilenumber;
	this.emailaddress = emailaddress;
	this.password = password;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


}
