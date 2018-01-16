package com.vipin;

import java.util.Collections;
import java.util.Deque;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		List<String> lst =  new CopyOnWriteArrayList<>();
		
		lst.add("First");
		lst.add("Second");
		lst.add("Thirds");
		
		System.out.println(lst);
		System.out.println();
		
		Collections.sort(lst);
		
		System.out.println(lst);
		System.out.println();
		
		
		System.out.println(Collections.binarySearch(lst, "Four"));
		System.out.println();
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		//HashSet<String> lhs = new HashSet<>();
		
		lhs.add("First");
		lhs.add("Second");
		lhs.add("Third");
				
		System.out.println(lhs);
		System.out.println();
		
		
		Deque<String> dq = new LinkedList<>();
		
		dq.addFirst("First");
		dq.add("Second");
		dq.addFirst("Third");
		dq.addLast("Last");
		
		System.out.println(dq);
		System.out.println();
		
		LinkedList<Integer> lle = new LinkedList<>();
		
		Hashtable<Integer, Integer> ht;
		
		Properties p;
		
		Dictionary<String, Integer> d;
		
		lle.add(new Integer(2));
		
		lle.addFirst(new Integer(1));
		
		lle.addLast(new Integer(3));
		
		System.out.println(lle);
		
		lle.removeFirst();
		System.out.println(lle);
		
		lle.add(3, new Integer(6));
	}
}