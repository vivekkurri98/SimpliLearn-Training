package com.comparators;

import java.util.Comparator;

import com.model.Bus;

public class BusNameComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus b1, Bus b2) {
		
		return b1.getName().compareTo(b2.getName());
	}

}
