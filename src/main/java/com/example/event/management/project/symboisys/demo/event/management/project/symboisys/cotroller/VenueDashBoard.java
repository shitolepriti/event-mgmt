package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.AddVenue;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.AddVenueServices;


import jakarta.validation.Valid;


@Controller
public class VenueDashBoard {
	@Autowired
private AddVenueServices addVenueServices;

	@GetMapping("/venuelist")
	public String getVenueList(Model model) {
		List<AddVenue> venuelist=addVenueServices.addVenueList();
		model.addAttribute("venuelist" , venuelist);
		return "managevenue";
		
	}
	@GetMapping("/orgDetail")
	public String getOrgList(Model model) {
		List<AddVenue> venuelist=addVenueServices.addVenueList();
		model.addAttribute("venuelist" , venuelist);
		return "orgDetail";
		
	}
	@GetMapping("/book")
	public String getBookList(Model model) {
		
		return "book";
		
	}
	@PostMapping("/venue/delete")
	public String getDelete(@RequestParam("id") int id, Model model) {
		addVenueServices.deleteById(id);
		String Deletemessage="venue suceessfully delete with id :"+ id;
		model.addAttribute("message",Deletemessage);
		return "managevenue";
	
}
	@GetMapping("/venue/edit")
public String getEditForm(@RequestParam("id") int id ,Model model) {
	AddVenue addVenue=	addVenueServices.findById(id);
	
		model.addAttribute("addVenue",addVenue);
		
	return "update-venue";
	
}	
	@PostMapping("/savevenueupdate")
	public String getUpdate(@Valid @ModelAttribute("addVenue") AddVenue addVenue,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
		return "update-venue";
		}
		addVenueServices.updateVenue(addVenue);
		
		return "redirect:/venuelist";
		
	}
}
