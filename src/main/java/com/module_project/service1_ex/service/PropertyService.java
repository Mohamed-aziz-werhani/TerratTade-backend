
package com.module_project.service1_ex.service;

import com.module_project.service1_ex.model.Property;
import org.springframework.stereotype.Service;
import com.module_project.service1_ex.repository.PropertyRepositry;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepositry propertyRepositry;
}
