# InterviewMustKnow
# 面试准备



## 冒泡排序

​	首先,重复查看所有的数列,一次比较两个元素,如果顺序错误就把他们交换过来.走访数列的工作是重复进行直到没有再需要交换,就是该数列排序完成了.

​	由来:因为越小的元素后经由交换慢慢"浮"到数列的顶端

#### 冒泡排序的示例:

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F.png)

​	具体代码如:[BubbleSort](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/bubbleSort/BubbleSort.java)



## **快速排序**

### 快速排序的基本思想：

```
     通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，则分别对这两部分继续进行排序，直到整个序列有序。
```

#### 快速排序的示例：

a）一趟排序的过程：

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BF%AB%E6%8E%92(a).png)

（b）排序的全过程

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BF%AB%E6%8E%92(b).png)

把整个序列看做一个数组，**把第零个位置看做中轴**，和最后一个比，如果比它小交换，比它大不做任何处理；交换了以后再和小的那端比，比它小不交换，比他大交换。这样循环往复，一趟排序完成，左边就是比中轴小的，右边就是比中轴大的，然后再用分治法，分别对这两个独立的数组进行排序。

具体代码如下:[QuickSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/recursiveAlgorithm/QuickSortAlgorithm.java)

***分析结论:***

​	**快排**通常为(O(nlog2n))的排序方法中平均性能最好的.但初始序列按关键码有序或基本有序是,**快排**就会变为**冒泡排序**.所以通常用"三者取中法"来选取基准记录,即将排序曲边的两个端点与重点三个记录关键码居中的调整为支点记录.

​	**缺点**:是一个不稳点的排序方法

## 选择排序

### 选择排序基本思想:

​	给定数组int[] nums={n个数据};第一趟排序,在待排序num[1]-->nums[n]中选出最小的数据,将它与nums[1]交换;在第2躺,在待排序数据num[2]-->nums[n]中选出最小的数据,将它与nums[2]交换;以此类推,第i躺在待排序数据nums[i]-->nums[n]中选出最小的数据,将它与nums[i]交换,直到全部排序完成

​	选择排序全过程:

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F.png)

​	具体代码如下:[SelectSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/selectAlgorithm/SelectSortAlgorithm.java)

## 插入排序

### 基本思想

​		插入排序通过构建有序序列,对于位置序列,在已排序序列中从后向前扫描,找到相应位置并插入,如此重复,直至完成序列排序.

### 算法分析

​	1.从序列第一个元素开始,该元素可以认为已经被排序

​	2.取出下一个元素,设为待插入元素,在已经排序的元素序列中从后向前扫描,如果该元素(已排序)>待插入元素,将该元素移到下一位置.

​	3.重复步骤2,直到找到已排序的元素<=待排序元素的位置,插入元素

​	4.重复2,3步骤,完成排序

排序过程:

​	

如图:

1. 默认序列第一个12已经被排序

2. 取下一个元素15从后往前与已排序序列一次比较,15插入12后,已排列序列为[12,15]

3. 取下一个元素9,重复2步骤,将9插入12之前,已排序序列为[9,12,15]

4. 循环上述操作,直至最后一个元素24,插入合适位置,完成排序.

   具体代码实现如下: