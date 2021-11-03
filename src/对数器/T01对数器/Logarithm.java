package 对数器.T01对数器;

public class Logarithm {
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

    public static void main(String[] args) {
        int maxSize = 10;
        int maxValue = 10;
        int[] randomArry = generateRandomArry(maxSize, maxValue);
        for (int a : randomArry) {
            System.out.println(a);
        }
    }
}
