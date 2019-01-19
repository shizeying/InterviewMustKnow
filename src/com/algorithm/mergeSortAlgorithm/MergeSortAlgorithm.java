package com.algorithm.mergeSortAlgorithm;
/**
 * 
 * @author shizeying
 * @Date 2019-01-19 18:29:27
 * @Description :归并排序
 *
 */
public class MergeSortAlgorithm {

	private static int[] mergeSort(int[] nums) {
		int[] temp = new int[nums.length];// 先建立一个临时数组,避免递归中频繁开辟空间
		sort(nums, 0, nums.length - 1, temp);
		return nums;
	}

	private static void sort(int[] nums, int left, int right, int[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(nums, left, mid, temp);// 左边归并排序，使得左子序列有序
			sort(nums, mid + 1, right, temp);// 右边归并排序，使得右子序列有序
			merge(nums, left, mid, right, temp);

		}

	}

	private static void merge(int[] nums, int left, int mid, int right, int[] temp) {
		int i = left;// 做序列指针
		int j = mid + 1;// 右序列指针
		int t = 0;// 临时数组指针
		while (i <= mid && j <= right) {
			if (nums[i] <= nums[j]) {
				temp[t++] = nums[i++];
			} else {
				temp[t++] = nums[j++];
			}
		}
		while (i <= mid) {// 将左边的剩余元素填充进temp中
			temp[t++] = nums[i++];
		}
		while (j <= right) {// 将右边的剩余元素填充进temp中
			temp[t++] = nums[j++];
		}
		t = 0;
		// 将temp中的元素全部拷贝到原数组中
		while (left <= right) {
			nums[left++] = temp[t++];
		}
	}

	private static void printArr(int[] nums) {
		System.out.println("归并排序前的数组:");

		for (int i : nums) {
			System.out.print(i + "\t");
		}
		int[] newNums = mergeSort(nums);
		System.out.println();
		System.out.println("归并排序后的数组:");
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
