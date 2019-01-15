# InterviewMustKnow
面试准备

# **快速排序**

## 快速排序的基本思想：

```
     通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，则分别对这两部分继续进行排序，直到整个序列有序。
```

### 快速排序的示例：

a）一趟排序的过程：

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%255CUsers%255Cshizeying%255CAppData%255CRoaming%255CTypora%255Ctypora-user-images%255C1547563256274.png)

（b）排序的全过程

![image](https://github.com/fightingWhite/InterviewMustKnow/blob/master/image/%255CUsers%255Cshizeying%255CAppData%255CRoaming%255CTypora%255Ctypora-user-images%255C1547563422376.png)

把整个序列看做一个数组，**把第零个位置看做中轴**，和最后一个比，如果比它小交换，比它大不做任何处理；交换了以后再和小的那端比，比它小不交换，比他大交换。这样循环往复，一趟排序完成，左边就是比中轴小的，右边就是比中轴大的，然后再用分治法，分别对这两个独立的数组进行排序。

1.查找中轴（最低位作为中轴）所在位置