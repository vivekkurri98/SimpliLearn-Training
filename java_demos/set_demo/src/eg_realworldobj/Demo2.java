package eg_realworldobj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.model.Bus;

public class Demo2 {

	public static void main(String[] args) {
		Set<Bus> busList = new TreeSet<>();
		busList.add(new Bus(121, "abc travels", 123.222, 4.5f, "Sleeper"));
		busList.add(new Bus(456, "xyz travels", 453.222, 4.4f, "Semi-Sleeper"));
		busList.add(new Bus(214, "java travels", 213.222, 1.5f, "Seater"));
		busList.add(new Bus(786, "uvw travels", 213.222, 4.5f, "Semi-Sleeper"));
		busList.add(new Bus(151, "test travels", 323.222, 2.5f, "Seater"));
		busList.add(new Bus(786, "uvw travels", 213.222, 4.5f, "Semi-Sleeper"));
		busList.add(new Bus(121, "abc travels", 123.222, 4.5f, "Sleeper"));
		busList.add(new Bus(999, "new travels", 123.222, 4.5f, "Sleeper"));
		
		
		System.out.println("\nPrinting All the Buses");
		printBusList(busList);

	}
	public static void printBusList(Set<Bus> busList) {
		for(Bus b : busList) {
			System.out.println(b);
		}
	}	
}
	
