package com.kh.Webpfe.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.Webpfe.models.News;

import com.kh.Webpfe.repositories.NewsRepository;










@Controller
public class NewsController {

	
	@Autowired
	private NewsRepository newsRepository;
	
	
		// show 
	  @RequestMapping("/news-football")
	    public String news(Model model) {
		  
		  
	        model.addAttribute("news", newsRepository.findAll());
	        
	       
	        return "/news-football";
	    }
	
	  @RequestMapping("/news-handball")
	    public String newspost(Model model) {
		  
		  
	        model.addAttribute("news", newsRepository.findAll());
	        
	       
	        return "/news-handball";
	    }
	  
	  @RequestMapping("/manchester-united")
	    public String slider(Model model) {
		  
		  
	        model.addAttribute("slider", newsRepository.findAll());
	        
	       
	        return "/manchester-united";
	    }
	 
	  @RequestMapping("/contact")
	    public String contact(Model model) {
		  
		  
	        model.addAttribute("news", newsRepository.findAll());
	        
	       
	        return "/contact";
	    }
	
	
	
	
	
	
	
}
