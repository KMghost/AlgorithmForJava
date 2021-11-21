package 基础排序算法.T07堆排序;

public class HeapSort {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) { // O(N)
            heapInsert(arr, i); // O(logN)
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize); // O(logN)
            swap(arr, 0, --heapSize); // O(1)
        }
    }

    // 增加新数字的时候
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    // 减少数字的时候
    // 某个数在 index 位置，能否往下移动
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1; // 左孩子的下标
        while (left < heapSize) { // 下方还有孩子的时候
            // 两个孩子中，谁的值大，把下标给 largest
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left]
                    ? left + 1 : left;
            // 父和孩子之间，谁的值大，把下标给 largest
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    private static void swap(int[] arr, int i, int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 24, 11, 82, 3, 45, 6, 72, 4};

        heapSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
