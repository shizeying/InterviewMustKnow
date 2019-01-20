package com.algorithm.directInserSortAlgorithm;
/**
 * 直接插入排序
 * @author shizeying
 * @Date 2019-01-17 23:06:21
 * @Description 
 *
 */
public class DirectInserSortAlgorithm {

	/**
	 * 特点:
	 * 		稳定排序
	 * 		算法简便、容易实现
	 * 		可适用于链式存储结构
	 * 		更适合初识记录基本有序(正序),当初识记录无序,n,较大时,此算法时间复杂度较高,不易使用
	 * @param nums
	 * @return
	 */
	private static int[] insertSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int insertNum = nums[i];
			// 序列元素个数
			int j = i - 1;
			// 从后往前循环,将大于insertNum的数向后移动
			while (j >= 0 && nums[j] > insertNum) {
				nums[j + 1] = nums[j];
				j--;
			}
			// 找到位置,插入当前元素
			nums[j + 1] = insertNum;

		}
		return nums;
	}

	private static void printArr(int[] nums) {
		System.out.println("直接插入排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = insertSort(nums);
		System.out.println();
		System.out.println("直接插入排序后的数组:");
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
