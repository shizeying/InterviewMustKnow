package com.algorithm.baseSortAlgorithm;

public class CardinalitySortTest {
	public static void main(String[] args) {
		CardinalitySortAlgorithm csa = new CardinalitySortAlgorithm();
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(csa.time(nums));
	}

}
