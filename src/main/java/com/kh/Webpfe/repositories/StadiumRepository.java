package com.kh.Webpfe.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.kh.Webpfe.models.Stadium;





@Repository
public interface StadiumRepository  extends MongoRepository<Stadium, String> {
	
	
	@Override
	public void delete(Stadium stadium);
	  List<Stadium> findAll();
	  

}


