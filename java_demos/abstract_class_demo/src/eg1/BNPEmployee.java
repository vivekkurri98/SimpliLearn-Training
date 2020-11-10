package eg1;

public class BNPEmployee extends EMS{

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("BNP Employee added to Oracle DB");
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("BNP Employee updated in Oracle DB");
	}

	@Override
	public void getEmployeeById(int id) {
		// TODO Auto-generated method stub
		System.out.println("BNP Employee by id retrieved from Oracle DB");
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		System.out.println("BNP All Employee retrieved from Oracle DB");
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("BNP Employee deleted from Oracle DB");
	}

}
