package com.mashibing;

public class MergeSort {
	public static void main(String[] args) {
		//int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
		int[] arr = {1,4,7,8,3,6,9};
		sort(arr, 0, arr.length-1);
		
		print(arr);
		
	}
	
	public static void sort(int[] arr, int left, int right) {
		if (left == right) return;
		//∑÷≥…¡Ω∞Î
		int mid = left + (right-left)/2;
		//◊Û±ﬂ≈≈–Ú
		sort(arr, left, mid);
		//”“±ﬂ≈≈–Ú
		sort(arr, mid+1, right);
		
		merge(arr, left, mid+1, right);
	}
	
	static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
		int mid = rightPtr - 1;
		int[] temp = new int[rightBound - leftPtr + 1];
		
		int i = leftPtr; 
		int j = rightPtr;
		int k = 0;
		
		while(i <= mid && j <= rightBound) {
			temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		
		while(i<=mid) temp[k++] = arr[i++];
		while(j<=rightBound) temp[k++] = arr[j++];
		
		for(int m=0; m<temp.length; m++) arr[leftPtr +m] = temp[m];
		
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
