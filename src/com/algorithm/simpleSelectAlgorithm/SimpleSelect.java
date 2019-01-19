package com.algorithm.simpleSelectAlgorithm;

/** 
 * @author shizeying  
 * @Date 2019-01-18 07:54:18  
 * @Description :简单选择排序  *
 */
public class SimpleSelect {

	/**
	 * 1.确认循环次数,并记住当前数字和当前位置. 2.将当前位置后面所有的数与当前数字进行对比,小数赋值给key,并记住小数的位置
	 * 3.比对完成后,将最小的值与第一个数的值交换
	 * 
	 * @param nums
	 * @return
	 */
	private static int[] selectSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {// 循环nums.length次
			int value = nums[i];
			int postition = i;
			for (int j = i + 1; j < nums.length; j++) {// 找到最小值和位置
				if (nums[j] < value) {
					value = nums[j];
					postition = j;

				}
			}
			// 交换
			nums[postition] = nums[i];
			nums[i] = value;
		}
		return nums;
	}

	public static void printArr(int[] nums) {
		System.out.println("希尔排序前的数组:");
		for (int i : nums) {
			System.out.print(i + "\t");
		}
		long newTimeStart=System.currentTimeMillis();
		int[] newNums = selectSort(nums);
		long newTimeEnd=System.currentTimeMillis();
		long time=newTimeEnd-newTimeStart;
		System.out.println("所用时间:"+time);
		System.out.println();
		System.out.println("希尔排序后的数组:");
		for (int i : newNums) {
			System.out.print(i + "\t");
		}
	}

	

}
