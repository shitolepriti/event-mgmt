package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Customer;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Organizer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.CustHome;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.CustomerService;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.OrgnizerService;

import jakarta.validation.Valid;

@Controller
public class CustLoginController {
	
	@Autowired	
	private CustomerService customerService;
	@Autowired	
	private OrgnizerService orgnizerService;

	@GetMapping("/custlogin")
	public String getCustLogin(Model model) {
		model.addAttribute("custhome",new CustHome());
		
		return "custHome";
		
	}
	 @GetMapping("/custindex")
	    public String getOrgIndex(@Valid @ModelAttribute("custhome") CustHome custhome, BindingResult bindingResult, Model model) {
		 List<Organizer>organizerList=orgnizerService.organizerList();
		 model.addAttribute("organizerList",organizerList);
	            return "custindex";
	        }
	 
	@PostMapping("/custloginstatus")
	public String getLoginStatus(@Valid @ModelAttribute("custhome") CustHome custhome, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "custhome";
		}
		List<Customer> dbCustomer=customerService.customerList();
		boolean found = false;
		for(Customer ct:dbCustomer) {
			if(ct.getEmailaddress().equals(custhome.getUsername())&&ct.getPassword().equals(custhome.getPassword())) {
				found = true;
			}
		}
		if(found==true) {
				return "redirect:/custindex";
			
			}else {
				model.addAttribute("error","Incorrect username or password");
				return "custhome";
			}
		}
		

}
