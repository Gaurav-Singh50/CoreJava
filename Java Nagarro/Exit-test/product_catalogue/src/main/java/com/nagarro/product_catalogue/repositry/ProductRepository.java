package com.nagarro.product_catalogue.repositry;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nagarro.product_catalogue.model.Product;



public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public List<Product> findByProductCodeContaining(Long id);
	
	@Query("from Product as p where p.name like (%:keyword%) or p.brand like (%:keyword%) or p.productCode like (%:keyword%)")
	public List<Product> filterByName_Brand_Code(String keyword);
	
	@Query("from Product as p where p.category like (%:keyword%) or p.description like (%:keyword%)")
	public List<Product> filterByCategory_Description(String keyword);
//
	@Query("from Product as p where p.price between :minprice and :maxprice")
	public List<Product> filterByPricerange(float minprice, float maxprice);
	
//	public List<Product> findByBrand(String keyword);
}
