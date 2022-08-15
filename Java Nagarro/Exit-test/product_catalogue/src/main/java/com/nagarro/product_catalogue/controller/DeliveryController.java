package com.nagarro.product_catalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.product_catalogue.service.impl.DeliveryService;



@RestController
@CrossOrigin("*")
public class DeliveryController {

	@Autowired
	private DeliveryService service;

//	@GetMapping(path = "/pincodes/{pincode}")
//	public boolean findAllProducts(@PathVariable int pincode) {
//		return service.isDeliverable(pincode);
//	}
	
	@GetMapping(path = "/days/{pincode}")
	public int getDaysRequired(@PathVariable int pincode) {
		return service.getDaysRequired(pincode);
	}
	
}
