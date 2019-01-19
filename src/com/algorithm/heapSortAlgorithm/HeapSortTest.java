package com.algorithm.heapSortAlgorithm;

public class HeapSortTest {
	public static void main(String[] args) {
		HeapSortAlgorithm hsa=new HeapSortAlgorithm();
		int[] nums={9,8,7,6,5,4,3,2,1};
		long newTimeStart=System.currentTimeMillis();
		hsa.printArr(nums);
		long newTimeEnd=System.currentTimeMillis();
		long time=newTimeEnd-newTimeStart;
		System.out.println("所用时间:"+time);
	}

}
