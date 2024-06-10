package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services;

import java.util.List;


import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.UserEvent;

public interface UserEventServices {

	public UserEvent saveRegistered(UserEvent userEvent);
	public List<UserEvent>userEventList();
	public void deleteById(int id);
	public UserEvent findById(int id);
	
	public UserEvent updateUserEvent(UserEvent userEvent);
}
