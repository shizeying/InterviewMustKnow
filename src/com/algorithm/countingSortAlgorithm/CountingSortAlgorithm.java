package com.algorithm.countingSortAlgorithm;

import java.util.Arrays;
/**
 * 计数排序
 * @author shizeying
 * @Date 2019-01-21 22:43:32
 * @Description 
 */
public class CountingSortAlgorithm {

	private static int[] countingSort(int[] nums) {
		if (nums.length == 0)
			return nums;
		// 计算最大最小值,严谨实现用ifPresent检查下
		int max = Arrays.stream(nums).max().getAsInt();
		int min = Arrays.stream(nums).min().getAsInt();
		int N = nums.length;
		int R = max - min + 1;// 最大最小元素之间的范围[min.max]的长度
		// 计算频率,在需要的数组长度上额外加1
		int[] count = new int[R = 1];
		for (int i = 0; i < N; i++) {
			// 使用+1后的索引,有重复的该位置就自增
			count[nums[i] - min + 1]++;
		}
		// 频率->元素开始索引
		for (int r = 0; r < R; r++) {
			count[r + 1] += count[r];
		}
		// 元素按照开始索引分类，用到一个和待排数组一样大临时数组存放数据
		int[] aux = new int[N];
		for (int i = 0; i < N; i++) {
			// 元素按照开始索引分类,自增,以便相同的数据可以填到下一个空位
			aux[count[nums[i] - min]++] = nums[i];
		}
		// 数据回写
		for (int i = 0; i < N; i++) {
			nums[i] = aux[i];
		}
		return nums;
	}

	private static void printArr(int[] nums) {
		System.out.println("基数排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = countingSort(nums);
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
