package com.kh.Webpfe.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import nz.net.ultraq.thymeleaf.LayoutDialect;

/**
 *
 * @author didin
 */
@Configuration
public class PageConfig implements WebMvcConfigurer {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
    
    @Bean
    public LayoutDialect layoutDialect() {
    return new LayoutDialect();
    }
   
    

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	
    	 registry.addViewController("/").setViewName("manchester-united");
        registry.addViewController("/dashboard").setViewName("dashboard");
        registry.addViewController("/login").setViewName("login");
       
       
        registry.addViewController("/manchester-united").setViewName("manchester-united");
        registry.addViewController("/contact").setViewName("contact");
    }

    
    



}
