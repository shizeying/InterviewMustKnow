package com.algorithm.bubbleSort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author shizeying
 * @Date 2019-01-19 18:00:02
 * @Description 
 *
 * 
 
 */
public class BubbleSort {

	/**
	 * 冒泡排序 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 针对所有的元素重复以上的步骤，除了最后一个。
	 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	 * 
	 * @param numbers
	 */
	public static void bubbleSort(int[] numbers) {
		int temp = 0;
		int size = numbers.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				// 交换位置
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] nums = { 49, 38, 65, 97, 76, 13, 27, 49 };
		System.out.print("排序前:");
		for (int i : nums) {
			System.out.print(i + "\t");
		}
		long newTimeStart = System.currentTimeMillis();
		bubbleSort.bubbleSort(nums);
		long newTimeEnd = System.currentTimeMillis();
		long time = newTimeEnd - newTimeStart;
		System.out.println("所用时间:" + time);
		System.out.println();
		System.out.print("排序后:");
		for (int i : nums) {
			System.out.print(i + "\t");
		}

	}

}
