package com.mcit.webapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eproduct_data")
public class EProduct {
	
	//properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="modified_at")
	private Date modifiedAt;
	
	
	public EProduct() {}
	
	public EProduct(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
		this.createdAt = new Date();
		this.modifiedAt = new Date();
	}

	public EProduct(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createdAt = new Date();
		this.modifiedAt = new Date();
	}
	
	public EProduct(int id) {
		this.id = id;
	}

	// get & set methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Date getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
