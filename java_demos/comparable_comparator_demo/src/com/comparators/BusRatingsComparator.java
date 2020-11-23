package com.comparators;
import java.util.Comparator;

import com.model.Bus;

public class BusRatingsComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus b1, Bus b2) {
		Float f1 = b1.getRatings();
		Float f2 = b2.getRatings();
		return f1.compareTo(f2);
	}
	
}
