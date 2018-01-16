package com.vipin.ds;

import java.util.HashMap;
import java.util.HashSet;

class Node {
	
	private int data;
	private String key;
	private Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", key=" + key + ", next=" + next + "]";
	}
}

public class MyHashTable {
	
	private Node[] nodeArray = new Node[100];
	
	public MyHashTable() {
		for(int i=0 ; i<100; i++) {
			nodeArray[i] = new Node();
		}
	}
	
	public void print() {
		for(int i=0 ; i<100; i++) {
			System.out.println(nodeArray[i]);
		}
	}
	
	private int getIndex(String key) {
		
		long hashCode = Math.abs(key.hashCode());
		
		//System.out.println("Math.abs(hashcode) for " + key + " is   --> " +hashCode );
		return  (int )hashCode%100;
	}
	
	public void add(String key) {
		
		int index = getIndex(key);
		
		Node node = nodeArray[index];
		node.setKey(key);
		node.setData(1);
		node.setNext(null);
	}
	
	public Node get(String key) {
		
		
		HashMap hm;
		
		HashSet hs;
		
		
		int index = getIndex(key);
		System.out.println("Index for key --> " + key + " is " + index);
		
		Node node = nodeArray[index];
		return node;
	}
	
	public static void main(String[] str) {
		
		MyHashTable mht = new MyHashTable();
		mht.add("first");
		mht.add("second");
		mht.add("three");
		
		Node node1 = mht.get("first");
		System.out.println("node1 is " + node1.toString());
		
		Node node2 = mht.get("second");
		System.out.println("node2 is " + node2.toString());
		
		Node node3 = mht.get("three");
		System.out.println("node3 is " + node3.toString());
	}	
}
