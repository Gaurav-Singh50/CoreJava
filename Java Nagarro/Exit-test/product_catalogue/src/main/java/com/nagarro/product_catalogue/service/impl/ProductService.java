package com.nagarro.product_catalogue.service.impl;

import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.nagarro.product_catalogue.model.Product;
import com.nagarro.product_catalogue.repositry.ProductRepository;




@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
	public Product getProductById(long id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteProduct(long id) {
		if((repository.findById(id).orElse(null)) != null)
			repository.deleteById(id);
		return "Product removed !! " + id;
	}
	
	public List<Product> searchProduct(String query){
		
		HashSet<Product> set = new HashSet<>();

		set.addAll(repository.filterByName_Brand_Code(query));
		set.addAll(repository.filterByCategory_Description(query));
		
		List<Product> searchResult = new ArrayList<>(set);
		return searchResult;
		
	}
	
	public float getPriceById(long id) {
		Product product = repository.findById(id).orElse(null);
		
		float price = 0;
		
		if(product != null)
			price = product.getPrice();
		
		return price;
	}

	public List<Product> filterByPrice(float minprice, float maxprice){
		
		HashSet<Product> set = new HashSet<>();

		set.addAll(repository.filterByPricerange(minprice, maxprice));
		
		List<Product> searchResult = new ArrayList<>(set);
		return searchResult;
		
	}
	
}
