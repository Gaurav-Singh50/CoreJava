package com.nagarro.product_catalogue.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.product_catalogue.model.Deliverable;



public interface DeliverableRepository extends JpaRepository<Deliverable, Integer> {

}
