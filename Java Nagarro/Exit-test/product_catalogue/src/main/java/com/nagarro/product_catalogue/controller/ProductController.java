package com.nagarro.product_catalogue.controller;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nagarro.product_catalogue.model.Product;
import com.nagarro.product_catalogue.service.impl.ProductService;


@RestController
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	public static String uploadDirectory = System.getProperty("user.dir")+"/src/msin/webapp/productImages";

	/**
	 * addProduct method takes Product Object from request body and passes it to saveProduct
	 * method of service class for adding to database
	 * 
	 * @param Product - object of Product class to add in database
	 * @return the Product object that was added
	 */
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {		
		return service.addProduct(product);
	}

	/**
	 * findAllProducts method returns all the Products currently present in database
	 * 
	 * @return - list of Products present in database
	 */
	@GetMapping(path = "/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}

	/**
	 * findProductById method gets the id of the Product to search from url and call
	 * getProductById method of service class
	 * 
	 * @param id - Id of the Product to search
	 * @return object of Product class which has the id equal to the passed Id
	 */
	@GetMapping(path = "/products/{id}")
	public Product findProductById(@PathVariable long id) {
		return service.getProductById(id);
	}

	
	@GetMapping(path = "/products/price/{id}")
	public float findPriceById(@PathVariable long id) {
		return service.getPriceById(id);
	}

	/**
	 * deleteProduct method gets the id of the Product to delete from url and call
	 * deleteProduct method of service class to delete that Product from database
	 * 
	 * @param id - Id of the Product to delete
	 * @return the id of Product that was removed
	 */
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable long id) {
		return service.deleteProduct(id);
	}
	
	
	@GetMapping("/products/filter/{query}")
	public List<Product> searchProduct(@PathVariable String query){
		if(query.length() == 0) {
			return service.getProducts();
		}
		else {
	//		List<Product> filterResult = service.searchProduct(query);
	//		if(filterResult)
			return service.searchProduct(query);
		}
	}
	
	@GetMapping("/products/filter/{minprice}/{maxprice}")
	public List<Product> searchProduct(@PathVariable float minprice, @PathVariable float maxprice){
		return service.filterByPrice(minprice, maxprice);
	}
	
	
}
