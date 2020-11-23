package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.comparators.BusCostComparator;
import com.comparators.BusIdComparator;
import com.comparators.BusNameComparator;
import com.comparators.BusRatingsComparator;
import com.comparators.BusTypeComparartor;
import com.model.Bus;

public class BusMain {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(121, "abc travels", 123.222, 4.5f, "Sleeper"));
		busList.add(new Bus(456, "xyz travels", 453.222, 4.4f, "Semi-Sleeper"));
		busList.add(new Bus(214, "java travels", 213.222, 1.5f, "Seater"));
		busList.add(new Bus(786, "uvw travels", 213.222, 4.5f, "Semi-Sleeper"));
		busList.add(new Bus(151, "test travels", 323.222, 2.5f, "Seater"));
		
		System.out.println("\nPrinting All the Buses");
		printBusList(busList);
		
		Collections.sort(busList);
		
		System.out.println("\nPrinting All the Buses sorted based on id by Deafault");
		printBusList(busList);
		
		//Using Lambda Function
		Collections.sort(busList, (Bus b1, Bus b2)->{
			Integer i1 = b1.getId();
			Integer i2 = b2.getId();
			return i1.compareTo(i2);
		});
		System.out.println("\nPrinting All the Buses sorted based on ID by using Lambda FUnction");
		printBusList(busList);
		
		Collections.sort(busList,(Bus b1, Bus b2)->{
			String s1 = b1.getName();
			String s2 = b2.getName();
			return s1.compareTo(s2);
		});
		System.out.println("\nPrinting All the Buses sorted based on Name by using Lambda FUnction");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1, Bus b2)->{
			Double d1 = b1.getCost();
			Double d2 = b2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting All the Buses sorted based on Cost by using Lambda FUnction");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1, Bus b2)->{
			Float f1 = b1.getRatings();
			Float f2 = b2.getRatings();
			return f1.compareTo(f2);
		});
		System.out.println("\nPrinting All the Buses sorted based on Ratings by using Lambda FUnction");
		printBusList(busList);
		
		Collections.sort(busList,(Bus b1, Bus b2)->{
			String s1 = b1.getBusType();
			String s2 = b2.getBusType();
			return s1.compareTo(s2);
		});
		System.out.println("\nPrinting All the Buses sorted based on Type by using Lambda FUnction");
		printBusList(busList);
		
		
		//com.comparators
		Collections.sort(busList, new BusIdComparator());
		System.out.println("\nPrinting All the Buses sorted based on ID by using Comparators");
		printBusList(busList);
		
		Collections.sort(busList, new BusNameComparator());
		System.out.println("\nPrinting All the Buses sorted based on Name by using Comparators");
		printBusList(busList);
		
		Collections.sort(busList, new BusCostComparator());
		System.out.println("\nPrinting All the Buses sorted based on cost by using Comparators");
		printBusList(busList);
		
		Collections.sort(busList, new BusRatingsComparator());
		System.out.println("\nPrinting All the Buses sorted based on Bus Ratings by using Comparators");
		printBusList(busList);
		
		Collections.sort(busList, new BusTypeComparartor());
		System.out.println("\nPrinting All the Buses sorted based on Bus Type by using Comparators");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1, Bus b2)->{
			Double d1 = b1.getCost();
			Double d2 = b2.getCost();
			int x = d1.compareTo(d2);
			if(x==0) {
				Float f1 = b1.getRatings();
				Float f2 = b2.getRatings();
				return f2.compareTo(f1);
			}
			return x;
		});
		System.out.println("\nPrinting All the Buses sorted based on Cost in Asc and then by Ratings in Desc by using Lambda Function");
		printBusList(busList);
	}
	
	public static void printBusList(List<Bus> busList) {
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
	}

}
