package com.algorithm.baseSortAlgorithm;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author shizeying
 * @Date 2019-01-20 00:13:09
 * @Description : 基数排列
 */
public class CardinalitySortAlgorithm {
	private static int[] cardinalitySort(int[] nums) {
		int max = nums[0];// 获取最大值
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];

			}
		}
		// 根据最大值确定排序的遍数(如:369三位数,3)
		int time = 0;
		while (max > 0) {
			max = max / 10;
			time++;
		}
		// 建立一个主队列,包含10个子队列
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for (int j = 0; j < 10; j++) {
			ArrayList<Integer> subQueue = new ArrayList<Integer>();
			queue.add(subQueue);
		}
		// time次排序
		for (int i = 0; i < time; i++) {
			int c = nums[i] % (int) Math.pow(10, i + 1);// 当前位上的数字
			int x = c / (int) Math.pow(10, i);// 子队列的序号
			ArrayList<Integer> subQueue = queue.get(x);// 从父队列获取子队列
			subQueue.add(nums[i]);
			queue.set(x, subQueue);
		}
		// 分配结束后,记录新的顺序
		int k = 0;
		for (int n = 0; n < 10; n++) {
			// 取出有元素的子队列
			while (queue.get(n).size() > 0) {
				ArrayList<Integer> subQueue = queue.get(n);
				nums[k++] = subQueue.get(0);// 头部元素
				subQueue.remove(0);// 移除元素
			}
		}
		return nums;
	}

	private static void printArr(int[] nums) {
		System.out.println("基数排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = cardinalitySort(nums);
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
