package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Customer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.repository.CustomerRepository;
@Service
public class CustomerServiceImplementation implements CustomerService{
    @Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImplementation(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	
    @Override
	public List<Customer> customerList() {
		// TODO Auto-generated method stub
List<Customer>findAll=customerRepository.findAll();
		
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		Optional<Customer>findById=customerRepository.findById(id);
		Customer customer=findById.get();
		
		return customer;

	}

	@Override
	public Customer updateOrganizer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer saveRegistered(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

}
