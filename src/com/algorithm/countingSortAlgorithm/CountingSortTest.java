package com.algorithm.countingSortAlgorithm;

public class CountingSortTest {
	public static void main(String[] args) {
		CountingSortAlgorithm csa=new CountingSortAlgorithm();
		int[] nums = { 329, 457, 657, 839, 436, 720 };
		System.out.println(csa.time(nums));
	}
}
