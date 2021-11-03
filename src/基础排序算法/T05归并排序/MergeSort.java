package 基础排序算法.T05归并排序;

public class MergeSort {
    /*时间复杂度：O(N*logN)，额外空间复杂度O(N)*/
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    public static void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        /*二进制向右移动一位 等同于 除以2*/
        int mid = L + ((R - L) >> 1); // 中点
        process(arr, L, mid);
        process(arr, mid + 1, R);
        /*merge的合并过程：
         * 创建一个虚拟空间
         * 左，右两边数组指针指向最小的数
         * 左右两边进行比较，小的加进去
         * */
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 21;
        arr[1] = 19;
        arr[2] = 23;
        arr[3] = 25;
        arr[4] = 9;
        arr[5] = 6;
        arr[6] = 9;
        arr[7] = 26;
        arr[8] = 19;
        arr[9] = 24;


        mergeSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

}
