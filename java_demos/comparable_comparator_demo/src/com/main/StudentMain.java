package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(101, "Vivek", 22, "Mumbai Central", 66.58));
		studentList.add(new Student(502, "Kunal", 22, "Mumbai", 76.58));
		studentList.add(new Student(303, "Sunny", 22, "Kamathipura", 70.58));
		studentList.add(new Student(104, "Amol", 21, "Lower Parel", 66.75));
		studentList.add(new Student(405, "Suchit", 21, "KP", 66.76));
		studentList.add(new Student(206, "Sachin", 22, "Sion", 69.58));
		studentList.add(new Student(707, "Ritesh", 22, "Dombivali", 80.58));
		studentList.add(new Student(809, "Haresh", 22, "Colaba", 86.75));
		studentList.add(new Student(905, "Pravin", 21, "Sion", 66.76));
		
		System.out.println("Printing All Students");
		printStudentList(studentList);
		
		Collections.sort(studentList);
		System.out.println("\nPrinting All Students by ID using CompareTo");
		printStudentList(studentList);
		
		Collections.sort(studentList,(Student s1, Student s2)->{
			Integer i1 = s1.getId();
			Integer i2 = s2.getId();
			return i1.compareTo(i2);
		});
		System.out.println("\nPrinting All Students by age using Lambda");
		printStudentList(studentList);
		
		Collections.sort(studentList, (Student s1, Student s2)->{
			Double d1 = s1.getPercentage();
			Double d2 = s2.getPercentage();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting All Students by Percentage");
		printStudentList(studentList);
		
	}
	public static void printStudentList(List<Student> studentList) {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
	}

}
