package com.nagarro.product_catalogue.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.product_catalogue.model.Role;

public interface RoleRepositry extends JpaRepository<Role ,Long>{

}
