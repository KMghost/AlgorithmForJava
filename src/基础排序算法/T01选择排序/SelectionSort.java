package 基础排序算法.T01选择排序;

public class SelectionSort {
    /*选择排序：
    * 选择排序和冒泡排序的区别，选择排序交换的频率会比冒泡排序少
    * 思想：
    *   找出最小或最大值用一个变量存起来，每次遍历数组完后交换对应位置
    * */
    public static void selectionSort(int[] arr) {
        if (arr.length < 2 || arr == null) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int Mini = i;
            for (int j = i + 1; j < arr.length;j++){
                Mini = arr[j] < arr[Mini] ? j: Mini;
            }
            swap(arr,Mini,i);
        }
    }
    public static void swap(int[] arr,int Mini, int i){
        int temp = arr[i];
        arr[i] = arr[Mini];
        arr[Mini] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 32;
        arr[1] = 19;
        arr[2] = 23;
        arr[3] = 25;
        arr[4] = 9;
        arr[5] = 6;
        arr[6] = 9;
        arr[7] = 26;
        arr[8] = 19;
        arr[9] = 24;

        selectionSort(arr);
        for(int a:arr) {
            System.out.println(a);
        }
    }
}
