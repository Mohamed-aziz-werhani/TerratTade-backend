package com.module_project.service1_ex.service;

import com.module_project.service1_ex.model.User;
import org.springframework.stereotype.Service;
import com.module_project.service1_ex.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;



@Service
public class UserService /*implements UserRepositry*/{
    
     @Autowired
    private UserRepositry userRepositry;
  @Autowired
    private PasswordEncoder passwordEncoder;
    public User createUser(User user){
       user.setPassword(this.passwordEncoder.encode(user.getPassword()));
    return this.userRepositry.save(user);
   
    }
    public User getByid(String id){
    
        return userRepositry.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }
     public User getByemail(String email){
    
        return userRepositry.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found with email: " + email));
    }
     
    public void deleteUserById(String id) {
        if (!userRepositry.existsById(id)) {
            throw new RuntimeException("User not found with ID: " + id);
        }
        userRepositry.deleteById(id);
    } 
    public boolean comparePassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
