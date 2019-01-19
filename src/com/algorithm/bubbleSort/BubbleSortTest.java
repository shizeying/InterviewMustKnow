package com.algorithm.bubbleSort;



public class BubbleSortTest {
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		int[] nums={9,8,7,6,5,4,3,2,1};
		System.out.println(bs.time(nums));
	}
}
