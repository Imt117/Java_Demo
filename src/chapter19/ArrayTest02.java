package chapter19;

import java.util.Random;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] a =new int[4];
        for(int i =0;i<a.length;i++){
            Random r = new Random();
            int b = r.nextInt(999);
            a[i] = b;
            System.out.println("数组中下标为" + i + "的元素是:" + a[i]);
        }
        for(int i =0;i<a.length;i++){
            System.out.println("数组中下标为" + i + "的元素是:" + a[i]);
        }
        Object[] objs = new Object[3];
        for(int i =0;i<objs.length;i++){
            System.out.println("数组中下标为" + i + "的元素是:" + objs[i]);
        }
    }
}
