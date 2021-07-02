package com.kh.Webpfe.controllers;


import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.Webpfe.repositories.MatchReposiroty;
import com.kh.Webpfe.repositories.TicketRepository;
import com.kh.Webpfe.helpers.ZXingHelper;





@Controller
public class MatchController {
	
	@Autowired
	private MatchReposiroty matchRepository;
	
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
		        
		      
		       
		        return "fixtures-hand";
		    }
		  
		  
		  
		  
		  
		  
		  @RequestMapping("/buy-ticket")
		    public String ticket(Model model) {
				
		        model.addAttribute("match", matchRepository.findAll());
		        model.addAttribute("ticket", ticketRepository.findAll());
		        return "buy-ticket";
		    }

			@RequestMapping(value = "qrcode/{match_tag}", method = RequestMethod.GET)
			public void qrcode(@PathVariable("match_tag") String match_tag, HttpServletResponse response) throws Exception {
				response.setContentType("image/png");
				OutputStream outputStream = response.getOutputStream();
				outputStream.write(ZXingHelper.getQRCodeImage(match_tag, 500, 500));
				outputStream.flush();
				outputStream.close();
			}
		
	
	
	
	
}








