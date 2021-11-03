package 基础查询算法.T02递归查询;

public class getMax {
    public static int getMax(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    // arr[L...R] 范围上求最大值
    public static int process(int[] arr, int L, int R) {
        if (L == R) { // arr[L...R]范围上只有一个数，直接返回，base case
            return arr[L];
        }
        /*二进制向右移动一位 等同于 除以2*/
        int mid = L + ((R - L) >> 1); // 中点
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr, mid + 1, R);
        return Math.max(leftMax, rightMax);
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

        int max = getMax(arr);
        System.out.println(max);

    }
}
