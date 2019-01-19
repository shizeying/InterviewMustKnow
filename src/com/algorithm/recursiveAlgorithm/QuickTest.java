package com.algorithm.recursiveAlgorithm;

public class QuickTest {
	public static void main(String[] args) {
		QuickSortAlgorithm qsa = new QuickSortAlgorithm();
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(qsa.time(nums));
	}

}
