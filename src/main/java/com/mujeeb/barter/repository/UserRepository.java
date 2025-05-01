package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findById(Long id);
	
	List<User> findAll();
    
    List<User> findByUserId(String userId);
    
    List<User> findByEmail(String email);
    
    List<User> findByMobile(String mobile);
    
    List<User> findByFirstName(String firstName);
    
    List<User> findByLastName(String lastName);
    
    List<User> findByFirstNameAndLastName(String firstName, String lastName);
}
