package com.school.repositories;

import com.school.model.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthenticationDAO extends CrudRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);
	
}