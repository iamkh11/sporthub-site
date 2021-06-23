package com.kh.Webpfe.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;


import com.kh.Webpfe.models.Staff;








@Repository
public interface StaffRepository extends MongoRepository<Staff, String> {

	 @Override
	    public void delete(Staff players);
	
	    List<Staff> findAll();
	
	
	
	
	
	
	
	
	
	
	
	
}
