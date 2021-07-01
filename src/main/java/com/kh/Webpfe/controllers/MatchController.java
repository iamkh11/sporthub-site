package com.kh.Webpfe.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.Webpfe.repositories.MatchReposiroty;





@Controller
public class MatchController {
	
	@Autowired
	private MatchReposiroty matchRepository;
	
	
	
	
	
	
	// show 
	  @RequestMapping("/fixtures-foot")
	    public String match(Model model) {
		  
		  
	        model.addAttribute("match", matchRepository.findAll());
	        
	    
	       
	        return "fixtures-foot";
	    }
	
	
	
	
	// show 
		  @RequestMapping("/fixtures-hand")
		    public String fixtures(Model model) {
			  
			  
		        model.addAttribute("match", matchRepository.findAll());
		        
		      
		       
		        return "fixtures-hand";
		    }
		
	
	
	
	
}








