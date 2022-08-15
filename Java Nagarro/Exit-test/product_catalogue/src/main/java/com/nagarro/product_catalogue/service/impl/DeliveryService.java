package com.nagarro.product_catalogue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.product_catalogue.model.Deliverable;
import com.nagarro.product_catalogue.repositry.DeliverableRepository;

import java.util.*;



@Service
public class DeliveryService {
	
	@Autowired
	private DeliverableRepository repository;
	
//	public boolean isDeliverable(int pincode) {
//		List <Deliverable> deliverableAreas = repository.findAll();
//		
//		for(Deliverable area: deliverableAreas) {
//			if(pincode == area.getPincode()){
//				return true;
//			}
//		}	
//		return false;
//		
//	}

	public int getDaysRequired(int pincode) {
		Deliverable not_Deliverable = new Deliverable(000000, -1); 
		Deliverable deliverable = repository.findById(pincode).orElse(not_Deliverable);
		
		return deliverable.getdays();
		
	}
}
