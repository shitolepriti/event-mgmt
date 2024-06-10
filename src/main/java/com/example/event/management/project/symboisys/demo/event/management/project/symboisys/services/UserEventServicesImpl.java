package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.UserEvent;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.repository.UserEventRepository;
@Service
public class UserEventServicesImpl implements UserEventServices{
	@Autowired
	private UserEventRepository userEventRepository;

	public UserEventServicesImpl(UserEventRepository userEventRepository) {
		super();
		this.userEventRepository = userEventRepository;
	}

	@Override
	public UserEvent saveRegistered(UserEvent userEvent) {

		return userEventRepository.save(userEvent);
	}

	@Override
	public List<UserEvent> userEventList() {
List<UserEvent>findAll=userEventRepository.findAll();

		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userEventRepository.deleteById(id);
	}

	@Override
	public UserEvent findById(int id) {
		// TODO Auto-generated method stub
		Optional<UserEvent>findById=userEventRepository.findById(id);
		UserEvent userEvent=findById.get();
		
		return userEvent;
	}

	@Override
	public UserEvent updateUserEvent(UserEvent userEvent) {
		// TODO Auto-generated method stub
		
		return userEventRepository.save(userEvent);
	}
	
	
	

}
