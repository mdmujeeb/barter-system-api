package com.mujeeb.mosquedashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findById(int id);
    
    List<User> findByEmail(String email);
    
    List<User> findByMobile(String mobile);
    
    List<User> findByFirstName(String firstName);
    
    List<User> findByLastName(String lastName);
    
    List<User> findByFirstNameAndLastName(String firstName, String lastName);
}
