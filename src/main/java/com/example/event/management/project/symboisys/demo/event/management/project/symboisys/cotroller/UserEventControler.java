package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.UserEvent;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.UserEventServices;

import jakarta.validation.Valid;

@Controller
public class UserEventControler {
@Autowired
private UserEventServices userEventServices;

@GetMapping("/bookevent")
public String getReguserEventS(Model model) {
	model.addAttribute("userevent",new UserEvent());
	return "userevent";
}
@PostMapping("/usereventstatus")
public String getStatus(@Valid @ModelAttribute ("userevent") UserEvent userevent , BindingResult bindingResult) {
	if(bindingResult.hasErrors()) {
		return "userevent";
		
	}
	
	
	userEventServices.saveRegistered(userevent);
	return "redirect:/book";
}
}
