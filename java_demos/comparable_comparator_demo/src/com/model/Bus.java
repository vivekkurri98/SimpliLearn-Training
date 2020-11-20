package com.model;

public class Bus implements Comparable<Bus> {
	private int id;
	private String name;
	private double cost;
	private float ratings;
	private String busType;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String name, double cost, float ratings, String busType) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.ratings = ratings;
		this.busType = busType;
	}

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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", cost=" + cost + ", ratings=" + ratings + ", busType=" + busType
				+ "]";
	}

	@Override
	public int compareTo(Bus b1) {
		Integer i1 = this.id;
		Integer i2 = b1.id;
		return i1.compareTo(i2);
	}
	
	

}
