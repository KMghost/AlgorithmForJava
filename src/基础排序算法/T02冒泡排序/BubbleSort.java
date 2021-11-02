package 基础排序算法.T02冒泡排序;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int e = i - 1; e >= 0; e--) {
                if (arr[i] > arr[e]) {
                    int tem = arr[i];
                    arr[i] = arr[e];
                    arr[e] = tem;
                }
            }
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


        bubbleSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

}
