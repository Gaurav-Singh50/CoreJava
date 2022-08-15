package com.nagarro.model;

import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="productDetailsTable")
public class Image 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="serialno")
	private int serialNo;
	@Column(name="imagetitle")
	private String title;
	@Column(name="imagequantity")
	private String quantity;
	@Column(name="imagesize")
	private String prodsize;
	@Transient
	private int size;
	@Column(columnDefinition="mediumblob")
	@Basic(fetch=FetchType.LAZY)
	private byte[] image;
	@ManyToOne
	private User user;

	public Image(String title2, int quantity2, double size2, byte[] bytes ) {}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getProdsize() {
		return prodsize;
	}

	public void setProdsize(String prodsize) {
		this.prodsize = prodsize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Image [serialNo=" + serialNo + ", title=" + title + ", quantity=" + quantity + ", prodsize=" + prodsize
				+ ", size=" + size + ", image=" + Arrays.toString(image) + ", user=" + user + "]";
	}

	public Image(int serialNo, String title, String quantity, String prodsize, int size, byte[] image, User user) {
		super();
		this.serialNo = serialNo;
		this.title = title;
		this.quantity = quantity;
		this.prodsize = prodsize;
		this.size = size;
		this.image = image;
		this.user = user;
	}

	public Image() {
	}

}
