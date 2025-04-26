package com.mujeeb.barter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mujeeb.barter.beans.BaseException;
import com.mujeeb.barter.entity.User;
import com.mujeeb.barter.repository.UserRepository;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User authenticateUser(String userId, String password) throws BaseException {

        if(password == null || password.isEmpty()) {

            throw new BaseException(12);
        }

        User result = getUserByUserId(userId);

        if(password.equals(result.getPassword())) {
            return result;
        } else {
            throw new BaseException(14);
        }
    }

    public User getUserDetails(int id) {
        return userRepository.findById(id);
    }
    
    public User getUserByUserId(String userId) throws BaseException {

    	 List<User> result = null;
         try {
             result = userRepository.findByUserId(userId);

         } catch (Exception e) {

             e.printStackTrace();
             throw new BaseException(14);
         }

         if(result == null || result.isEmpty()) {

             throw new BaseException(14);
         } else {

             return result.get(0);
         }
    }
    
    public User saveUser(User user) {
    	return userRepository.save(user);
    }
    
    public boolean deleteUser(User user) {
    	userRepository.delete(user);
    	return true;
    }
}
