package com.mashibing;

/**
 * 
 * @author 马士兵 
 * http://www.mashibing.com
 * 
 * 取数组下标为固定值的数
 * 算法与数组长度无关，跟取的是第几个位置也没关系，这种时间复杂度我们称为O(1)
 * 求平均数所花费的时间，明显跟数组长度有关，这个关系和数组长度成正比，我们称为O(n)
 * 这里的n是问题的规模，或者说是数据的规模
 */

public class T_0001_BigO {
	public static void main(String[] args) {

		int[] a = new int[10_000_000];
		for (int m = 0; m < a.length; m++) {
			a[m] = m;
		}
		//算法开始时间
		long before = System.currentTimeMillis();

		for (long i = 0; i < 100000L; i++) {
			a[1000000] = 8;
			//avg(a);
		}

		long after = System.currentTimeMillis();

		System.out.println(after - before);

	}
	
	static int avg(int[] arr) {
		long sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return (int)sum/arr.length;
	}
}
