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

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.Organizer;
import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.services.OrgnizerService;
import jakarta.validation.Valid;


@Controller
public class OrganizerDashboard {
	@Autowired
private OrgnizerService orgnizerService;
	
	@GetMapping("/organizerList")
public String getorgList(Model model) {
List<Organizer>organizerList=orgnizerService.organizerList();
model.addAttribute("organizerList",organizerList);

return "organizers";

}
	@PostMapping("/organizer/delete")
	public String getdelete(@RequestParam("id") int id, Model model) {
		orgnizerService.deleteById(id);
		String Deletemessage="organizer suceessfully delete with id :"+ id;
		model.addAttribute("message",Deletemessage);
		return "organizers";	
	}

	@GetMapping("/organizer/edit")
	public String getEdit(@RequestParam("id") int id ,Model model) {
		Organizer organizer=orgnizerService.findById(id);
		
		model.addAttribute("organizer",organizer);
		
	return "update-organizer";	
	}

	@PostMapping("/saveupdate")
	public String getUpdate(@Valid @ModelAttribute("organizer") Organizer organizer ,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "update-organizer";
			}
		orgnizerService.updateOrganizer(organizer);
		return "redirect:/organizerList";
	}
	
}
