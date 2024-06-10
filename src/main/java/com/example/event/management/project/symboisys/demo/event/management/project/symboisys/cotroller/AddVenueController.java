package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.AddVenue;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.UserEvent;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.AddVenueServices;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.UserEventServices;

import jakarta.validation.Valid;

@Controller
public class AddVenueController {
@Autowired
	private AddVenueServices addVenueServices;
@Autowired
private UserEventServices userEventServices;
@GetMapping("/addvenue")	
public String getAddVenue(Model model) {
model.addAttribute("addvenue",new AddVenue());
return "addvenue";
}
@GetMapping("/orgbookingstatus")	
public String getbookingStatus(Model model) {
	List<UserEvent> usereventlist=userEventServices.userEventList();
	model.addAttribute("usereventlist" , usereventlist);
return "orgbookingstatus";
}

@PostMapping("/venuestatus")
public String getStatus(@Valid @ModelAttribute ("addvenue")  AddVenue addvenue , BindingResult bindingResult) {
	if(bindingResult.hasErrors()) {
		return "addvenue";
		
	}
addVenueServices.saveVenueRegistered(addvenue);
	return "redirect:/venuelist";
}
}

