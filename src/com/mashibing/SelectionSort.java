package com.mashibing;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
		
		sort(arr);
		
		print(arr);
		
	}
	
	public static void sort(int[] arr) {
		for(int i=0; i<arr.length - 1; i++) {
			int minPos = i;
			
			for(int j=i+1; j<arr.length; j++) {
				minPos = arr[j] < arr[minPos] ? j : minPos;
			}
			
			//System.out.println("minPos:" + minPos);
			
			swap(arr, i, minPos);
			
			//System.out.println("经过第" + i + "次循环之后，数组的内容：");
			//print(arr);
		}
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
