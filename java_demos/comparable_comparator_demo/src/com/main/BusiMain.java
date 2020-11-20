package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Bus;

public class BusiMain {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(121, "abc travels", 123.222, 4.5f, "Sleeper"));
		busList.add(new Bus(456, "xyz travels", 453.222, 4.4f, "Semi-Sleeper"));
		busList.add(new Bus(214, "java travels", 213.222, 1.5f, "Seater"));
		busList.add(new Bus(786, "uvw travels", 13.222, 3.5f, "Semi-Sleeper"));
		busList.add(new Bus(151, "test travels", 323.222, 2.5f, "Seater"));
		
		System.out.println("\nPrinting All the Buses");
		printBusList(busList);
		
		Collections.sort(busList);
		
		System.out.println("\nPrinting All the Buses sorted based on id");
		printBusList(busList);
	}
	
	public static void printBusList(List<Bus> busList) {
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
	}

}
