package eg1;

public class EmsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EMS ems = new BNPEmployee();
		ems.addEmployee();
		ems.updateEmployee();
		ems.getEmployeeById(10);
		ems.getAllEmployee();
		ems.deleteEmployee();
		
		System.out.println();
		EMS simplilearn = new SimpliLearnEmployee();
		simplilearn.addEmployee();
		simplilearn.updateEmployee();
		simplilearn.getEmployeeById(12);
		simplilearn.getAllEmployee();
		simplilearn.deleteEmployee();
	}

}
