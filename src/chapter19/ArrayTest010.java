package chapter19;

public class ArrayTest010 {
    public static void main(String[] args) {
        int[][] a = {
                {22,11,333},
                {11,44,213},
                {88,55,77,1234}
        };
        int[] 我是第1个一位数组 = a[0];
        int 我是第1个一堆数组中的第一个元素 = 我是第1个一位数组[0];
        System.out.println(我是第1个一堆数组中的第一个元素);

        System.out.println(a[0][0]);
        System.out.println("第二个一维数组中第三个元素:" + a[1][2]);

    }
}
