package chapter16;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        MyMath mm = new MyMathImpl();
        int result1 = mm.sub(1,2);
        System.out.println(result1);
        int result2 = mm.sum(2,4);
        System.out.println(result2);
    }
}
interface MyMath{
    double pi = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}
class MyMathImpl implements MyMath{
    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
