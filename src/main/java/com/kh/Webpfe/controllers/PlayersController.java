package com.kh.Webpfe.controllers;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh.Webpfe.models.Players;

import com.kh.Webpfe.repositories.PlayersRepository;









@Controller
public class PlayersController {

	
	
	@Autowired
	private PlayersRepository playersRepository;
	
	
	
	
		// show 
	  @RequestMapping("/players-football")
	    public String players(Model model) {
	        model.addAttribute("players", playersRepository.findAll());
	        
	        
	        return "players-football";
	    }
	  
	  
	  @RequestMapping("/players-handball")
	    public String playersh(Model model) {
	        model.addAttribute("players", playersRepository.findAll());
	        
	        
	        return "players-handball";
	    }
	  
	
	    
	   
	}
		

		
	
	
	
