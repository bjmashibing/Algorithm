package com.mashibing;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int num = 100;
		int pos = -1;

		for (int start = 0, end = a.length - 1; start <= end;) {
			int middle = (start + end) / 2;
			if (a[middle] == num) {
				pos = middle;
				break;
			} else if (a[middle] < num) {
				start = middle+1;
			} else {
				end = middle-1;
			}
		}

		System.out.println(pos);
	}
}
