package com.kh.Webpfe.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kh.Webpfe.models.Stadium;
import com.kh.Webpfe.models.Ticket;




@Repository
public interface TicketRepository  extends CrudRepository<Ticket, String>{

	
	@Override
	List<Ticket> findAll();
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
