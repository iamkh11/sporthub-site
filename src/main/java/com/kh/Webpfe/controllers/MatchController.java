package com.kh.Webpfe.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.Webpfe.repositories.MatchReposiroty;
import com.kh.Webpfe.repositories.StadiumRepository;
import com.kh.Webpfe.repositories.TeamRepository;
import com.kh.Webpfe.repositories.TicketRepository;




@Controller
public class MatchController {
	
	@Autowired
	private MatchReposiroty matchRepository;
	
	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private  StadiumRepository stadiumRepository;
	
	@Autowired
	private TicketRepository ticketRepository;
	
	
	
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
		        
		        model.addAttribute("stade", stadiumRepository.findAll());
		        
		        model.addAttribute("team", teamRepository.findAll());
		       
		        return "fixtures-hand";
		    }
		
	
	
	
	
}








