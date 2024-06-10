package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.UserEvent;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.UserEventServices;

@Controller
public class UserHistoryDashBoard {
	@Autowired
private UserEventServices userEventServices;

	@GetMapping("/usereventlist")
	public String getUserEventList(Model model) {
		List<UserEvent> usereventlist=userEventServices.userEventList();
		model.addAttribute("usereventlist" , usereventlist);
		return "bookhistory";
		
	}
	@PostMapping("/userevent/delete")
	public String getDelete(@RequestParam("id") int id, Model model) {
		userEventServices.deleteById(id);
		String Deletemessage="bookhistory suceessfully delete with id :"+ id;
		model.addAttribute("message",Deletemessage);

		return "bookhistory";
	
}
	
	
}
