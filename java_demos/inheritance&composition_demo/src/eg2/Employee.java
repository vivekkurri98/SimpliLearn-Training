package eg2;

public class Employee extends Person{
	
	private String designation;
	private Organization organization;
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, Organization organization, Address address) {
		super(id, name);
		this.designation = designation;
		this.organization = organization;
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printEmployee() {
		printPerson();
		System.out.println("Designation: "+designation);
		organization.printOrganization();
		address.printAddress();
	}
	

}
