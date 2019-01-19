package com.algorithm.heapSortAlgorithm;

/**
 * 堆排序
 */
public class HeapSortAlgorithm {
	private static int[] heapSort(int[] nums) {
		
		// 构建大顶堆
		for (int i = nums.length / 2 - 1; i >= 0; i--) {
			// 从第一个非叶子点从下至上,从右至左调整结构
			adjustHeap(nums, i, nums.length);
		}
		// 调整堆结构+交换堆顶元素与末尾元素进行交换
		for (int i = 0; i < nums.length; i++) {
			swap(nums, 0, i);// 将堆顶元素与末尾元素进行交换
			adjustHeap(nums, 0, i);// 重新对堆进行调整
		}
		
		
		return nums;
	}

	/**
	 * 元素交换
	 * 
	 * @param nums
	 * @param i
	 * @param j
	 */
	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	/**
	 * 调整大顶堆(仅是调整过程,建立在大顶堆已构建的基础上)
	 * 
	 * @param nums
	 * @param i
	 * @param length
	 */
	private static void adjustHeap(int[] nums, int i, int length) {
		int temp = nums[i];// 取出当前元素i
		for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {// 从i结点的左子结点开始，也就是2i+1处开始
			if (k + 1 < length && nums[k] < nums[k + 1]) {// 如果左子结点小于右子结点，k指向右子结点
				k++;
			}
			if (nums[k] > temp) {// 如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
				nums[i] = nums[k];
				i = k;
			} else {
				break;
			}
		}
		
		nums[i] = temp;// 将temp放到最终的位置
	}
	
	
	public static void printArr(int[] nums) {
		System.out.println("堆排序前的数组:");
		
		for (int i : nums) {
			System.out.print(i+ "\t");
		}
		
		
		int[] newNums=heapSort(nums);
		
		System.out.println();
		System.out.println("堆排序后的数组:");
		for (int i : newNums) {
			System.out.print(i + "\t");
		}
	}
}
