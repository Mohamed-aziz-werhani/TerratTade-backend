
package com.module_project.service1_ex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.module_project.service1_ex.model.Property;


public interface PropertyRepositry extends MongoRepository<Property,String>{
    
}
