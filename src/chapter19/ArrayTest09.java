package chapter19;

public class ArrayTest09 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] twoarray = {
                {1,2},
                {3,4},
                {5,6,7,8}
        };
        int[] 我是第1个一位数组 = twoarray[0];

        System.out.println(array.length);
        System.out.println(twoarray.length);
        System.out.println(twoarray[0].length);
        System.out.println(twoarray[0]);
        System.out.println(twoarray[0][1]);
    }

}
