package com.kh.Webpfe.controllers;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;




import com.kh.Webpfe.repositories.StaffRepository;




@Controller
public class StaffController {

	
	
	@Autowired
	private StaffRepository staffRepository;

	
	
		
	 @RequestMapping("/staff-football")
	    public String staff(Model model) {
	        model.addAttribute("staff", staffRepository.findAll());
	        return "staff-football";
	    }
	  
	 @RequestMapping("/staff-handball")
	    public String staffh(Model model) {
	        model.addAttribute("staff", staffRepository.findAll());
	        return "staff-handball";
	    }
	  
	 
	
	
	
	
}
