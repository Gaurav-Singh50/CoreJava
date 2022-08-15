package com.nagarro.product_catalogue.model;

import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue
	private long productCode;
	private String name;
	private String description;
	private String brand;
	private float price;
	private String category;
	@Column(columnDefinition = "TEXT")
	private String imageUrl;
	
	public Product() {
		super();
	}
	
	

	public Product(long productCode, String name, String description, String brand, float price, String category,
			String imageUrl) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
	}



	public long getProductCode() {
		return productCode;
	}

	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

	public String getimageUrl() {
		return imageUrl;
	}



	public void setimageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", description=" + description + ", brand="
				+ brand + ", price=" + price + ", category=" + category + ", imageUrl=" + imageUrl + "]";
	}


	
	
	
	
}
