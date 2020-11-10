package demo;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("Vivek");
		s1.setAge(22);
		s1.setScore(100);
		
		System.out.println("Id: "+s1.getId());
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Score: "+s1.getScore());
		
		Student s2 = new Student();
		s2.setId(20);
		s2.setName("Kurri");
		s2.setAge(22);
		s2.setScore(200);
		s2.printStudent();
	}

}
