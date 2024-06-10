package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Organizer;



public interface OrgnizerService {

	
	public Organizer saveRegistered(Organizer organizer);
	public List<Organizer>organizerList();
	public void deleteById(int id);
	public Organizer findById(int id);
	
	public Organizer updateOrganizer(Organizer organizer);
}
