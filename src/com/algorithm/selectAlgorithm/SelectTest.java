package com.algorithm.selectAlgorithm;

public class SelectTest {
	public static void main(String[] args) {
		SelectSortAlgorithm ssa=new SelectSortAlgorithm();
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(ssa.time(nums));
	}

}
