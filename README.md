# InterviewMustKnow
# 面试准备



[TOC]

##### 十大常见算法分为两类

非线性时间比较类排序：通过比较来决定元素间的相对次序，由于其时间复杂度不能突破O（nlogn），因此称为非线性时间比较类排序。

线性时间非比较类排序：不通过比较来决定元素间的相对次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此称为线性时间非比较类排序。

![分类](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E7%AE%97%E6%B3%95%E5%88%86%E7%B1%BB.png) 

##### 算法时间复杂度

![时间复杂度](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E7%AE%97%E6%B3%95%E5%A4%8D%E6%9D%82%E5%BA%A6.png)

##### 相关概念

```java
稳定：如果一个原本在b前面，而A = B，排序之后一个仍然在b的前面。

不稳定：如果a原本在b的前面，而a = b，排序之后a可能会出现在b的后面。

时间复杂度：对排序数据的总的操作次数反映当Ñ变化时，操作次数呈现什么规律。

空间复杂度：是指算法在计算机内执行时所需存储空间的度量，它也是数据规模Ñ的函数。

```



## 1.冒泡排序

### 基本思想

​	首先,重复查看所有的数列,一次比较两个元素,如果顺序错误就把他们交换过来.走访数列的工作是重复进行直到没有再需要交换,就是该数列排序完成了.

​	由来:因为越小的元素后经由交换慢慢"浮"到数列的顶端​	

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

![堆-1](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F-1.png)

该数组从逻辑上讲就是一个堆结构,用简单的公式对其定义就是:

```java
大顶堆:arr[i] >= arr[2i+1] && arr[i] >= arr[2i+2]
小顶堆:arr[i] <= arr[2i+1] && arr[i] <= arr[2i+2]
```



**步骤一：构造初始堆。将给定无序序列构成一个大顶堆（一般升序采用大顶堆，降序采用小顶堆）。**

a.假定给定无序序列结构如下

![堆排序1](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F2.png)

b.此时我们从最后一个非叶子节点开始（叶节点自然不用调整，第一个非叶子节点arr.length/2-1=5/2-1=1,也就是下面的6结点），从左至右，从下至上进行调整

![堆排序2](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F3.png)

c.找到第二个非叶节点4，由于[4,9,8]中9元素最大，4和9交换。

![堆排序3](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F4.png)

d.这时，交换导致了子根[4,5,6]结构混乱，继续调整，[4,5,6]中6最大，交换4和6.

此时，我们就将一个无需序列构造成了一个大顶堆

![堆排序4](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F5.png)

**步骤二:将堆顶元素与末尾元素进行交换,使末尾元素最大。然后接续调整堆，再将堆元素与末尾元素交换，得到第二大元素。如此反复交换、重建、交换。**

a.将堆顶元素9和末尾元素4进行交换。

![堆排序5](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F6.png)

b.重新调整结构，使其继续满足堆定义

![堆排序6](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F9.png)

c.再将堆顶元素8与末尾元素5进行交换，得到第二大元素8

![堆排序7](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F7.png)

后续过程继续进行调整交换，如此反复，最终使得整个序列有序

![堆排序8](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F8.png)

#### 基本思路

a.将无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆

b.将堆顶元素与末尾元素交换，将最大元素“沉”到数组末端

c.重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+步骤交换，直到整个序列有序。

### 动图演示

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%A0%86%E6%8E%92%E5%BA%8F.gif)

实例如下：[HeapSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/heapSortAlgorithm/HeapSortAlgorithm.java)

## 8.基数排序

### 算法思想

按照地位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高为。

有时候有些属性是有优先级顺序的，先按优先级排序，再按高优先级排序。最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。

### 算法描述

- 取得数组中的最大位，并取得位数；
- arr为原始数组，从最低为开始取每个位组成radix数组
- 堆radix进行计数排序（利用技术排序适用于小范围数的特点）

### 动图演示

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E5%9F%BA%E6%95%B0%E6%8E%92%E5%BA%8F.gif)

实例如下：[CardinalitySortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/baseSortAlgorithm/CardinalitySortAlgorithm.java)

## 9.计数排序

### 基本思想

计数排序不是基于比较的排序算法,其核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。作为一种线性事件复杂度的排序，计数排序要求输入的数据必须时有***确定范围的整数***。

### 算法描述

- 首先会对每个输入进行频率统计，得到元素的频率表；
- 然后将频率表转换为该元素的**开始索引**；
- 根据各个元素的开始索引，将相同的元素分类到临时数组中，
- 最后将临时数组中的元素回写到原数组中。

举个例子，要对`[9, 7, 6, 3, 9, 2, 7, 3, 2, 8]`排序。首先建立频率表，为了尽量节省空间，需要找到待排序数组中最大元素和最小元素，分别是2和9，该区间共有9 - 2 + 1 = 8种可能的值。为此建立一个长度为8 +1的数组，为什么多加1，后面会说到。

于是通过将待排序的元素计数，得到如下频率表。

| 元素 | 频率 |
| :--: | :--: |
|  2   |  2   |
|  3   |  2   |
|  4   |  0   |
|  5   |  0   |
|  6   |  1   |
|  7   |  2   |
|  8   |  1   |
|  9   |  2   |

**每个元素减去最小值再加1**作为索引，使用一个`coun[]`表示上表。比如元素7，减去最小值2等于5，应该存放在count[6]中，按照此规则`count[] = {0, 2, 2, 0, 0, 1, 2, 1, 2}`长度为9，且count[0]始终为0，除开count[0]外后面的数字依次表示了2~9的出现频率。如果想要知道元素7出现了几次，和存入时一样，将**元素减去最小值再加1**作为索引，于是`count[7 - min+1] = count[6] = 2`，7确实是出现了两次的。

接下来由上表得到每个元素的开始索引。

| 元素 |        开始索引         |
| ---- | :---------------------: |
| 2    |            0            |
| 3    |            2            |
| 4    | 4（实际不存在这个元素） |
| 5    | 4（实际不存在这个元素） |
| 6    |            4            |
| 7    |            5            |
| 8    |            7            |
| 9    |            8            |

对于不存在的元素，使用下一个元素的开始索引， 元素2~9对应的开始索引分别为 `{0, 2, 4, 4, 4, 5 ,7, 8}`。元素的开始索引可以通过如下转换得到。

```java
for (int r = 0; r < R; r++) {
    count[r +1] += count[r];
}
```

容易知道**某元素的开始索引恰好是小于它的元素个数**，那么`count[r+1] = count[r+1] + count[r]`，这个式子表达的意思是：**小于当前元素r+1的个数等于上一个元素的个数`（count[r+1]）`与小于上一个元素的个数`（count[r]）`之和**。这样的更新方式保证了count[0]始终等于0（第一个元素的开始索引肯定是0）。现在来说为什么一开始将`count`[]数组的长度多设置1。因为在统计每个元素的频率时count[]将**每个元素减去最小值再加1**作为索引，因此`count`[0]永远也不会被赋值，这保证`count`[0]始终为0，而且使用加1后的索引在进行上面的循环时，转换成开始索引数组能得到正确的结果。**所有加1操作都是为了能得到语义明确的开始索引数组！**

于是通过上面的循环，得到开始索引数组为`count[] = {0, 2, 4, 4, 4, 5 ,7, 8, 10}`，最后一位10是用不到的，它表示的含义是下一个元素（实际不存在）开始的索引。假如想知道元素7的开始索引，只需`count[7-min] = count[7-2] = 5`，就能知到第一个7位于数组索引5的位置。原数组排序后是`[2, 2, 3, 3, 6, 7, 7, 8, 9, 9]`，元素7确实是从数组第5个位置开始的。

利用count[]数组，可以根据每个元素的开始索引，一个个将其填充到临时数组中的对应位置，最后再将临时数组中的数据写回原数组即可。

### 动图演示：

![gif](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E8%AE%A1%E6%95%B0%E6%8E%92%E5%BA%8F.gif)

实例：[CountingSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/countingSortAlgorithm/CountingSortAlgorithm.java)

## 10.桶排序

### 算法思想

桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。**桶排序（Bucket Sort）**的工作原理：假设输入数据服从均匀分布，将数据分到有限数量的桶里，每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排）。

- 根据输入建立适当个数的桶，每个桶可以存放某个范围内的元素。
- 将落在特定范围内的所有元素放入对应的桶中
- 堆每个非空的桶中元素进行排序，可以选择通用的排序方法，如：**插入、快排**
- 按照划分的范围顺序，将桶中的元素依次取出。排序完成

### 图示如下

![png](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%E6%A1%B6%E6%8E%92%E5%BA%8F.png)

例子：

依次取出三个桶中元素，得到序列[0, 2, 3, 70, 72, 75, 80, 88]已经排序完成。

可以用一个数组bucket[]存放各个桶，每个桶用链表表示，用于存放处于同一范围内的元素。上面建立桶的方法是根据输入范围为0~99，建立了10个桶，每个桶可以装入10个元素，这将元素分布得很均匀，**在桶排序中保证元素均匀分布到各个桶尤为关键**。举个反例，有数组`[0, 9, 4, 5, 8, 7, 6, 3, 2, 1]`要排序，它们都是10以下的数，如果还按照上面的范围[0, 10)建立桶，全部的元素将进入同一个桶中，此时桶排序就失去了意义。实际情况我们很可能事先就不知道输入数据是什么，为了保证元素均匀分不到各个桶中，需要建立多少个桶，每个桶的范围是多少呢？为此指定一个简单通用的规则：

假设待排序数组为arr，长度为`arr.length`；任意元素用value表示，其中的最大元素为maxValue

- 建立的桶个数与待排序数组个数相同，这个简单的数字虽然大多数情况下会浪费许多空间（很多桶是空的），但也正因为桶的数量多，也很好地避免了大量元素都装入同一个桶中的情况。
- 对于待排序数组中每个元素，使用如下映射函数将每个元素放到合适的桶中。这相当于每个桶能装的元素个数为`(maxValue + 1) / arr.length`.下式中maxValue加1是为了保证最大元素可以存到数组最后一个位置，即`arr.length - 1`处。

```java
bucketIndex = (value * arr.length) / (maxValue + 1)
```



​	要注意：如何选择桶的个数，以及使用哪个映射函数将元素转换成桶的索引都是不一定的。

**桶排序可以是稳定的**。这取决于我们对每个桶中的元素采取何种排序方法，比如**桶内元素的排序使用快速排序，那么桶排序就是不稳定的；如果使用的是插入排序，桶排序就是稳定的。**

桶排序也不能很好地应对元素值跨度很大的数组。比如[3, 2, 1, 0 ,4, 8, 6, 999]，按照上面的映射规则，999会放入一个桶中，剩下所有元素都放入同一个桶中，在各个桶中元素分布极不均匀，这就失去了桶排序的意义。

桶排序和计数排序有个共同的缺点：耗费大量空间。

再细看桶排序，其实计数排序可以看作是桶排序的一种特例，计数排序相当于将所有相同的元素放入同一个桶中，而桶排序可以将一定范围内的元素都放入同一个桶中；另外，**桶排序的数据结构很像基于拉链法的散列表，只是定义的映射函数不同。桶排序的映射函数将较大值映射成较大的索引，这两者是呈正相关的。而散列表的映射函数得到的哈希值是随意的。**

实例:[BucketSortAlgorithm](https://github.com/fightingWhite/InterviewMustKnow/blob/master/src/com/algorithm/bucketSortAlgorithm/BucketSortAlgorithm.java)











