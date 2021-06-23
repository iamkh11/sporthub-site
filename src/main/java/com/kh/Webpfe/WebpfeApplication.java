package com.kh.Webpfe;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kh.Webpfe.models.Role;

import com.kh.Webpfe.repositories.RoleRepository;





@SpringBootApplication
public class WebpfeApplication {
	
	

	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(WebpfeApplication.class, args);
	}
	
	
	
	
	
	
	@Bean
	CommandLineRunner init(RoleRepository roleRepository) {

	    return args -> {

	        Role adminRole = roleRepository.findByRole("ADMIN");
	        if (adminRole == null) {
	            Role newAdminRole = new Role();
	            newAdminRole.setRole("ADMIN");
	            roleRepository.save(newAdminRole);
	        }

	        Role userRole = roleRepository.findByRole("USER");
	        if (userRole == null) {
	            Role newUserRole = new Role();
	            newUserRole.setRole("USER");
	            roleRepository.save(newUserRole);
	        }
	        
	        Role editorRole = roleRepository.findByRole("EDITOR");
	        if (editorRole == null) {
	            Role newEditorRole = new Role();
	            newEditorRole.setRole("EDITOR");
	            roleRepository.save(newEditorRole);
	        }
	        
	    };

	}

}
