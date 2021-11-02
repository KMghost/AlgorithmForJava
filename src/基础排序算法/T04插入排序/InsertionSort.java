package 基础排序算法.T04插入排序;

public class InsertionSort {
    /*插入排序：
     * 0~1有序，0~2有序，0~n有序
     * 左边比右边大则交换
     * */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void comparator(int[] arr) {
        if (arr.length < 2 || arr == null) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int Mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                Mini = arr[j] < arr[Mini] ? j : Mini;
            }
            swap(arr, Mini, i);
        }
    }

    public static int[] generateRandomArry(int maxSize, int maxValue) {
        /* Math.random() -> [0,1) 所有的小数，等概率返回一个
         * Math.random() * N -> [0,N) 所有小数，等概率返回一个
         * (int)(Math.random() * N -> [0,N-1] 所有的整数，等概率返回一个)
         * */

        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];  // 长度随机
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;

    }

    private static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    private static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*使用对数器校验算法准确性*/
        int testTime = 10;
        int maxSize = 10;
        int maxValue = 10;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArry(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            insertionSort(arr1);
            comparator(arr2);

            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        /*单条测试*/
//        int[] arr = generateRandomArry(maxSize, maxValue);
//        printArray(arr);
//        insertionSort(arr);
//        printArray(arr);

    }
}
