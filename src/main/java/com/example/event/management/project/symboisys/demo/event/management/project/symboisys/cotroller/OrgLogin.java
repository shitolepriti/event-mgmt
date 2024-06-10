package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.OrgHome;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Organizer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.UserEvent;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.OrgnizerService;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.UserEventServices;

import jakarta.validation.Valid;


@Controller
public class OrgLogin {
	@Autowired
	private OrgnizerService organizerService;
	@Autowired
	private UserEventServices userEventServices;
	   @GetMapping("/orglogin")
	    public String getLogin(Model model) {
	        model.addAttribute("orghome", new OrgHome());
	        return "orgHome";
	    }
	   @GetMapping("/orgindex")
	    public String getOrgIndex(@Valid @ModelAttribute("orghome") OrgHome orghome, BindingResult bindingResult, Model model) {
		   List<UserEvent> usereventlist=userEventServices.userEventList();
			model.addAttribute("usereventlist" , usereventlist);
	            return "orgindex";
	        }
	   
	   @PostMapping("/orgloginstatus")
	    public String getLogStatus(@Valid @ModelAttribute("orghome") OrgHome orghome, BindingResult bindingResult, Model model) {
	        if (bindingResult.hasErrors()) {
	            return "orghome";
	        }
	        List<Organizer>dborganizer=organizerService.organizerList();
	        boolean found =false;
	        for(Organizer org:dborganizer) {
	        	if(org.getEmailaddress().equals(orghome.getUsername())&&org.getPassword().equals(orghome.getPassword())) {
	        found=true;
	        break;
	        	}
	        }
	        System.out.println(found);
	        if(found==true) {
	        	return "redirect:/orgindex";
	        }else {
	        	model.addAttribute("error","Incorrect username or password");
				return "orghome";
	        }
}
}