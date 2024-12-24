
package com.module_project.service1_ex.service;

import com.module_project.service1_ex.model.Offer;
import org.springframework.stereotype.Service;
import com.module_project.service1_ex.repository.OfferRepositry;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OfferService {

@Autowired
private OfferRepositry offerRepositry;



}
