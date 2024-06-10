package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Admin;

public interface AdminService {
	public Admin saveRegistered(Admin admin);
	public List<Admin>adminList();
	public void deleteById(int id);
	public Admin findById(int id);
	
	public Admin updateOrganizer(Admin admin);

}
