package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.AddVenue;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.repository.AddVenueRepository;
@Service
public class AddVenueServiceImpl implements AddVenueServices {
@Autowired
	private AddVenueRepository addVenueRepository;

	public AddVenueServiceImpl(AddVenueRepository addVenueRepository) {
	super();
	this.addVenueRepository = addVenueRepository;
}

	@Override
	public AddVenue saveVenueRegistered(AddVenue addVenue) {
		// TODO Auto-generated method stub
		return addVenueRepository.save(addVenue);
	}

	@Override
	public List<AddVenue> addVenueList() {
		// TODO Auto-generated method stub
		List<AddVenue>findAll=addVenueRepository.findAll();
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		addVenueRepository.deleteById(id);
	}

	@Override
	public AddVenue findById(int id) {
		// TODO Auto-generated method stub
		Optional<AddVenue>findById=addVenueRepository.findById(id);
		AddVenue addVenue=findById.get();
		return addVenue;
	}

	@Override
	public AddVenue updateVenue(AddVenue addVenue) {
		// TODO Auto-generated method stub
		return addVenueRepository.save(addVenue);
	}

	  

	   
	
}
