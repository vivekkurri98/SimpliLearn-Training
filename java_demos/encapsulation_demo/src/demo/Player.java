package demo;

public class Player {
	private int id;
	private String name;
	
	public Player() {
	}
	
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
}
	
	public void printPlayer() {
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
	}
	
	//setter is used to modify or add new member
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getter will give the latest modified data
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}

/*
 * Encapsulated Class
 * DTO - Data Transfer Class
 * VO - Variable Object Class
 * bean class i.e smallest class
 * Model Class
 * POJO - Plain Old Java Object Class
*/
