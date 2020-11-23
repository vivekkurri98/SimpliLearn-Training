package com.comparators;

import java.util.Comparator;

import com.model.Bus;

public class BusIdComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus b1, Bus b2) {
		Integer i1 = b1.getId();
		Integer i2 = b2.getId();
		return i1.compareTo(i2);
	}
	

}
