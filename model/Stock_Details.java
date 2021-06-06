package com.bridgelabz.jsonprograms.model;

public class Stock_Details {

	
	private int id;
	private String name;
	private int weight;
	private int price;
	
	public Stock_Details() {
	
	}

	public Stock_Details(int id, String name, int weight, int price) {
		
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public int getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
