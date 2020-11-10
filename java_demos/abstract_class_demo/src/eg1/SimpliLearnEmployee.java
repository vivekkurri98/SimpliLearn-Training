package eg1;

public class SimpliLearnEmployee extends EMS{

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("SimpliLearn Employee added to MySQL DB");
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("SimpliLearn Employee updated in MySQL DB");
	}

	@Override
	public void getEmployeeById(int id) {
		// TODO Auto-generated method stub
		System.out.println("SimpliLearn Employee by id retrieved from MySQL DB");
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		System.out.println("SimpliLearn Employee retrieved to MySQL DB");
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("SimpliLearn Employee deleted to MySQL DB");
	}
	
	

}
