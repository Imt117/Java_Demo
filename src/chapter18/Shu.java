package chapter18;

import java.util.Arrays;

public class Shu {
    public static void main(String[] args) {
        int[] arr3=new int[5];
        Arrays.fill(arr3, 10);  //将数组全部填充10
//遍历输出
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        int[] arr4 = {3, 7, 2, 1, 9};
        Arrays.sort(arr4);         //.sort(int[] a)   放入数组名字
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
    }
}
