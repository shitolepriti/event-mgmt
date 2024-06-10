package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Admin;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;
	
    public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public Admin saveRegistered(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> adminList() {
		// TODO Auto-generated method stub
    List<Admin>findAll=adminRepository.findAll();
		
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		Optional<Admin>findById=adminRepository.findById(id);
		Admin admin=findById.get();
		
		return admin;
	}

	@Override
	public Admin updateOrganizer(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

}
