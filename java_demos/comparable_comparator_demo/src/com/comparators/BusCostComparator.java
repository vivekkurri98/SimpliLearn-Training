package com.comparators;

import java.util.Comparator;

import com.model.Bus;

public class BusCostComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus b1, Bus b2) {
		Double i1 = b1.getCost();
		Double i2 = b2.getCost();
		return i1.compareTo(i2);
	}

}
