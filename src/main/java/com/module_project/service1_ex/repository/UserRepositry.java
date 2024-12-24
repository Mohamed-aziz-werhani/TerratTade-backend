package com.module_project.service1_ex.repository;

import com.module_project.service1_ex.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepositry extends MongoRepository<User, String>{
    
      Optional<User> findByEmail(String email);
        Optional<User> findByname(String name);
}
