package chapter19;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        printArray(x);
        String[] stringArray = {"邢栋","爱吃","粑粑","答辩"};
        printArray(stringArray);
        String[] strArray = new String[10];
        printArray(strArray);
    }


    public static void printArray(int[] array) {
        for (int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void printArray(String[] args) {
        for (int i = 0;i< args.length;i++){
            System.out.println(args[i]);
        }
    }
}

