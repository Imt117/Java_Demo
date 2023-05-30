package chapter19;

public class ArrayTest05 {
    public static void main(String[] args) {
        System.out.println("JVM给传递过来的String数组参数,它这个数组的长度是:" + args.length);
        for (int i = 0;i < args.length;i++){
            System.out.println(args[i]);
        }
    }

    public static void printLength(String[] args) {
        System.out.println(args.length);
    }
}
