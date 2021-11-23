package 基础排序算法.T07堆排序;

import java.util.PriorityQueue;

public class SortedArrDistanceLessK {
    /*
       已知一个几乎有序的数组，几乎有序是指，如果把数组排号顺序的话，每个元素移动的距离可以不超过k，并且k相对于数组来说比较小。
    */
    public static void sortedArrDistanceLessK(int[] arr, int k) {
        // 默认小根堆
        /* 最小值必在 [0,k] 范围内，把 [0,k] 放到最小根堆中，遍历接下来的数组，弹出最小值放到数组中，完成排序*/
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for (; index <= Math.min(arr.length, k); index++) {
            heap.add(arr[index]);
        }
        int i = 0;
        for (; index < arr.length; i++, index++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()) {
            arr[i++] = heap.poll();
        }
    }

    public static void main(String[] args) {
//       =============================================================================================
//        PriorityQueue<Integer> heap = new PriorityQueue<>();
//
//        heap.add(8);
//        heap.add(4);
//        heap.add(4);
//        heap.add(9);
//        heap.add(10);
//        heap.add(3);
//
//        while (!heap.isEmpty()) {
//            System.out.println(heap.poll());
//        }

//      =============================================================================================
        int[] arr = new int[]{7, 4, 3, 72, 65, 11, 34, 66, 32};
//                              3  4  7  11  32  34  65  66  72
        sortedArrDistanceLessK(arr, 3);
        for (int a : arr) {
            System.out.println(a);
        }
    }
};
