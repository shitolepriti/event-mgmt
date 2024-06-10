package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
		
	private int id;
	private String name;
	private String address;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", address=" + address + ", username=" + username + ", password="
				+ password + "]";
	}
	public Admin(int id, String name, String address, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
