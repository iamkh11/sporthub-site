package com.kh.Webpfe.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.kh.Webpfe.models.Players;







@Repository
public interface PlayersRepository extends CrudRepository<Players, String> {
	
	    @Override
	    public void delete(Players players);
	
	    List<Players> findAll();
	
	
	
	
}
