package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.cotroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;



import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.AddVenue;




@Controller
public class ManagevanueController {

	@GetMapping("/managevenue")
	public String getvenue(Model model) {
		model.addAttribute("addvenue",new AddVenue());
		return "managevenue";
	}
}
