package com.mashibing.linkedlist;

public class Node {
	int value;
	Node next = null;
	
	Node(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return " "+value+ " ";
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next = n2;
		n2.next = n3;
		
		Node n = n1;
		while(n != null) {
			System.out.print(n);
			n = n.next;
		}
	}
}
