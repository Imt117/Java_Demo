package chapter19;

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        printArray(a);
        int[] a2 = new int[4];
        printArray(a2);
        System.out.println("-----------------");
        printArray(new int[3]);
        printArray(new int[]{4,666,222});
    }
    public static void printArray(int[] array) {
        for (int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
