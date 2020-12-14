package com.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	
	public List<Integer> sortList(List<Integer> l) {
		
		for(int i=0; i<l.size(); i++) {
			for(int j=l.size()-1; j>i; j--) {
				if(l.get(i) > l.get(j)) {
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
		
		return l;
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		int a = 0;
		System.out.println("Enter the inputs to list: ");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			a = scan.nextInt();
			l.add(a);
		}
		 
//		System.out.println(l);
//		Collections.sort(l);
//		System.out.println(l);
		
		ListPractice lp = new ListPractice();
		System.out.println(lp.sortList(l));
		
//		for(int k : l) { 
//			System.out.println(k);
//		}

	}

}

/*
 * Collection
 * List -> ArrayList -> LinkedList -> Vector ->(Stack)
 * Queue -> LinkedList -> PriorityQueue
 * Set -> HashSet -> LinkedHashSet
 * 	   -> SortedSet -> NavigableSet -> TreeSet
 */

