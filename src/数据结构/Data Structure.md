# 一、堆（logN）

堆是完全二叉树。

完全二叉树：从左到右依次生成。

大根堆，顶层为最大值。

小根堆，顶层为最小值。

子节点的位置如果不符合大根堆要和父节点进行比较 ( $$\frac{i-1}{2}$$ ) 依次往上换，保证顶部是最大值。

优先级队列结构，就是堆结构。

> 从下到上 heapInsert
>
> 从上到下 heapify

```java
// 增加新数字的时候
public static void heapInsert(int[] arr, int index){
	while(arr[index] > arr[( index - 1 ) / 2 ]){
   	swap(arr, index, (index - 1)/2);
    index = (index - 1)/2;
  }
}
```

```java
// 减少数字的时候
// 某个数在 index 位置，能否往下移动
public static void heapify(int[] arr, int index, int heapSize){
	int left = index * 2 + 1; // 左孩子的下标
  while(left < heapSize){ // 下方还有孩子的时候
    // 两个孩子中，谁的值大，把下标给 largest
    int largest = left + 1 < heapSize && arr[left + 1] > arr[left]
							      ? left + 1 : left;
    // 父和孩子之间，谁的值大，把下标给 largest
    largest = arr[largest] > arr[index] ? largest : index;
    if (largest == index){
      break;
		}
    swap(arr, largest, index);
    index = largest;
    left = index * 2 + 1;
  }
}

```

