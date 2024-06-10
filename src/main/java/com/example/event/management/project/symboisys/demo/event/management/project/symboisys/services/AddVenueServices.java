package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.AddVenue;


public interface AddVenueServices {

	
	public AddVenue saveVenueRegistered(AddVenue addVenue);
	public List<AddVenue>addVenueList();
	public void deleteById(int id);
	public AddVenue findById(int id);
	
	public AddVenue updateVenue(AddVenue addVenue);
}
