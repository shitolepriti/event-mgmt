package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Customer;

public interface CustomerService {
	public Customer saveRegistered(Customer customer);
	public List<Customer>customerList();
	public void deleteById(int id);
	public Customer findById(int id);
	
	public Customer updateOrganizer(Customer customer);

}
