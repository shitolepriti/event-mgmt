package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Admin;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.AdminService;

import jakarta.validation.Valid;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/adminRegistration")
	public String getRegAdmin(Model model) {
		model.addAttribute("admin",new Admin());
		return "adminReg";
		
	}
	@PostMapping("/adminstatus")
	public String getStatus(@Valid @ModelAttribute ("admin") Admin admin , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "adminReg";
			
		}
		adminService.saveRegistered(admin);
		return "redirect:/adminlogin";
}
		}
