package com.algorithm.selectAlgorithm;

/**
 * 简单选择排序  
 * @author shizeying  
 * @Date 2019-01-16 23:13:51  
 * @Description   
 */
public class SelectSortAlgorithm {

	/**
	 * 选择排序算法 在未排列序列中元素继续寻找最小元素,然后放到排序序列末尾 以此类推,知道所有元素排序完毕
	 * 
	 * @param nums
	 */
	private static int[] selectSort(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {// 做第i趟排序
			int k = i;// 待确定位置
			for (int j = k + 1; j < nums.length; j++) {
				if (nums[j] < nums[k]) {
					k = j;// 记录下目前找到的最小值所在的位置
				}
			}
			swap(nums, i, k);
		}
		return nums;
	}

	/**
	 * 数据交换
	 * 
	 * @param nums
	 * @param i
	 * @param j
	 */
	private static void swap(int[] nums, int i, int j) {
		if (i != j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

	}

	private static void printArr(int[] nums) {
		System.out.println("基数排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = selectSort(nums);
		System.out.println();
		System.out.println("基数排序后的数组:");
		for (int i : newNums) {
			System.out.print(i + "\t");
		}
	}

	public static String time(int[] nums) {
		long newTimeStart = System.currentTimeMillis();
		printArr(nums);
		long newTimeEnd = System.currentTimeMillis();
		float time = (float) (newTimeEnd - newTimeStart) / 1000;
		return ("所用时间:" + time + "ms");
	}
}
