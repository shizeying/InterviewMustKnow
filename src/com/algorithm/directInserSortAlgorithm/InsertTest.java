package com.algorithm.directInserSortAlgorithm;

public class InsertTest {

	public static void main(String[] args) {
		DirectInserSortAlgorithm isa=new DirectInserSortAlgorithm();
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(isa.time(nums));
	}
}
