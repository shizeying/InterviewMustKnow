package com.algorithm.recursiveAlgorithm;

/**
 * 快速排序
 * @author shizeying
 * @Date 2019-01-16 21:14:19
 * @Description 查找中轴（最低位作为中轴）所在位置
 *
 * 
 
 */
public class QuickSortAlgorithm {

	/**
	 * 查找出中轴(默认是最低位low)的在nums数组排序后所在的位置
	 * 
	 * @param nums  待查找数组
	 * @param start 开始位置
	 * @param end   结束位置
	 * @return 中轴所在位置
	 */
	private static int getMiddle(int[] nums, int start, int end) {
		// 数组的第一个作为中轴
		int temp = nums[start];
		while (start < end) {
			while (start < end && nums[end] > temp) {
				end--;
			}
			// 比中轴小的记录移动到低端
			nums[start] = nums[end];
			while (start < end && nums[start] < temp) {
				start++;
			}
			// 比中轴大的记录移动到高端
			nums[end] = nums[start];
		}
		// 中轴记录到尾
		nums[start] = temp;
		// 返回中轴的位置
		return start;
	}

	/**
	 * 递归行书的分治排序算法
	 * 
	 * @param nums  带排序的数组
	 * @param start 开始位置
	 * @param end   结束位置
	 */
	private static void quickSort(int[] nums, int start, int end) {
		if (start < end) {
			// 将nums数组一分为二
			int middle = getMiddle(nums, start, end);
			// 对低字段进行递归排序
			quickSort(nums, start, middle - 1);
			// 对高字段进行递归排序
			quickSort(nums, middle + 1, end);
		}
	}

	/**
	 * 快速排序
	 * 
	 * @param nums 带排序的数组
	 */
	private static int[] select(int[] nums) {
		if (nums.length > 0) {
			quickSort(nums, 0, nums.length - 1);
		}
		return nums;
	}
	
	private static void printArr(int[] nums) {
		System.out.println("基数排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = select(nums);
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
		  float time=(float)(newTimeEnd-newTimeStart)/1000;
		return ("所用时间:" + time+"ms");
	}

}
