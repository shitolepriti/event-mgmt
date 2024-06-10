package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Organizer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.repository.OrganizerRepository;
@Service
public class OrganizerServiceImpl implements OrgnizerService{
	@Autowired
private OrganizerRepository organizerRepository;
	
	public OrganizerServiceImpl(OrganizerRepository organizerRepository) {
		super();
		this.organizerRepository = organizerRepository;
	}

	@Override
	public Organizer saveRegistered(Organizer organizer) {
		// TODO Auto-generated method stub
		return organizerRepository.save(organizer);
	}

	@Override
	public List<Organizer> organizerList() {
		// TODO Auto-generated method stub
		List<Organizer>findAll=organizerRepository.findAll();
		
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		organizerRepository.deleteById(id);
	}

	@Override
	public Organizer findById(int id) {
		// TODO Auto-generated method stub
		Optional<Organizer>findById=organizerRepository.findById(id);
		Organizer organizer=findById.get();
		
		return organizer;
	}

	@Override
	public Organizer updateOrganizer(Organizer organizer) {
		// TODO Auto-generated method stub
		return organizerRepository.save(organizer);
	}

}
