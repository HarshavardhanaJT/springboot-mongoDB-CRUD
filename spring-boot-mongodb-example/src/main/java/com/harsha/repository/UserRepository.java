package com.harsha.repository;

import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.harsha.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	@Query("{'userId':?0}")
	User findUserById(String userId);
	
	@DeleteQuery("{'userId':?0}")
	void deleteById(String userId);
}
