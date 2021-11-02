package 基础查询算法.二分查询法;

public class TwoPointSelect {
    public static void twoPointSelect(int[] arr, int num) {
        /*二分排序法：
         *   针对有序数组 或 特殊情况数组
         *   算法的思路：1.数据状况，2.问题标准
         * */
        int hight = arr.length;    // 记录最大数字的下标
        int low = 0;                // 记录最小数据的下标
        int middle;                 // 记录中间位置
        int time = 0;
        int oldHight = 0,oldLow =0;

        while (true) {
            middle = (low + hight) / 2;

            time++;

            if (arr[middle] > num) {
                hight = middle;
            }else if(arr[middle] < num){
                low = middle;
            }else {
                System.out.println(arr[middle]+" "+middle+" "+time);
                return ;
            }

            if (oldHight == hight && oldLow == low) {
                System.out.println("can't find");
                return;
            }
            oldHight = hight;
            oldLow = low;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        for (int i = 0; i <= 10; i++) {
            System.out.println("i: "+i);
            twoPointSelect(arr,i);
        }


    }
}
