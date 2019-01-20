package com.algorithm.baseSortAlgorithm;

public class CardinalitySortTest {
	public static void main(String[] args) {
		CardinalitySortAlgorithm csa = new CardinalitySortAlgorithm();
		int[] nums = { 329, 457, 657, 839, 436, 720 };
		System.out.println(csa.time(nums));
	}

}
