
package com.module_project.service1_ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.module_project.service1_ex.service.OfferService;


@RestController
public class OfferController {

@Autowired
private OfferService offerService;
}
