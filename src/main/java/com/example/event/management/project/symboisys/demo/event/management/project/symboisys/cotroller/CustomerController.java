package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Customer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Organizer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.CustomerService;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.OrgnizerService;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/custReg")
	public String getRegOrg(Model model) {
		model.addAttribute("customer",new Customer());
		return "custReg";
	}
	
	@PostMapping("/custstatus")
	public String getStatus(@Valid @ModelAttribute ("customer") Customer customer , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "custReg";
			
		}
		customerService.saveRegistered(customer);
		

		return "redirect:/custlogin";
}
}
