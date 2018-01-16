package com.vipin;

import java.util.List;

import java.util.ListIterator;
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class First {

	public static void main(String s[]) {

		HashMap<String, Integer> hm;
		HashSet<String> hs1;
		
		TreeMap<String, Integer> tm;
		TreeSet<String> ts;
		
		
		Hashtable<String, Integer> ht = new Hashtable<>();  
		
		ht.put("vipin", 1);
		ht.put("vipin", 2);
		ht.put("vipin", 3);
		
		
		HashSet<String> hs = new HashSet<>();  // Uses Hash table as underlying DS
		hs.add("One");
		hs.add("Three");
		hs.add("Two");
		System.out.println("HashSet is " + hs);
		System.out.println("hashCode of hs is " + hs.hashCode());
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(); // Uses Hash table and Linked list as underlying DS
		lhs.add("One");
		lhs.add("Three");
		lhs.add("Two");
		System.out.println("LinkedHashSet is " + hs);
		
		
		SortedSet<String> ss = new TreeSet<>(); // Entries are sorted according to some rule.
		ss.add("Z");
		ss.add("D");
		ss.add("F");
		ss.add("K");
		ss.add("P");
		System.out.println("SortedSet is " + ss);
		
		
		Vector<String> v = new Vector<>();
		v.add("First");
		v.add("two");
		
		//System.out.println("Vector is "+v);
		
		
		List<String> listString = new ArrayList<String> ();
		
		//Collection<String> listString = new ArrayList<String> ();
		
		listString.add("Second");
		listString.add("Third");
		listString.add("First");
		
		listString.add(0, "Replaced one!!!");
		
		//System.out.println("Before sorting using Collections utility class, the list is");
		//System.out.print(listString);
		//System.out.println("\n");
		
		//Collections.sort(listString);
		
		//System.out.println("The sort list is " + listString);
		
		Set<Integer> set = new HashSet<>(); // <> Diamond operator
		
		set.add(new Integer(5));
		set.add(new Integer(3));
		set.add(new Integer(1));
		set.add(new Integer(4));
		set.add(new Integer(2));
		
		ListIterator<String> litr = listString.listIterator();
		
		while(litr.hasNext()) {
			//System.out.println("Object in List is --> " + litr.next());
		}
		
		//System.out.println("The set is " + set);
		
		Iterator<Integer> itr = set.iterator();	
		while(itr.hasNext()) {
			System.out.println("Object is -> " + itr.next());
		}
		
		List lst = new ArrayList();
		
		lst.add("First");
		lst.add(new Integer(10));
		
		//System.out.println();
		
		//System.out.println("The non-Generic lst is " + lst);
		
	}
}