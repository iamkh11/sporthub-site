package com.kh.Webpfe.repositories;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.kh.Webpfe.models.Team;




@Repository
public interface TeamRepository extends MongoRepository<Team, String> {

	
	 @Override
	public void delete(Team teams);
	
	List<Team> findAll();
	

	
	
}
