package com.example.lab1.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="product")
public class Product {
@Id
private int id;
private String name;
private int prize;
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
public int getPrize() {
	return prize;
}
public void setPrize(int prize) {
	this.prize = prize;
}
public Product(int id, String name, int prize) {
	super();
	this.id = id;
	this.name = name;
	this.prize = prize;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}

