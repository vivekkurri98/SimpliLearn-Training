package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		Organization org1 = new Organization(12345, "Capgemini", "France");
		Address adr1 = new Address(8, 400008, "Mumbai", "Mumbai Central", "India");
		Employee e1 = new Employee(10, "Vivek", "Software Developer", org1, adr1);
		
		e1.printEmployee();
	}

}
