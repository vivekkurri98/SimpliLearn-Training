package com.app.model;

public class Player {
	
	private int id;
	private String name;
	private String teamName;
	private int age;
	private char gender;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, String teamName, int age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.teamName = teamName;
		this.age = age;
		this.gender = gender;
	}
	

	public Player(String name, String teamName, int age, char gender) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.age = age;
		this.gender = gender;
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", teamName=" + teamName + ", age=" + age + ", gender=" + gender
				+ "]";
	}

	
	
}
