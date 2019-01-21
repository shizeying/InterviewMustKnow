# InterviewMustKnow
# 面试准备



## 1.冒泡排序

### 基本思想

​	首先,重复查看所有的数列,一次比较两个元素,如果顺序错误就把他们交换过来.走访数列的工作是重复进行直到没有再需要交换,就是该数列排序完成了.

​	由来:因为越小的元素后经由交换慢慢"浮"到数列的顶端​	

### 

- 比较相邻的元素.如果第一个大于大于的第二个,就交换它们两个;

- 对每一对相邻元素作同样的工作,从开始第一对到结尾最后一对,这样在最后的元素应该会是最大的数

- 针对所有的元素重复以上的步骤,除了最后一个

- 重复步骤1~3,知道排序完成

  

### 动图演示	

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%86%92%E6%B3%A1.gif)

#### 冒泡排序的示例:

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F.png)

​	具体代码如:[BubbleSort](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/bubbleSort/BubbleSort.java)



## **2.快速排序**

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



## 3.选择排序

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

## 4.插入排序

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

## 5.希尔排序

### 算法思想

首先希尔排序也是一种插入排序，是经过简单插入排序经过改进之后的更搞高效大的版本，也称为**缩小量排序**，也是该算法冲破O(n2)的第一批算法之一。

不同：会优先比较距离较远的元素。

**希尔排序是把记录按下表的一定增量分组，对魅族使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，此时算法终止。**

### 算法分析

首先选择增量gap=length/2，缩小增量继续以gap=gap/2的防暑，这种增量选择我们可以用一个序列来表述，**{n/2,(n/2)/2....1}**,称为**增量序列**。

将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述;

- 选择一个增量序列t1，t2，…，tk，其中ti>tj,tk=1;
- 按增量序列个数k，对序列进行k趟排序
- 每趟排序，根据对应的增量ti，将待排序序列分割成若干个长度为m的子序列，分别对各子表进行直接插入排序。仅增量因子为1时，整个序列作为一个表来处理，表长度即为整个序列的长度

### 过程演示

![png](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F.png)

具体代码如下：[SheelSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/sheelSortAlgorithm/SheelSortAlgorithm.java)

## 6.归并排序

### 算法思想：

该算法不受输入数据的影响，但是比选择*好的多*，因为始终都是O(n log n)的事件复杂度。代价：需要额外的内存空间。

该算法采用分治法的一个非常典型的应用。归并排序时**稳定**的排序方法。

将已有的子序列合并，得到完全有序的序列；即先使每个子序列有序。若将两个有序表合并成一个有序表，称为***2-路归并***

### 算法描述

- 将长度为n的输入序列分为两个为n/2的子序列
- 对这两个子序列分别采用归并排序
- 将两个排序好的子序列合并成一个最终的排序序列

### 动图演示

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F.gif)

#### 图示讲解

分支策略（分治法将问题***分(divide)***成一些小的问题然后递归求解，而***治(conquer)***的阶段将分的阶段得到的答案“修补”在一起，即为**分而治之**）

![归并排序1](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F.png)

可以看到这种结构很像一颗完全二叉树。**分**的阶段可以理解为就是递归拆分子序列列的过程，递归深度为log2n。

##### 合并相邻有序子序列

**治**的阶段，需要将两个已经有序的子序列合并成一个有序序列，比如上图中的最后一次合并，要将[4,5,7,8]和[1,2,3,6]两个已经有序的子序列，合并为最后序列[1,2,3,4,5,6,7,8]

![归并排序2](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F2.png)

具体实现：[MergeSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/mergeSortAlgorithm/MergeSortAlgorithm.java)

## 7.堆排序

### 基本思想：

将待排序序列构成一个大顶堆，此时，整个序列的最大值就是堆顶的根节点。将其与末尾元素进行交换，此时末尾就为最大值。然后将剩余n-1个元素重新构成一个堆，这样会得到n个元素的此小值。如此反复，便能得到一个有序序列了

### 堆

堆是具有以下性质的完全二叉树:每个结点的值都大于或等于其左右孩子结点的值,称为***大顶堆***;或者每个结点的值小于或等于其左右孩子结点的值称为小顶堆.

![堆](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F.png)

同时,我们对堆中的结点安层进行编号,将这种逻辑结构映射到数组中就是下面这个样子.



##### 步骤一：构造初始堆。将给定无序序列构成一个大顶堆（一般升序采用大顶堆，降序采用小顶堆）。

a.假定给定无序序列结构如下



b.此时我们从最后一个非叶子节点开始（叶节点自然不用调整，第一个非叶子节点arr.length/2-1=5/2-1=1,也就是下面的6结点），从左至右，从下至上进行调整

![堆排序1](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F2.png)

c.找到第二个非叶节点4，由于[4,9,8]中9元素最大，4和9交换。

![堆排序2](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F3.png)

d.这时，交换导致了子根[4,5,6]结构混乱，继续调整，[4,5,6]中6最大，交换4和6.

此时，我们就将一个无需序列构造成了一个大顶堆





​	









