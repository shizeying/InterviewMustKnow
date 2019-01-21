# InterviewMustKnow
# 面试准备



## 冒泡排序

### 基本思想

​	首先,重复查看所有的数列,一次比较两个元素,如果顺序错误就把他们交换过来.走访数列的工作是重复进行直到没有再需要交换,就是该数列排序完成了.

​	由来:因为越小的元素后经由交换慢慢"浮"到数列的顶端​	

### 描述

- 比较相邻的元素.如果第一个大于大于的第二个,就交换它们两个;

- 对每一对相邻元素作同样的工作,从开始第一对到结尾最后一对,这样在最后的元素应该会是最大的数

- 针对所有的元素重复以上的步骤,除了最后一个

- 重复步骤1~3,知道排序完成

  

### 动图演示	

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%86%92%E6%B3%A1.gif)

#### 冒泡排序的示例:

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F.png)

​	具体代码如:[BubbleSort](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/bubbleSort/BubbleSort.java)



## **快速排序**

### 快速排序的基本思想：

​     通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，则分别对这两部分继续进行排序，整个排序过程可以递归进行,以此达到整个数据变成有序序列

### 动图演示

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F.gif)

### 基本步骤

#### 	三数取中

​		在快排的过程中,每一次我们要取一个元素作为枢纽值,以整个数字将序列划分为两部分.在此采用三数取中法,就是**左端**、**中间**、**右端**三个数,然后进行排序,将**中间数**作为枢纽值

![png](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BF%AB%E6%8E%92(a).png)

**根据枢纽值进行分割**

![png](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BF%AB%E6%8E%92(b).png)

具体代码如下:[QuickSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/recursiveAlgorithm/QuickSortAlgorithm.java)



## 选择排序

### 选择排序基本思想:

​	首先末排序序列中找到最小(大)元素.存放到排序序列的起始位置,然后,在从剩余末排序元素中继续寻找最小(大元素,放到已排序末尾.以此类推,直到所有元素均排序完毕.

### 算法描述

n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果.描述如下:

- 初始状态:无序区为R[1..n],有序区为空;
- 第i趟排序(i=1,2,3..n-1)开始时,当前有序区和无序区分别为R[1..i-1]和R(i..n)。该趟排序从当前无序区中-选出关键字最小的记录R[k],将它与无序区的第1个记录R交换,使R[1..n]和R[i+1..n)分别变为记录个数增加1个的新有序区的记录个数减少1个的新无序区；
- n-1躺结束，数组有序化

### 动图演示

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F.gif)

​	示例:

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F.png)

​	具体代码如下:[SelectSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/selectAlgorithm/SelectSortAlgorithm.java)

## 插入排序

### 基本思想

​		插入排序通过构建有序序列,对于未排序数据，子啊已排序序列中从后向前扫描，找到相应位置并插入。

### 算法分析

​	1.从序列第一个元素开始,该元素可以认为已经被排序

​	2.取出下一个元素,设为待插入元素,在已经排序的元素序列中从后向前扫描,如果该元素(已排序)>待插入元素,将该元素移到下一位置.

​	3.重复步骤2,直到找到已排序的元素<=待排序元素的位置,插入元素

​	4.重复2,3步骤,完成排序

### 动图演示

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F.gif)

排序过程:

​	![png](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E7%9B%B4%E6%8E%A5%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F.png)

具体代码实现如下:[DirectInserSortAlgorithm ](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/directInserSortAlgorithm/DirectInserSortAlgorithm.java)

## 希尔排序

### 算法思想

首先希尔排序也是一种插入排序，是经过简单插入排序经过改进之后的更搞高效大的版本，也称为**缩小量排序**，也是该算法冲破O(n2)的第一批算法之一。

不同：会优先比较距离较远的元素。

==**希尔排序是把记录按下表的一定增量分组，对魅族使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，此时算法终止。**==







