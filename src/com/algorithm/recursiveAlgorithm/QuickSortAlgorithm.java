package com.algorithm.recursiveAlgorithm;



/**
  * 快速排序 :三数取中
 * @author shizeying  
 * @Date 2019-01-16 21:14:19
 * @Description 查找中轴（最低位作为中轴）所在位置 
 */
public class QuickSortAlgorithm {

	/**
	 * 
	 * @param nums
	 * @param left  左指针
	 * @param right 右指针
	 */
	private static void quick(int[] nums, int left, int right) {
		if (left < right) {
			// 获取枢纽值,并将其放在当前待处理序列末尾
			dealAxis(nums, left, right);
			// 枢纽值被放在序列末尾
			int axis = right - 1;
			// 左指针
			int l = left;
			// 右指针
			int r = right - 1;
			while (true) {
                while (nums[++l] < nums[axis]) {
                }
                while (r > left && nums[--r] > nums[axis]) {
                }
                if (l < r) {
                    swap(nums, l, r);
                } else {
                    break;
                }
            }
            if (l < right) {
                swap(nums, l, right - 1);
            }
            quick(nums, left, l - 1);
            quick(nums, l + 1, right);
        }
	}

	/**
	 * 元素交换
	 * 
	 * @param nums
	 * @param a
	 * @param b
	 */

	private static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	/**
	 * 处理枢纽值
	 * 
	 * @param nums
	 * @param left
	 * @param right
	 */
	private static void dealAxis(int[] nums, int left, int right) {
		int mid = (left + right) / 2;
        if (nums[left] > nums[mid]) {
            swap(nums, left, mid);
        }
        if (nums[left] > nums[right]) {
            swap(nums, left, right);
        }
        if (nums[right] < nums[mid]) {
            swap(nums, right, mid);
        }
        swap(nums, right - 1, mid);

	}

	private static int[] quickSort(int[] nums) {
		quick(nums, 0, nums.length - 1);
		return nums;
	}

	private static void printArr(int[] nums) {
		System.out.println("基数排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = quickSort(nums);
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
