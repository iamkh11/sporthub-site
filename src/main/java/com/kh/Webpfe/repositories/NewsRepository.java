package com.kh.Webpfe.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kh.Webpfe.models.News;






public interface NewsRepository  extends MongoRepository<News, String>  {

	 @Override
	public void delete(News news);
	
	    List<News> findAll();
	    
	  
	
	
	
}
