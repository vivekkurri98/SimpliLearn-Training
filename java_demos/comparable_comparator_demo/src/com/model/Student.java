package com.model;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private String area;
	private double percentage;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String area, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.area = area;
		this.percentage = percentage;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", City=" + area + ", percentage=" + percentage
				+ "]";
	}

	@Override
	public int compareTo(Student s) {
		Integer i1 = this.id;
		Integer i2 = s.id;
		return i1.compareTo(i2);
	}
	
	

}
