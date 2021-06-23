package com.kh.Webpfe.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;




import com.kh.Webpfe.repositories.NewsRepository;










@Controller
public class NewsController {

	
	@Autowired
	private NewsRepository newsRepository;
	
	
		// show 
	@GetMapping("/news-football" )
	    public String news(Model model) {
		  
		  
	        model.addAttribute("news", newsRepository.findAll());
	        
	       
	        return "/news-football";
	    }
	  
	  
	
	  @GetMapping("/news-handball")
	    public String newspost(Model model) {
		  
		  
	        model.addAttribute("news", newsRepository.findAll());
	        
	       
	        return "/news-handball";
	    }
	  
	  
	  
	  @GetMapping("/manchester-united")
	    public String slider(Model model) {
		  
		  
	        model.addAttribute("slider", newsRepository.findAll());
	        
	       
	        return "/manchester-united";
	    }
	 
	  
	  @GetMapping("/contact")
	    public String contact(Model model) {
		  
		  
	        model.addAttribute("news", newsRepository.findAll());
	        
	       
	        return "/contact";
	    }
	
	
	
	
	
	
	
}
