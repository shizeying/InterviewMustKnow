package com.algorithm.bucketSortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shizeying  
 * @Date 2019-01-21 23:55:13  
 * @Description :桶排序
 */
public class BucketSortAlgorithm {

	private static int[] sort(int[] nums) {
		// 建立桶,个数和待排序数组长度一样
		int N = nums.length;
		LinkedList<Integer>[] bucket = (LinkedList<Integer>[]) new LinkedList[N];

		// 待排序数组中的最大值
		int maxValue = Arrays.stream(nums).max().getAsInt();
		// 根据每个元素的值,分配到对应范围的桶中
		for (int i = 0; i < nums.length; i++) {
			int index = toBucketIndex(nums[i], maxValue, N);
			// 没有桶才建立新桶(延时)
			if (bucket[index] == null) {
				bucket[index] = new LinkedList<>();
			}
			// 有桶直接使用
			bucket[index].add(nums[i]);
		}
		// 对每个非空的桶排序,排序后顺便存入临时的list,则list中已经有序
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (bucket[i] != null) {
				Collections.sort(bucket[i]);
				temp.addAll(bucket[i]);
			}
		}
		// 将temp中的数据写入原数组
		for (int i = 0; i < N; i++) {
			nums[i] = temp.get(i);
		}
		return nums;
	}

	private static int toBucketIndex(int value, int maxValue, int N) {
		return (value * N) / (maxValue + 1);
	}

	private static void printArr(int[] nums) {
		System.out.println("基数排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = sort(nums);
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
