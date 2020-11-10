package eg2_this;

public class Employee {
	
	int id;
	String name;
	int age;
	String city;
	
	public Employee() {
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, int age, String city) {
		this(id,name); //construction chaining: re-suing of existing constructor
		this.age = age;  //variable shadowing
		this.city = city;
	}
	
	public void printEmployee() {
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		
	}
	

}
