package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Organizer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.OrgnizerService;


import jakarta.validation.Valid;

@Controller
public class OrganizerController {
	@Autowired
private OrgnizerService organizerService;

	@GetMapping("/orgReg")
	public String getRegOrg(Model model) {
		model.addAttribute("organizer",new Organizer());
		return "orgReg";
		
	}
	
	@PostMapping("/orgstatus")
	public String getStatus(@Valid @ModelAttribute ("organizer") Organizer organizer , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "OrgReg";
			
		}
		organizerService.saveRegistered(organizer);
		

		return "redirect:/orglogin";
}
}
