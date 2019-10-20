package com.mashibing;

import java.util.Arrays;

public class TTT {
	public static void main(String[] args) {
		
		
		int[] arr = {2, 4, 2, 3, 1, 1, 0, 0, 5, 6, 8, 5, 4, 0, 9, 9};
		
		int[] count = new int[10];
		
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		System.out.println(Arrays.toString(count));
		
		for(int i=1; i<count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		
		System.out.println(Arrays.toString(count));
		
		for(int i=arr.length-1;i>=0; i--) {
			arr2[--count[arr[i]]] = arr[i];
		}
		
		/*for(int i=0, j=0; i<count.length; i++) {
			
			while(count[i]-- > 0) arr2[j++] = i;
		}*/
		
		System.out.println(Arrays.toString(arr2));
	}
}

class Cat {
	int id;
	String name;
	Cat(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
}
