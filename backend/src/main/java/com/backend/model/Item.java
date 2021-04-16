package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "item")
public class Item {
	@Id
	private int id;
	private int restaurant_id;
	private int category_id;
	private String imageUrl;
	private String name;
	private String category;
	private String size;
	private String toppings;
	private int prize;
	private int quantity;
	
	public Item(int id, int restaurant_id, int category_id, String imageUrl, String name, String category, String size,
			String toppings, int prize, int quantity) {
		super();
		this.id = id;
		this.restaurant_id = restaurant_id;
		this.category_id = category_id;
		this.imageUrl = imageUrl;
		this.name = name;
		this.category = category;
		this.size = size;
		this.toppings = toppings;
		this.prize = prize;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", restaurant_id=" + restaurant_id + ", category_id=" + category_id + ", imageUrl="
				+ imageUrl + ", name=" + name + ", category=" + category + ", size=" + size + ", toppings=" + toppings
				+ ", prize=" + prize + ", quantity=" + quantity + "]";
	}
	
}
