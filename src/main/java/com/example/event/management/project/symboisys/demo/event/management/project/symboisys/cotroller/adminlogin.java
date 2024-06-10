package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Admin;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.AdminHome;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.AdminService;
import jakarta.validation.Valid;

@Controller
public class adminlogin {
	@Autowired
	private AdminService adminService;

	@GetMapping("/adminlogin")
    public String getLogin(Model model) {
        model.addAttribute("adminlogin", new AdminHome());
        return "adminlogin";
    }
	 @PostMapping("/adminloginstatus")
	    public String getLogStatus(@Valid @ModelAttribute("adminlogin") AdminHome adminhome, BindingResult bindingResult, Model model) {
	        if (bindingResult.hasErrors()) {
	            return "adminlogin";
	        }
	        List<Admin>dbadmin=adminService.adminList();
	        boolean found =false;
	        for(Admin ad:dbadmin) {
	        	if(ad.getUsername().equals(adminhome.getUsername())&&ad.getPassword().equals(adminhome.getPassword())) {
	        found=true;
	        
	        	}
   
	        }
	        if(found==true) {
	        	return "redirect:/organizerList";
	        }else {
	        	model.addAttribute("error","Incorrect username or password");
				return "redirect:/adminlogin";
	        }
}
}

