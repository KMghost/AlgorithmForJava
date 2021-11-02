package 基础排序算法.T03异或;

public class XOR {
    public static void main(String[] args) {
        /*
        * 有一组数，只有一种存在奇数个，求出是哪种数，空间复杂度 B(o)
        * 提示：偶数次异或 = 0
        * 相同内存空间的数值不能使用异或判断。
        * 无进位相加
        * */
        int[] arr = new int[11];
        arr[0] = 3;
        arr[1] = 3;
        arr[2] = 3;
        arr[3] = 3;
        arr[4] = 2;
        arr[5] = 2;
        arr[6] = 2;
        arr[7] = 3;
        arr[8] = 3;
        arr[9] = 3;
        arr[10] = 3;

        int eor = 0;
        for(int a:arr){
            eor ^= a;
        }
        System.out.println(eor);
    }
}
