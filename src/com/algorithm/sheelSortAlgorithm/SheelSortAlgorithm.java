package com.algorithm.sheelSortAlgorithm;


/**
 * 希尔排序
 * @author shizeying
 * @Date 2019-01-19 18:01:46
 * @Description 
 *
 * 
 */
public class SheelSortAlgorithm {
	
	private static int[] sheelSort(int[] nums) {
		int length=nums.length;
		while (length!=0) {
			length=length/2;
			for (int i = 0; i < length; i++) {//分组
				for (int j = i+length; j < nums.length; j+=length) {//元素从第二个开始
					//k为有序序列最后一位的位数
					int k=j-length;
					int temp=nums[j];//插入的元素
					while (k>=0&&temp<nums[k]) {//从后向前遍历
						nums[k+length]=nums[k];
						k-=length;//向后移动length位
					}
					nums[k+length]=temp;
				}		
			}
		}
		return nums;
	}
	
	private static void printArr(int[] nums) {
		System.out.println("基数排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = sheelSort(nums);
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
