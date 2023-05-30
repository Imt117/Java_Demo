package chapter19;

import java.util.ArrayList;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] a1 = {133,135,111,130};
        System.out.println(a1.length);
        System.out.println(a1[0]);
        System.out.println(a1[a1.length-1]);
        a1[0] = 111;
        a1[a1.length-1] = 0;
        System.out.println(a1[0]);
        System.out.println(a1[a1.length-1]);
        int a = 0;
        for (int i = 0;i<a1.length;i++){
            a++;
            System.out.println("数组中的第" + a + "个元素的值是:" + a1[i]);

        }
        a = 5;
        for (int i = a1.length-1;i>=0;i--){
            a--;
            System.out.println("数组中的第" + a + "个元素的值是:" + a1[i]);

        }
    }
}
