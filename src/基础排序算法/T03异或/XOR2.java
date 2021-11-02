package 基础排序算法.T03异或;

public class XOR2 {
    public static void main(String[] args) {
        /*
         * 有一组数，有两种存在奇数个，求出是哪种数
         * */
        int[] arr = new int[10];
        arr[0] = 20;
        arr[1] = 20;
        arr[2] = 20;
        arr[3] = 20;
        arr[4] = 8;
        arr[5] = 8;
        arr[6] = 8;
        arr[7] = 12;
        arr[8] = 12;
        arr[9] = 12;

        int eor = 0;
        for (int cur : arr) {
            eor ^= cur;
        }
        // eor = a ^ b
        // eor != 0
        // eor 必然有一个位置上是 1
        int rightOne = eor & (~eor + 1);

        int OnlyOne = 0; // eor'
        for(int cur:arr){
            if ((cur & rightOne) == 0){
                OnlyOne ^= cur;
            }
        }
        System.out.println(OnlyOne + " " + (OnlyOne ^ rightOne ));
    }
}
